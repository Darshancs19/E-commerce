<%@include file="nav.jsp" %>
<%@page import="Dao.RegisterDao" %> <%@page import="Model.Register" %> <%
RegisterDao rd = new RegisterDao(); Register R; %> 
<%@page session="true" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>JSP Page</title>
    <link rel="stylesheet" href="css/home.css" />
    <script src="js/main.js"></script>
  </head>
  <body>
      
    <header class="hero-section">
      <div class="content">
        <img src="css/img/milk_1572.jpg" class="logo" alt="" />
        <p class="sub-heading">Strength of every family</p>
      </div>
    </header>

    <section class="product">
      <h2 class="product-category">Fresh selling</h2>

      <button class="pre-btn" id="pre-btn">
        <img src="css/img/arrow.png" alt="" />
      </button>
      <button class="nxt-btn" id="nxt-btn">
        <img src="css/img/arrow.png" alt="" />
      </button>

      <!--    // inside product section.-->
      <div class="product-container" id="product-container">
        <div class="product-card">
          <div class="product-image">
            <span class="discount-tag">50% off</span>
            <img
              src="css/img/FSSAI-Issues-Draft-Notification-Related-to-Certain-Milk-and-Milk-Products-Copy-300x150.jpg"
              class="product-thumb"
              alt=""
            />
            <button class="card-btn">
              <a href="product.jsp">add to wishlist</a>
            </button>
          </div>
          <div class="product-info">
            <h2 class="product-brand">brand</h2>
            <p class="product-short-des">About You</p>
            <span class="price">$20</span><span class="actual-price">$40</span>
          </div>
        </div>

        <div class="product-card">
          <div class="product-image">
            <span class="discount-tag">50% off</span>
            <img src="css/img/milkman-can.jpg" class="product-thumb" alt="" />
            <button class="card-btn">
              <a href="product.jsp">add to wishlist</a>
            </button>
          </div>
          <div class="product-info">
            <h2 class="product-brand">brand</h2>
            <p class="product-short-des">About You</p>
            <span class="price">$20</span><span class="actual-price">$40</span>
          </div>
        </div>

        <div class="product-card">
          <div class="product-image">
            <span class="discount-tag">50% off</span>
            <img src="css/img/milkman.jpg" class="product-thumb" alt="" />
            <button class="card-btn">
              <a href="product.jsp">add to wishlist</a>
            </button>
          </div>
          <div class="product-info">
            <h2 class="product-brand">brand</h2>
            <p class="product-short-des">About You</p>
            <span class="price">$20</span><span class="actual-price">$40</span>
          </div>
        </div>

        <div class="product-card">
          <div class="product-image">
            <span class="discount-tag">50% off</span>
            <img
                src="css/img/FSSAI-Issues-Draft-Notification-Related-to-Certain-Milk-and-Milk-Products-Copy-300x150.jpg"
              class="product-thumb"
              alt=""
            />
            <button class="card-btn">
              <a href="product.jsp">add to wishlist</a>
            </button>
          </div>
          <div class="product-info">
            <h2 class="product-brand">brand</h2>
            <p class="product-short-des">About You</p>
            <span class="price">$20</span><span class="actual-price">$40</span>
          </div>
        </div>

        <div class="product-card">
          <div class="product-image">
            <span class="discount-tag">50% off</span>
            <img src="css/img/cow-logo.jpg" class="product-thumb" alt="" />
            <button class="card-btn">
              <a href="product.jsp">add to wishlist</a>
            </button>
          </div>
          <div class="product-info">
            <h2 class="product-brand">brand</h2>
            <p class="product-short-des">About You</p>
            <span class="price">$20</span><span class="actual-price">$40</span>
          </div>
        </div>

        <div class="product-card">
          <div class="product-image">
            <span class="discount-tag">50% off</span>
            <img src="css/img/cow-icon.jpg" class="product-thumb" alt="" />
            <button class="card-btn">
              <a href="product.jsp">add to wishlist</a></button
            >>
          </div>
          <div class="product-info">
            <h2 class="product-brand">brand</h2>
            <p class="product-short-des">About You</p>
            <span class="price">$20</span><span class="actual-price">$40</span>
          </div>
        </div>
      </div>
    </section>

    <!-- collections -->
    <section class="collection-container">
      
        <a href="addProduct.jsp" class="collection">
        <img src="css/img/cow-icon.jpg" alt="" />
        <p class="collection-title">Dairy 2</p>
      </a>
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

    <script src="js/footer.js"></script>
    <script src="js/nav.js"></script>
    <script src="js/home.js"></script>
  </body>
</html>
