package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <!--other head tags-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/addProduct.css\" />\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("        <img src=\"img/loader.gif\" class=\"loader\" alt=\"\">\n");
      out.write("\n");
      out.write("    <div class=\"alert-box\">\n");
      out.write("        <img src=\"img/error.png\" class=\"alert-img\" alt=\"\">\n");
      out.write("        <p class=\"alert-msg\"></p>\n");
      out.write("    </div>\n");
      out.write("    <img src=\"css/img/dark-Logo.png\" class=\"logo\" alt=\"\" />\n");
      out.write("    <div class=\"form\">\n");
      out.write("      <input\n");
      out.write("        type=\"text\"\n");
      out.write("        class=\"product-name\"\n");
      out.write("        id=\"product-name\"\n");
      out.write("        placeholder=\"product name\"\n");
      out.write("      />\n");
      out.write("      <input\n");
      out.write("        type=\"text\"\n");
      out.write("        class=\"product-name\"\n");
      out.write("        id=\"short-des\"\n");
      out.write("        placeholder=\"short line about the product\"\n");
      out.write("      />\n");
      out.write("      <textarea id=\"des\" placeholder=\"detail description\"></textarea>\n");
      out.write("\n");
      out.write("      <!-- product image -->\n");
      out.write("      <div class=\"product-info\">\n");
      out.write("        <div class=\"product-image\"><p class=\"text\">product image</p></div>\n");
      out.write("        <div class=\"upload-image-sec\">\n");
      out.write("          <!-- upload inputs -->\n");
      out.write("          <p class=\"text\">\n");
      out.write("            <img src=\"css/img/cow-logo.jpg\" alt=\"\" />upload image\n");
      out.write("          </p>\n");
      out.write("          <div class=\"upload-catalouge\">\n");
      out.write("            <input\n");
      out.write("              type=\"file\"\n");
      out.write("              class=\"fileupload\"\n");
      out.write("              id=\"first-file-upload-btn\"\n");
      out.write("              hidden\n");
      out.write("            />\n");
      out.write("            <label for=\"first-file-upload-btn\" class=\"upload-image\"></label>\n");
      out.write("            <input\n");
      out.write("              type=\"file\"\n");
      out.write("              class=\"fileupload\"\n");
      out.write("              id=\"second-file-upload-btn\"\n");
      out.write("              hidden\n");
      out.write("            />\n");
      out.write("            <label for=\"second-file-upload-btn\" class=\"upload-image\"></label>\n");
      out.write("            <input\n");
      out.write("              type=\"file\"\n");
      out.write("              class=\"fileupload\"\n");
      out.write("              id=\"third-file-upload-btn\"\n");
      out.write("              hidden\n");
      out.write("            />\n");
      out.write("            <label for=\"third-file-upload-btn\" class=\"upload-image\"></label>\n");
      out.write("            <input\n");
      out.write("              type=\"file\"\n");
      out.write("              class=\"fileupload\"\n");
      out.write("              id=\"fourth-file-upload-btn\"\n");
      out.write("              hidden\n");
      out.write("            />\n");
      out.write("            <label for=\"fourth-file-upload-btn\" class=\"upload-image\"></label>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"select-sizes\">\n");
      out.write("          <p class=\"text\">Milk Available</p>\n");
      out.write("          <div class=\"sizes\">\n");
      out.write("            <input type=\"checkbox\" class=\"size-checkbox\" id=\"xs\" value=\"Cow\" />\n");
      out.write("            <input type=\"checkbox\" class=\"size-checkbox\" id=\"s\" value=\"Goat\" />\n");
      out.write("            <input type=\"checkbox\" class=\"size-checkbox\" id=\"m\" value=\"Sheep\" />\n");
      out.write("            <input type=\"checkbox\" class=\"size-checkbox\" id=\"l\" value=\"Buffalo\" />\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"product-price\">\n");
      out.write("        <input\n");
      out.write("          type=\"number\"\n");
      out.write("          class=\"actual-price\"\n");
      out.write("          id=\"actual-price\"\n");
      out.write("          placeholder=\"actual price\"\n");
      out.write("        />\n");
      out.write("        <input\n");
      out.write("          type=\"number\"\n");
      out.write("          class=\"discount\"\n");
      out.write("          id=\"discount\"\n");
      out.write("          placeholder=\"discount percentage\"\n");
      out.write("        />\n");
      out.write("        <input\n");
      out.write("          type=\"number\"\n");
      out.write("          class=\"sell-price\"\n");
      out.write("          id=\"sell-price\"\n");
      out.write("          placeholder=\"selling price\"\n");
      out.write("        />\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <input\n");
      out.write("        type=\"number\"\n");
      out.write("        id=\"stock\"\n");
      out.write("        min=\"20\"\n");
      out.write("        placeholder=\"item in stocks (minimum 20)\"\n");
      out.write("      />\n");
      out.write("\n");
      out.write("      <textarea\n");
      out.write("        id=\"tags\"\n");
      out.write("        placeholder=\"Enter categories here\"\n");
      out.write("      ></textarea>\n");
      out.write("\n");
      out.write("      <input type=\"checkbox\" class=\"checkbox\" id=\"tac\" checked />\n");
      out.write("      <label for=\"tac\">Dairy Products take 30% from your total sell</label>\n");
      out.write("\n");
      out.write("      <div class=\"buttons\">\n");
      out.write("        <button class=\"btn\" id=\"add-btn\">add product</button>\n");
      out.write("        <button class=\"btn\" id=\"save-btn\">save draft</button>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <script src=\"js/addProduct.js\"></script>\n");
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
