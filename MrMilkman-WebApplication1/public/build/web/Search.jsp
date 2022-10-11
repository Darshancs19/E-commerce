<%-- Document : Search Created on : 10 Oct, 2021, 2:22:08 PM Author : Admin --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>JSP Page</title>
    <link rel="stylesheet" href="css/home.css" />
    <link rel="stylesheet" href="css/footer.css" />
    <link rel="stylesheet" href="css/search.css" />
    <script src="js/main.js"></script>
    <script src="js/nav.js"></script>
    <script src="js/footer.js"></script>
  </head>

  <body>
    <section class="search-results">
        
      <h2 class="heading"><a href="home.jsp">Home</a><br>search results for <span>product </span></h2>
      
    </section>
      
    <div class="product-container" id="product-container">
      <div class="product-card">
        <div class="product-image">
          <span class="discount-tag">50% off</span>
          <img src="css/img/milk-cow-cute.jpg" class="product-thumb" alt="" />
          <button class="card-btn">  <a href="product.jsp">add to wishlist</a></button>
        </div>
        <div class="product-info">
          <h2 class="product-brand">brand</h2>
          <p class="product-short-des">a short line about the cloth..</p>
          <span class="price">$20</span><span class="actual-price">$40</span>
        </div>
      </div>

      <div class="product-card">
        <div class="product-image">
          <span class="discount-tag">50% off</span>
          <img src="css/img/mrlinkcolor.jpg" class="product-thumb" alt="" />
          <button class="card-btn">  <a href="product.jsp">add to wishlist</a></button>
        </div>
        <div class="product-info">
          <h2 class="product-brand">brand</h2>
          <p class="product-short-des">a short line about the cloth..</p>
          <span class="price">$20</span><span class="actual-price">$40</span>
        </div>
      </div>

      <div class="product-card">
        <div class="product-image">
          <span class="discount-tag">50% off</span>
          <img src="css/img/milkman.jpg" class="product-thumb" alt="" />
          <button class="card-btn">  <a href="product.jsp">add to wishlist</a></button>
        </div>
        <div class="product-info">
          <h2 class="product-brand">brand</h2>
          <p class="product-short-des">a short line about the cloth..</p>
          <span class="price">$20</span><span class="actual-price">$40</span>
        </div>
      </div>

      <div class="product-card">
        <div class="product-image">
          <span class="discount-tag">50% off</span>
          <img src="css/img/milkman-vehicle.jpg" class="product-thumb" alt="" />
          <button class="card-btn">  <a href="product.jsp">add to wishlist</a></button>
        </div>
        <div class="product-info">
          <h2 class="product-brand">brand</h2>
          <p class="product-short-des">a short line about the cloth..</p>
          <span class="price">$20</span><span class="actual-price">$40</span>
        </div>
      </div>

      <div class="product-card">
        <div class="product-image">
          <span class="discount-tag">50% off</span>
          <img
            src="css/img/milkman-stock-illustration.jpg"
            class="product-thumb"
            alt=""
          />
          <button class="card-btn">  <a href="product.jsp">add to wishlist</a></button>
        </div>
        <div class="product-info">
          <h2 class="product-brand">brand</h2>
          <p class="product-short-des">a short line about the cloth..</p>
          <span class="price">$20</span><span class="actual-price">$40</span>
        </div>
      </div>

      <div class="product-card">
        <div class="product-image">
          <span class="discount-tag">50% off</span>
          <img src="css/img/milkman-set.jpg" class="product-thumb" alt="" />
          <button class="card-btn">  <a href="product.jsp">add to wishlist</a></button>
        </div>
        <div class="product-info">
          <h2 class="product-brand">brand</h2>
          <p class="product-short-des">a short line about the cloth..</p>
          <span class="price">$20</span><span class="actual-price">$40</span>
        </div>
      </div>
    </div>

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
      <p class="info">telephone - 180 00 00 001, 180 00 00 002</p>
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
