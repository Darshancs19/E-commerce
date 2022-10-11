

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<script language="javascript">
            window.history.forward();
</script>

          <%
             if(session.isNew())
                response.sendRedirect("index.jsp");
          %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>

    <nav class="navbar">
      <div class="nav">
          <a href="./home.jsp"><img src="css/img/Logo.png" class="brand-logo" alt="" /></a>
        <div class="nav-items">
          <div class="search">
            <input
              type="text"
              class="search-box"
              placeholder="search product"
            />
            <button class="search-btn" id="search-btn"><a href="Search.jsp" style="color: #fff; text-decoration: none;">search</a></button>
          </div>
            <a href="#"><img src="css/img/user.png" alt="" /></a>
          <a href="#"><img src="css/img/cart.png" alt="" /></a>
          <A href="signout.jsp">signout</A> 
        </div>
      </div>

      <ul class="links-container">
        <li class="link-item"><a href="#" class="link">Dairy</a></li>
        <li class="link-item"><a href="#" class="link">Farmer</a></li>
        <li class="link-item"><a href="#" class="link">Products</a></li>
      </ul>
    </nav>
    </body>
</html>