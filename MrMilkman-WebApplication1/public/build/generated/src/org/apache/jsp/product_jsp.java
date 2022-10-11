package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("    <title>JSP Page</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/home.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/footer.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/product.css\" />\n");
      out.write("\n");
      out.write("    <script src=\"js/nav.js\"></script>\n");
      out.write("    <script src=\"js/footer.js\"></script>\n");
      out.write("    <script src=\"js/home.js\"></script>\n");
      out.write("    <script src=\"js/product.js\"></script>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
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
      out.write("          <a href=\"#\"><img src=\"css/img/user.png\" alt=\"\" /></a>\n");
      out.write("          <a href=\"#\"><img src=\"css/img/cart.png\" alt=\"\" /></a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <ul class=\"links-container\">\n");
      out.write("        <li class=\"link-item\"><a href=\"#\" class=\"link\">Dairy</a></li>\n");
      out.write("        <li class=\"link-item\"><a href=\"#\" class=\"link\">Farmer</a></li>\n");
      out.write("        <li class=\"link-item\"><a href=\"#\" class=\"link\">Products</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <section class=\"product-details\">\n");
      out.write("      <div class=\"image-slider\">\n");
      out.write("        <div class=\"product-images\">\n");
      out.write("          <img src=\"css/img/milkman-set.jpg\" class=\"active\" alt=\"\" />\n");
      out.write("          <img src=\"css/img/mrlinkcolor.jpg\" alt=\"\" />\n");
      out.write("          <img src=\"css/img/milkman.jpg\" alt=\"\" />\n");
      out.write("          <img src=\"css/img/milkman-vehicle.jpg\" alt=\"\" />\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"details\">\n");
      out.write("        <h2 class=\"product-brand\">Milk Type</h2>\n");
      out.write("        <p class=\"product-short-des\">Quality</p>\n");
      out.write("        <span class=\"product-price\">$99</span>\n");
      out.write("        <span class=\"product-actual-price\">$200</span>\n");
      out.write("        <span class=\"product-discount\">( 50% off )</span>\n");
      out.write("\n");
      out.write("        <p class=\"product-sub-heading\">select Amount</p>\n");
      out.write("\n");
      out.write("        <input type=\"radio\" name=\"size\" value=\"1\" checked hidden id=\"1-ltr\" />\n");
      out.write("        <label for=\"1-ltr\" class=\"size-radio-btn check\">1-ltr</label>\n");
      out.write("        <input type=\"radio\" name=\"size\" value=\"2\" hidden id=\"2-ltr\" />\n");
      out.write("        <label for=\"2-ltr\" class=\"size-radio-btn\">2-ltr</label>\n");
      out.write("        <input type=\"radio\" name=\"size\" value=\"3\" hidden id=\"3-ltr\" />\n");
      out.write("        <label for=\"3-ltr\" class=\"size-radio-btn\">3-ltr</label>\n");
      out.write("        <input type=\"radio\" name=\"size\" value=\"4\" hidden id=\"4-ltr\" />\n");
      out.write("        <label for=\"4-ltr\" class=\"size-radio-btn\">4-ltr</label>\n");
      out.write("        <input type=\"radio\" name=\"size\" value=\"5\" hidden id=\"5-ltr\" />\n");
      out.write("        <label for=\"5-ltr\" class=\"size-radio-btn\">5-ltr</label>\n");
      out.write("\n");
      out.write("        <button class=\"btn cart-btn\">add to cart</button>\n");
      out.write("        <button class=\"btn\">add to wishlist</button>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("    <footer>\n");
      out.write("      <div class=\"footer-content\">\n");
      out.write("        <img src=\"css/img/Logo-removebg-preview.png\" class=\"logo\" alt=\"\" />\n");
      out.write("\n");
      out.write("        <div class=\"footer-ul-container\">\n");
      out.write("          <ul class=\"category\">\n");
      out.write("            <li class=\"category-title\">Products</li>\n");
      out.write("            <li><a href=\"#\" class=\"footer-link\">Milk Product 1</a></li>\n");
      out.write("            <li><a href=\"#\" class=\"footer-link\">Milk Product 2</a></li>\n");
      out.write("            <li><a href=\"#\" class=\"footer-link\">Milk Product 3</a></li>\n");
      out.write("            <li><a href=\"#\" class=\"footer-link\">Milk Product 4</a></li>\n");
      out.write("            <li><a href=\"#\" class=\"footer-link\">Milk Product 5</a></li>\n");
      out.write("            <li><a href=\"#\" class=\"footer-link\">Milk Product 6</a></li>\n");
      out.write("            <li><a href=\"#\" class=\"footer-link\">Milk Product 7</a></li>\n");
      out.write("            <li><a href=\"#\" class=\"footer-link\">Milk Product 8</a></li>\n");
      out.write("            <li><a href=\"#\" class=\"footer-link\">Milk Product 9</a></li>\n");
      out.write("            <li><a href=\"#\" class=\"footer-link\">Milk Product 10</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <p class=\"footer-title\">about company</p>\n");
      out.write("      <p class=\"info\">\n");
      out.write("        support emails - help@mrmilkman.com, customersupport@mrmilkman.com\n");
      out.write("      </p>\n");
      out.write("      <p class=\"info\">telephone - 1800 000001, 180 0000002</p>\n");
      out.write("      <div class=\"footer-social-container\">\n");
      out.write("        <div>\n");
      out.write("          <a href=\"#\" class=\"social-link\">terms & services</a>\n");
      out.write("          <a href=\"#\" class=\"social-link\">privacy page</a>\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("          <a href=\"#\" class=\"social-link\">instagram</a>\n");
      out.write("          <a href=\"#\" class=\"social-link\">facebook</a>\n");
      out.write("          <a href=\"#\" class=\"social-link\">twitter</a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <p class=\"footer-credit\">MrMilkman, Best online store for milk</p>\n");
      out.write("    </footer>\n");
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
