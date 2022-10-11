package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Dao.RegisterDao;
import Model.Register;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    RegisterDao rd = new RegisterDao();
    Register R;

      out.write("\n");
      out.write("\n");
      out.write("    <!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <title>Login Page</title>\n");
      out.write("    <link rel=\"shortcut icon\" href=\"/assets/favicon.ico\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"./css/main.css\"/>\n");
      out.write("    <link rel=\"stylesheet\" href=\"./css/form.css\"/>\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("    <img src=\"css/img/loader.gif\" class=\"loader\" alt=\"\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <form class=\"form\" id=\"login\">\n");
      out.write("        <h1 class=\"ftitle\">Login</h1>\n");
      out.write("        <div class=\"fmessage fmessage-error\"></div>\n");
      out.write("        <div class=\"finput-group\">\n");
      out.write("          <input\n");
      out.write("            type=\"text\"\n");
      out.write("            name=\"username\"\n");
      out.write("            class=\"finput\"\n");
      out.write("            autofocus\n");
      out.write("            placeholder=\"Username or email\"\n");
      out.write("            required\n");
      out.write("          />\n");
      out.write("          <div class=\"finput-error-message\"></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"finput-group\">\n");
      out.write("          <input type=\"password\" class=\"finput\" name=\"psw\" autofocus placeholder=\"Password\" required/>\n");
      out.write("          <div class=\"finput-error-message\"></div>\n");
      out.write("        </div>\n");
      out.write("        <button class=\"fbutton\" formaction=\"./home.jsp\" type=\"submit\">Continue</button>\n");
      out.write("                ");
 
           String user,pass;
           user=request.getParameter("username");
           pass=request.getParameter("psw");
           
           if(user!=null && pass!=null)
     {
        if (rd.checkLogin(user, pass))
        {
             session.setAttribute("user", user);
             session.setAttribute("pass", pass);
            response.sendRedirect("Home.jsp");
        }   
        else
          out.println("<font color=red>Invalid userid or password</font>");  
     }                     
      
      out.write(" \n");
      out.write("\n");
      out.write("        <p class=\"ftext\">\n");
      out.write("          <a href=\"#\" class=\"flink\">Forgot your password?</a>\n");
      out.write("        </p>\n");
      out.write("        <p class=\"ftext\">\n");
      out.write("            <a class=\"flink\" href=\"signup.jsp\" id=\"linkCreateAccount\">Don't have an account? Create account</a>\n");
      out.write("        </p>\n");
      out.write("        <!-- <div class=\"row\"> -->\n");
      out.write("          <h2 style=\"text-align:center\">Login with Social Media</h2>\n");
      out.write("         \n");
      out.write("    \n");
      out.write("          <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("  \n");
      out.write("          <!-- Add font awesome icons -->\n");
      out.write("          <a target=\"_blank\" href=\"https://www.facebook.com\" class=\"fa fa-facebook\"></a>\n");
      out.write("            <a target=\"_blank\" href=\"https://twitter.com/\"  class=\"fa fa-twitter\"></a>\n");
      out.write("            <a target=\"_blank\" href=\"https://accounts.google.com/signin/v2/identifier?service=accountsettings&continue=https%3A%2F%2Fmyaccount.google.com%2F%3Futm_source%3Dsign_in_no_continue&ec=GAlAwAE&flowName=GlifWebSignIn&flowEntry=AddSession\" class=\"fa fa-google\"></a>\n");
      out.write("            <a target=\"_blank\" href=\"https://linkedin.com/\" class=\"fa fa-linkedin\"></a>\n");
      out.write("      </form>\n");
      out.write("\n");
      out.write("  </body>\n");
      out.write("  </html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
