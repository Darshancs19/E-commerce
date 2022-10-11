<%-- Document : product Created on : 10 Oct, 2021, 1:53:56 PM Author : Admin
--%> <%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="nav.jsp" %>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>JSP Page</title>
    <link rel="stylesheet" href="css/home.css" />
    <link rel="stylesheet" href="css/footer.css" />
    <link rel="stylesheet" href="css/product.css" />
    <script src="js/main.js"></script>
    <script src="js/nav.js"></script>
    <script src="js/footer.js"></script>
    <script src="js/home.js"></script>
    <script src="js/product.js"></script>
  </head>
  <body>
    
    <section class="product-details">
      <div class="image-slider">
        <div class="product-images">
          <img src="css/img/milkman-set.jpg" class="active" alt="" />
          <img src="css/img/mrlinkcolor.jpg" alt="" />
          <img src="css/img/milkman.jpg" alt="" />
          <img src="css/img/milkman-vehicle.jpg" alt="" />
        </div>
      </div>

      <div class="details">
        <h2 class="product-brand">Milk Type</h2>
        <p class="product-short-des">Quality</p>
        <span class="product-price">$99</span>
        <span class="product-actual-price">$200</span>
        <span class="product-discount">( 50% off )</span>

        <p class="product-sub-heading">select Amount</p>

        <input type="radio" name="size" value="1" checked hidden id="1-ltr" />
        <label for="1-ltr" class="size-radio-btn check">1-ltr</label>
        <input type="radio" name="size" value="2" hidden id="2-ltr" />
        <label for="2-ltr" class="size-radio-btn">2-ltr</label>
        <input type="radio" name="size" value="3" hidden id="3-ltr" />
        <label for="3-ltr" class="size-radio-btn">3-ltr</label>
        <input type="radio" name="size" value="4" hidden id="4-ltr" />
        <label for="4-ltr" class="size-radio-btn">4-ltr</label>
        <input type="radio" name="size" value="5" hidden id="5-ltr" />
        <label for="5-ltr" class="size-radio-btn">5-ltr</label>

        <button class="btn cart-btn">add to cart</button>
        <button class="btn">add to wishlist</button>
      </div>
    </section>
    <footer>
      <div class="footer-content">
        <img src="css/img/Logo-removebg-preview.png" class="logo" alt="" />

        <div class="footer-ul-container">
          <ul class="category">
            <li class="category-title">Products</li>
            <li><a href="#" class="footer-link">Milk Product 1</a></li>
            <li><a href="#" class="footer-link">Milk Product 2</a></li>
            <li><a href="#" class="footer-link">Milk Product 3</a></li>
            <li><a href="#" class="footer-link">Milk Product 4</a></li>
            <li><a href="#" class="footer-link">Milk Product 5</a></li>
            <li><a href="#" class="footer-link">Milk Product 6</a></li>
            <li><a href="#" class="footer-link">Milk Product 7</a></li>
            <li><a href="#" class="footer-link">Milk Product 8</a></li>
            <li><a href="#" class="footer-link">Milk Product 9</a></li>
            <li><a href="#" class="footer-link">Milk Product 10</a></li>
          </ul>
        </div>
      </div>

      <p class="footer-title">about company</p>
      <p class="info">
        support emails - help@mrmilkman.com, customersupport@mrmilkman.com
      </p>
      <p class="info">telephone - 1800 000001, 180 0000002</p>
      <div class="footer-social-container">
        <div>
          <a href="#" class="social-link">terms & services</a>
          <a href="#" class="social-link">privacy page</a>
        </div>
        <div>
          <a href="#" class="social-link">instagram</a>
          <a href="#" class="social-link">facebook</a>
          <a href="#" class="social-link">twitter</a>
        </div>
      </div>
      <p class="footer-credit">MrMilkman, Best online store for milk</p>
    </footer>
  </body>
</html>
