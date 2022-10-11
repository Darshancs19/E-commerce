<%-- Document : home Created on : 7 Oct, 2021, 3:51:09 PM Author : Admin --%>
<%@page import="Dao.RegisterDao" %> <%@page contentType="text/html"
pageEncoding="UTF-8"%> <%@page session="true" %>
<!DOCTYPE html>
<jsp:useBean class="Model.Register" id="R">
  <jsp:setProperty name="R" property="*"></jsp:setProperty>
</jsp:useBean>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>JSP Page</title>
    <script src="js/main.js"></script>
  </head>
  <body>
       <% String user, email, pass;
  user=request.getParameter("signupUsername");
    email=request.getParameter("email"); 
    pass=request.getParameter("psw");
    RegisterDao rd = new RegisterDao(); 
    R.setUsername(user); 
    R.setEmail(email);
    R.setPassword(pass); 
  if(rd.insertUser(R)) 
    out.println("Updated Successfully"); %>
    <h1>Registration Successful..........</h1>
    
    
    <script src="main.js"></script>
    <h3><a href="./index.jsp">Login</a></h3>
  </body>
</html>
