<%-- Document : addProduct Created on : 12 Oct, 2021, 1:23:07 AM Author : Admin
--%> <%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <!--other head tags-->
    <link rel="stylesheet" href="css/addProduct.css" />
    <script src="js/main.js"></script>
  </head>

  <body>
        <img src="img/loader.gif" class="loader" alt="">

    <div class="alert-box">
        <img src="img/error.png" class="alert-img" alt="">
        <p class="alert-msg"></p>
    </div>
    <img src="css/img/dark-Logo.png" class="logo" alt="" />
    <a href="home.jsp" >Home</a>
    <div class="form">
      <input
        type="text"
        class="product-name"
        id="product-name"
        placeholder="product name"
      />
      <input
        type="text"
        class="product-name"
        id="short-des"
        placeholder="short line about the product"
      />
      <textarea id="des" placeholder="detail description"></textarea>

      <!-- product image -->
      <div class="product-info">
        <div class="product-image"><p class="text">product image</p></div>
        <div class="upload-image-sec">
          <!-- upload inputs -->
          <p class="text">
            <img src="css/img/cow-logo.jpg" alt="" />upload image
          </p>
          <div class="upload-catalouge">
            <input
              type="file"
              class="fileupload"
              id="first-file-upload-btn"
              hidden
            />
            <label for="first-file-upload-btn" class="upload-image"></label>
            <input
              type="file"
              class="fileupload"
              id="second-file-upload-btn"
              hidden
            />
            <label for="second-file-upload-btn" class="upload-image"></label>
            <input
              type="file"
              class="fileupload"
              id="third-file-upload-btn"
              hidden
            />
            <label for="third-file-upload-btn" class="upload-image"></label>
            <input
              type="file"
              class="fileupload"
              id="fourth-file-upload-btn"
              hidden
            />
            <label for="fourth-file-upload-btn" class="upload-image"></label>
          </div>
        </div>
        <div class="select-sizes">
          <p class="text">Milk Available</p>
          <div class="sizes">
            <input type="checkbox" class="size-checkbox" id="xs" value="Cow" />
            <input type="checkbox" class="size-checkbox" id="s" value="Goat" />
            <input type="checkbox" class="size-checkbox" id="m" value="Sheep" />
            <input type="checkbox" class="size-checkbox" id="l" value="Buffalo" />
          </div>
        </div>
      </div>

      <div class="product-price">
        <input
          type="number"
          class="actual-price"
          id="actual-price"
          placeholder="actual price"
        />
        <input
          type="number"
          class="discount"
          id="discount"
          placeholder="discount percentage"
        />
        <input
          type="number"
          class="sell-price"
          id="sell-price"
          placeholder="selling price"
        />
      </div>

      <input
        type="number"
        id="stock"
        min="20"
        placeholder="item in stocks (minimum 20)"
      />

      <textarea
        id="tags"
        placeholder="Enter categories here"
      ></textarea>

      <input type="checkbox" class="checkbox" id="tac" checked />
      <label for="tac">Dairy Products take 30% from your total sell</label>

      <div class="buttons">
        <button class="btn" id="add-btn">add product</button>
        <button class="btn" id="save-btn">save draft</button>
      </div>
    </div>
    <script src="js/addProduct.js"></script>
  </body>
</html>
