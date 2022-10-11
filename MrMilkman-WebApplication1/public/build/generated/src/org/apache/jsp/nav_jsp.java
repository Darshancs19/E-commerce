package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class nav_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script language=\"javascript\">\n");
      out.write("            window.history.forward();\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("          ");

             if(session.isNew())
                response.sendRedirect("index.jsp");
          
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("    <nav class=\"navbar\">\n");
      out.write("      <div class=\"nav\">\n");
      out.write("        <img src=\"css/img/Logo.png\" class=\"brand-logo\" alt=\"\" />\n");
      out.write("        <div class=\"nav-items\">\n");
      out.write("          <div class=\"search\">\n");
      out.write("            <input\n");
      out.write("              type=\"text\"\n");
      out.write("              class=\"search-box\"\n");
      out.write("              placeholder=\"search product\"\n");
      out.write("            />\n");
      out.write("            <button class=\"search-btn\">search</button>\n");
      out.write("          </div>\n");
      out.write("            <a href=\"addProduct.jsp\"><img src=\"css/img/user.png\" alt=\"\" /></a>\n");
      out.write("          <a href=\"#\"><img src=\"css/img/cart.png\" alt=\"\" /></a>\n");
      out.write("          <A href=\"signout.jsp\">signout</A> \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <ul class=\"links-container\">\n");
      out.write("        <li class=\"link-item\"><a href=\"#\" class=\"link\">Dairy</a></li>\n");
      out.write("        <li class=\"link-item\"><a href=\"#\" class=\"link\">Farmer</a></li>\n");
      out.write("        <li class=\"link-item\"><a href=\"#\" class=\"link\">Products</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </nav>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
