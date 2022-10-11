<%@page import="org.apache.catalina.startup.HomesUserDatabase"%>
<%@page session="true" %>
<%@page import="Dao.RegisterDao" %>
<%@page import="Model.Register" %>

<%
    RegisterDao rd = new RegisterDao();
    Register R;
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <!DOCTYPE html>

<html>
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta charset="utf-8" />
    <title>Login Page</title>
    <link rel="shortcut icon" href="/assets/favicon.ico" />
    <link rel="stylesheet" href="./css/main.css"/>
    <link rel="stylesheet" href="./css/form.css"/>
    <script src="js/main.js"></script>
  </head>

  <body>
    <div class="container">
      <form class="form" id="login">
        <h1 class="ftitle">Login</h1>
        <div class="fmessage fmessage-error"></div>
        <div class="finput-group">
          <input
            type="text"
            name="username"
            class="finput"
            autofocus
            placeholder="Username or email"
            required
          />
          <div class="finput-error-message"></div>
        </div>
        <div class="finput-group">
          <input type="password" class="finput" name="psw" autofocus placeholder="Password" required/>
          <div class="finput-error-message"></div>
        </div>
        <button class="fbutton" type="submit">Continue</button>
                <% 
           String user,pass;
           user=request.getParameter("username");
           pass=request.getParameter("psw");
               request.getSession();
           if(user!=null && pass!=null)
     {
        if (rd.checkLogin(user, pass))
        {
             session.setAttribute("user", user);
             session.setAttribute("pass", pass);
            response.sendRedirect("home.jsp");
        }   
        else
          out.println("<font color=red>Invalid userid or password</font>");  
     }                     
      %> 

        <p class="ftext">
          <a href="#" class="flink">Forgot your password?</a>
        </p>
        <p class="ftext">
            <a class="flink" href="./signup.jsp" id="linkCreateAccount">Don't have an account? Create account</a>
        </p>
        <!-- <div class="row"> -->
          <h2 style="text-align:center">Login with Social Media</h2>
         
    
          <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  
          <!-- Add font awesome icons -->
          <a target="_blank" href="https://www.facor pasebook.com" class="fa fa-facebook"></a>
            <a target="_blank" href="https://twitter.com/"  class="fa fa-twitter"></a>
            <a target="_blank" href="https://accounts.google.com/signin/v2/identifier?service=accountsettings&continue=https%3A%2F%2Fmyaccount.google.com%2F%3Futm_source%3Dsign_in_no_continue&ec=GAlAwAE&flowName=GlifWebSignIn&flowEntry=AddSession" class="fa fa-google"></a>
            <a target="_blank" href="https://linkedin.com/" class="fa fa-linkedin"></a>
      </form>

  </body>
  </html>