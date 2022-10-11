package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Dao.RegisterDao;
import Model.Register;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/nav.jsp");
  }

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
      out.write("          <a href=\"./home.jsp\"><img src=\"css/img/Logo.png\" class=\"brand-logo\" alt=\"\" /></a>\n");
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
      out.write("\n");
      out.write("  ");

RegisterDao rd = new RegisterDao(); Register R; 
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("    <title>JSP Page</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/home.css\" />\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("      \n");
      out.write("    <header class=\"hero-section\">\n");
      out.write("      <div class=\"content\">\n");
      out.write("        <img src=\"css/img/milk_1572.jpg\" class=\"logo\" alt=\"\" />\n");
      out.write("        <p class=\"sub-heading\">Strength of every family</p>\n");
      out.write("      </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <section class=\"product\">\n");
      out.write("      <h2 class=\"product-category\">Fresh selling</h2>\n");
      out.write("\n");
      out.write("      <button class=\"pre-btn\" id=\"pre-btn\">\n");
      out.write("        <img src=\"css/img/arrow.png\" alt=\"\" />\n");
      out.write("      </button>\n");
      out.write("      <button class=\"nxt-btn\" id=\"nxt-btn\">\n");
      out.write("        <img src=\"css/img/arrow.png\" alt=\"\" />\n");
      out.write("      </button>\n");
      out.write("\n");
      out.write("      <!--    // inside product section.-->\n");
      out.write("      <div class=\"product-container\" id=\"product-container\">\n");
      out.write("        <div class=\"product-card\">\n");
      out.write("          <div class=\"product-image\">\n");
      out.write("            <span class=\"discount-tag\">50% off</span>\n");
      out.write("            <img\n");
      out.write("              src=\"css/img/FSSAI-Issues-Draft-Notification-Related-to-Certain-Milk-and-Milk-Products-Copy-300x150.jpg\"\n");
      out.write("              class=\"product-thumb\"\n");
      out.write("              alt=\"\"\n");
      out.write("            />\n");
      out.write("            <button class=\"card-btn\">\n");
      out.write("              <a href=\"product.jsp\">add to wishlist</a>\n");
      out.write("            </button>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"product-info\">\n");
      out.write("            <h2 class=\"product-brand\">brand</h2>\n");
      out.write("            <p class=\"product-short-des\">About You</p>\n");
      out.write("            <span class=\"price\">$20</span><span class=\"actual-price\">$40</span>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"product-card\">\n");
      out.write("          <div class=\"product-image\">\n");
      out.write("            <span class=\"discount-tag\">50% off</span>\n");
      out.write("            <img src=\"css/img/FSSAI-Issues-Draft-Notification-Related-to-Certain-Milk-and-Milk-Products-Copy-300x150.jpg\" class=\"product-thumb\" alt=\"\" />\n");
      out.write("            <button class=\"card-btn\">\n");
      out.write("              <a href=\"product.jsp\">add to wishlist</a>\n");
      out.write("            </button>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"product-info\">\n");
      out.write("            <h2 class=\"product-brand\">brand</h2>\n");
      out.write("            <p class=\"product-short-des\">About You</p>\n");
      out.write("            <span class=\"price\">$20</span><span class=\"actual-price\">$40</span>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"product-card\">\n");
      out.write("          <div class=\"product-image\">\n");
      out.write("            <span class=\"discount-tag\">50% off</span>\n");
      out.write("            <img src=\"css/img/milkman.jpg\" class=\"product-thumb\" alt=\"\" />\n");
      out.write("            <button class=\"card-btn\">\n");
      out.write("              <a href=\"product.jsp\">add to wishlist</a>\n");
      out.write("            </button>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"product-info\">\n");
      out.write("            <h2 class=\"product-brand\">brand</h2>\n");
      out.write("            <p class=\"product-short-des\">About You</p>\n");
      out.write("            <span class=\"price\">$20</span><span class=\"actual-price\">$40</span>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"product-card\">\n");
      out.write("          <div class=\"product-image\">\n");
      out.write("            <span class=\"discount-tag\">50% off</span>\n");
      out.write("            <img\n");
      out.write("              src=\"css/img/milkman-vehicle.jpg\"\n");
      out.write("              class=\"product-thumb\"\n");
      out.write("              alt=\"\"\n");
      out.write("            />\n");
      out.write("            <button class=\"card-btn\">\n");
      out.write("              <a href=\"product.jsp\">add to wishlist</a>\n");
      out.write("            </button>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"product-info\">\n");
      out.write("            <h2 class=\"product-brand\">brand</h2>\n");
      out.write("            <p class=\"product-short-des\">About You</p>\n");
      out.write("            <span class=\"price\">$20</span><span class=\"actual-price\">$40</span>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"product-card\">\n");
      out.write("          <div class=\"product-image\">\n");
      out.write("            <span class=\"discount-tag\">50% off</span>\n");
      out.write("            <img src=\"css/img/cow-logo.jpg\" class=\"product-thumb\" alt=\"\" />\n");
      out.write("            <button class=\"card-btn\">\n");
      out.write("              <a href=\"product.jsp\">add to wishlist</a>\n");
      out.write("            </button>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"product-info\">\n");
      out.write("            <h2 class=\"product-brand\">brand</h2>\n");
      out.write("            <p class=\"product-short-des\">About You</p>\n");
      out.write("            <span class=\"price\">$20</span><span class=\"actual-price\">$40</span>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"product-card\">\n");
      out.write("          <div class=\"product-image\">\n");
      out.write("            <span class=\"discount-tag\">50% off</span>\n");
      out.write("            <img src=\"css/img/cow-icon.jpg\" class=\"product-thumb\" alt=\"\" />\n");
      out.write("            <button class=\"card-btn\">\n");
      out.write("              <a href=\"product.jsp\">add to wishlist</a></button\n");
      out.write("            >>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"product-info\">\n");
      out.write("            <h2 class=\"product-brand\">brand</h2>\n");
      out.write("            <p class=\"product-short-des\">About You</p>\n");
      out.write("            <span class=\"price\">$20</span><span class=\"actual-price\">$40</span>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <!-- collections -->\n");
      out.write("    <section class=\"collection-container\">\n");
      out.write("      <a href=\"#\" class=\"collection\">\n");
      out.write("        <img src=\"css/img/cow-logo.jpg\" alt=\"\" />\n");
      out.write("        <p class=\"collection-title\">Dairy 1</p>\n");
      out.write("      </a>\n");
      out.write("      <a href=\"#\" class=\"collection\">\n");
      out.write("        <img src=\"css/img/cow-icon.jpg\" alt=\"\" />\n");
      out.write("        <p class=\"collection-title\">Dairy 2</p>\n");
      out.write("      </a>\n");
      out.write("      <a href=\"#\" class=\"collection\">\n");
      out.write("        <img\n");
      out.write("          src=\"css/img/FSSAI-Issues-Draft-Notification-Related-to-Certain-Milk-and-Milk-Products-Copy-300x150.jpg\"\n");
      out.write("          alt=\"\"\n");
      out.write("        />\n");
      out.write("        <p class=\"collection-title\">Dairy 2</p>\n");
      out.write("      </a>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <footer>\n");
      out.write("      <div class=\"footer-content\">\n");
      out.write("        <img src=\"css/img/Logo-removebg-preview.png\" class=\"logo\" alt=\"\" />\n");
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
      out.write("      <p class=\"info\">telephone - 180 00 00 001, 180 00 00 002</p>\n");
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
      out.write("\n");
      out.write("    <script src=\"js/footer.js\"></script>\n");
      out.write("    <script src=\"js/nav.js\"></script>\n");
      out.write("    <script src=\"js/home.js\"></script>\n");
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
