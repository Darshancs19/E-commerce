package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Dao.RegisterDao;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(" \n");
      out.write("<!DOCTYPE html>\n");
      Model.Register R = null;
      synchronized (_jspx_page_context) {
        R = (Model.Register) _jspx_page_context.getAttribute("R", PageContext.PAGE_SCOPE);
        if (R == null){
          R = new Model.Register();
          _jspx_page_context.setAttribute("R", R, PageContext.PAGE_SCOPE);
          out.write("\n");
          out.write("  ");
          org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("R"), request);
          out.write('\n');
        }
      }
      out.write("\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <title>Sign Up Page</title>\n");
      out.write("    <link rel=\"shortcut icon\" href=\"/assets/favicon.ico\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/main.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"./css/form.css\" />\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("    <script src=\"js/form.js\"></script>\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("    <img src=\"css/img/loader.gif\" class=\"loader\" alt=\"\" />\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <form class=\"form f-hidden\" id=\"createAccount\" method=\"post\">\n");
      out.write("        <h1 class=\"ftitle\">Create Account</h1>\n");
      out.write("        <div class=\"fmessage fmessage--error\"></div>\n");
      out.write("        <div class=\"finput-group\">\n");
      out.write("          <input\n");
      out.write("            type=\"text\"\n");
      out.write("            name=\"signupUsername\"\n");
      out.write("            id=\"signupUsername\"\n");
      out.write("            pattern=\"(?=.*[a-z]).{10,}\"\n");
      out.write("            title=\"Username must be 10 characters long\"\n");
      out.write("            class=\"finput\"\n");
      out.write("            autofocus\n");
      out.write("            placeholder=\"Username\"\n");
      out.write("            required\n");
      out.write("          />\n");
      out.write("          <div class=\"finput-error-message\"></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"finput-group\">\n");
      out.write("          <input\n");
      out.write("            type=\"email\"\n");
      out.write("            id=\"email\"\n");
      out.write("            name=\"email\"\n");
      out.write("            class=\"finput\"\n");
      out.write("            autofocus\n");
      out.write("            placeholder=\"Email Address\"\n");
      out.write("            required\n");
      out.write("          />\n");
      out.write("          <div class=\"finput-error-message\"></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"finput-group\">\n");
      out.write("          <input\n");
      out.write("            type=\"password\"\n");
      out.write("            id=\"psw\"\n");
      out.write("            name=\"psw\"\n");
      out.write("            pattern=\"(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}\"\n");
      out.write("            title=\"Must contain at\n");
      out.write("      least one number and one uppercase and lowercase letter, and at least 8\n");
      out.write("      or more characters\"\n");
      out.write("            class=\"finput\"\n");
      out.write("            autofocus\n");
      out.write("            placeholder=\"Password\"\n");
      out.write("            required\n");
      out.write("          />\n");
      out.write("          <div class=\"finput-error-message\"></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"finput-group\">\n");
      out.write("          <input\n");
      out.write("            type=\"password\"\n");
      out.write("            id=\"confirm-password\"\n");
      out.write("            name=\"confirm_password\"\n");
      out.write("            class=\"finput\"\n");
      out.write("            autofocus\n");
      out.write("            placeholder=\"Confirm password\"\n");
      out.write("            required\n");
      out.write("          />\n");
      out.write("          <div class=\"finput-error-message\"></div>\n");
      out.write("        </div>\n");
      out.write("        <button\n");
      out.write("          class=\"fbutton\"\n");
      out.write("          type=\"submit\"\n");
      out.write("        >\n");
      out.write("          Continue\n");
      out.write("        </button>\n");
      out.write("         ");
 String user, email, pass;
  user=request.getParameter("signupUsername");
    email=request.getParameter("email"); 
    pass=request.getParameter("psw");
    RegisterDao rd = new RegisterDao(); 
    R.setUsername(user); 
    R.setEmail(email);
    R.setPassword(pass); 
  if(rd.insertUser(R)) 
  {
    response.sendRedirect("index.jsp");
  }
       
      out.write("\n");
      out.write("\n");
      out.write("        <p class=\"ftext\">\n");
      out.write("          <a class=\"flink\" href=\"./index.jsp\" id=\"linkLogin\"\n");
      out.write("            >Already have an account? Sign in</a\n");
      out.write("          >\n");
      out.write("        </p>\n");
      out.write("        <h2 style=\"text-align: center\">Signup with Social Media</h2>\n");
      out.write("        <!-- Add icon library -->\n");
      out.write("        <link\n");
      out.write("          rel=\"stylesheet\"\n");
      out.write("          href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\"\n");
      out.write("        />\n");
      out.write("\n");
      out.write("        <!-- Add font awesome icons -->\n");
      out.write("        <a\n");
      out.write("          target=\"_blank\"\n");
      out.write("          href=\"https://www.facebook.com\"\n");
      out.write("          class=\"fa fa-facebook\"\n");
      out.write("        ></a>\n");
      out.write("        <a\n");
      out.write("          target=\"_blank\"\n");
      out.write("          href=\"https://twitter.com/\"\n");
      out.write("          class=\"fa fa-twitter\"\n");
      out.write("        ></a>\n");
      out.write("        <a\n");
      out.write("          target=\"_blank\"\n");
      out.write("          href=\"https://accounts.google.com/signin/v2/identifier?service=accountsettings&continue=https%3A%2F%2Fmyaccount.google.com%2F%3Futm_source%3Dsign_in_no_continue&ec=GAlAwAE&flowName=GlifWebSignIn&flowEntry=AddSession\"\n");
      out.write("          class=\"fa fa-google\"\n");
      out.write("        ></a>\n");
      out.write("        <a\n");
      out.write("          target=\"_blank\"\n");
      out.write("          href=\"https://linkedin.com/\"\n");
      out.write("          class=\"fa fa-linkedin\"\n");
      out.write("        ></a>\n");
      out.write("\n");
      out.write("        <div id=\"message_pass\">\n");
      out.write("          <h3>Password must contain the following:</h3>\n");
      out.write("          <p id=\"letter\" class=\"invalid\">A <b>lowercase</b> letter</p>\n");
      out.write("          <p id=\"capital\" class=\"invalid\">\n");
      out.write("            A <b>capital (uppercase)</b> letter\n");
      out.write("          </p>\n");
      out.write("          <p id=\"number\" class=\"invalid\">A <b>number</b></p>\n");
      out.write("          <p id=\"length\" class=\"invalid\">Minimum <b>8 characters</b></p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"message_user\">\n");
      out.write("          <h3>Username must be 10 characters long</h3>\n");
      out.write("          <p id=\"length\" class=\"invalid\">Minimum <b>10 characters</b></p>\n");
      out.write("        </div>\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
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
