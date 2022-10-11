const express = require("express");
const admin = require("firebase-admin");
const bcrypt = require("bcrypt");
const path = require("path");

// declare static path
let staticPath = path.join(__dirname, "public");

//intializing express.js
const app = express();

//middlewares
app.use(express.static(staticPath));

app.listen(3000, () => {
  console.log("listening on port 3000.......");
});

//routes
//home route
app.get("/", (req, res) => {
  res.sendFile(path.join(staticPath, "web/index.jsp"));
});

// 404 route
app.get("/404", (req, res) => {
  res.sendFile(path.join(staticPath, "web/404.jsp"));
});

app.use((req, res) => {
  res.redirect("/404");
});

//signup route
app.get("/signup", (req, res) => {
  res.sendFile(path.join(staticPath, "web/signup.jsp"));
});

app.get("/add-product", (req, res) => {
  res.sendFile(path.join(staticPath, "addProduct.jsp"));
});

// aws config
const aws = require("aws-sdk");
const dotenv = require("dotenv");

dotenv.config();

// aws parameters
const region = "ap-south-1";
const bucketName = "ecom-website-tutorial-2";
const accessKeyId = process.env.AWS_ACCESS_KEY;
const secretAccessKey = process.env.AWS_SECRET_KEY;

aws.config.update({
  region,
  accessKeyId,
  secretAccessKey,
});

// init s3
const s3 = new aws.S3();

// generate image upload link
async function generateUrl() {
  let date = new Date();
  let id = parseInt(Math.random() * 10000000000);

  const imageName = `${id}${date.getTime()}.jpg`;

  const params = {
    Bucket: bucketName,
    Key: imageName,
    Expires: 300, //300 ms
    ContentType: "image/jpeg",
  };
  const uploadUrl = await s3.getSignedUrlPromise("putObject", params);
  return uploadUrl;
}

// get the upload link
app.get("/s3url", (req, res) => {
  generateUrl().then((url) => res.json(url));
});

// add product
app.post('/add-product', (req, res) => {
  let { name, shortDes, des, images, sizes, actualPrice, discount, sellPrice, stock, tags, tac, email } = req.body;

  // validation
  if(!draft){
      if(!name.length){
          return res.json({'alert': 'enter product name'});
      } else if(shortDes.length > 100 || shortDes.length < 10){
          return res.json({'alert': 'short description must be between 10 to 100 letters long'});
      } else if(!des.length){
          return res.json({'alert': 'enter detail description about the product'});
      } else if(!images.length){ // image link array
          return res.json({'alert': 'upload atleast one product image'})
      } else if(!sizes.length){ // size array
          return res.json({'alert': 'select at least one size'});
      } else if(!actualPrice.length || !discount.length || !sellPrice.length){
          return res.json({'alert': 'you must add pricings'});
      } else if(stock < 20){
          return res.json({'alert': 'you should have at least 20 items in stock'});
      } else if(!tags.length){
          return res.json({'alert': 'enter few tags to help ranking your product in search'});
      } else if(!tac){
          return res.json({'alert': 'you must agree to our terms and conditions'});
      } 
  }

  // add product
  let docName = `${name.toLowerCase()}-${Math.floor(Math.random() * 5000)};
  db.collection('products').doc(docName).set(req.body)
  .then(data => {
      res.json({'product': name});
  })
  .catch(err => {
      return res.json({'alert': 'some error occurred. Try again'});
  })
})