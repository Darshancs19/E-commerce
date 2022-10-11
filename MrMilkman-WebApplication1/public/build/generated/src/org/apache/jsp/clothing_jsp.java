//package org.apache.jsp;
//
//import javax.servlet.*;
//import javax.servlet.http.*;
//import javax.servlet.jsp.*;
//
//public final class clothing_jsp extends org.apache.jasper.runtime.HttpJspBase
//    implements org.apache.jasper.runtime.JspSourceDependent {
//
//  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();
//
//  private static java.util.List<String> _jspx_dependants;
//
//  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
//  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
//  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
//  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
//  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
//  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;
//
//  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;
//
//  public java.util.List<String> getDependants() {
//    return _jspx_dependants;
//  }
//
//  public void _jspInit() {
//    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
//    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
//    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
//    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
//    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
//    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
//  }
//
//  public void _jspDestroy() {
//    _jspx_tagPool_c_forEach_var_items.release();
//    _jspx_tagPool_c_set_var_value_nobody.release();
//    _jspx_tagPool_c_out_value_nobody.release();
//    _jspx_tagPool_c_choose.release();
//    _jspx_tagPool_c_if_test.release();
//    _jspx_tagPool_c_when_test.release();
//  }
//
//  public void _jspService(HttpServletRequest request, HttpServletResponse response)
//        throws java.io.IOException, ServletException {
//
//    PageContext pageContext = null;
//    HttpSession session = null;
//    ServletContext application = null;
//    ServletConfig config = null;
//    JspWriter out = null;
//    Object page = this;
//    JspWriter _jspx_out = null;
//    PageContext _jspx_page_context = null;
//
//    try {
//      response.setContentType("text/html; charset=ISO-8859-1");
//      pageContext = _jspxFactory.getPageContext(this, request, response,
//      			null, true, 8192, true);
//      _jspx_page_context = pageContext;
//      application = pageContext.getServletContext();
//      config = pageContext.getServletConfig();
//      session = pageContext.getSession();
//      out = pageContext.getOut();
//      _jspx_out = out;
//      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");
//
//      out.write("\n");
//      out.write("\n");
//      out.write("<!DOCTYPE html>\n");
//      out.write("<html>\n");
//      out.write("<head>\n");
//      out.write("<meta charset=\"ISO-8859-1\">\n");
//      out.write("<title>Home</title>\n");
//      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\"> \n");
//      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
//      out.write("</head>\n");
//      out.write("<body>\n");
//      out.write("\n");
//      if (_jspx_meth_c_set_0(_jspx_page_context))
//        return;
//      out.write('\n');
//      out.write('	');
//      if (_jspx_meth_c_forEach_0(_jspx_page_context))
//        return;
//      out.write("\n");
//      out.write("\n");
//      out.write("\t<header>\n");
//      out.write("\t\t<h1>\n");
//      out.write("\t\t\tTiazon\n");
//      out.write("\t\t</h1>\n");
//      out.write("\t\t<nav>\n");
//      out.write("\t\t\t<ul>\n");
//      out.write("\t\t\t\t<li><a href=\"Controller?page=index\">Home</a></li>\n");
//      out.write("\t\t\t\t");
//      if (_jspx_meth_c_choose_0(_jspx_page_context))
//        return;
//      out.write("\n");
//      out.write("\t\t\t\t<li><a href=\"Controller?page=showcart\">cart(");
//      if (_jspx_meth_c_out_1(_jspx_page_context))
//        return;
//      out.write(")</a></li>\n");
//      out.write("\t\t\t</ul>\n");
//      out.write("\t\t</nav>\n");
//      out.write("\t</header>\n");
//      out.write("\t\n");
//      out.write("\t<div class=\"tiazon-content\">\n");
//      out.write(" \t<div class=\"container\">\n");
//      out.write(" \t\t<div class=\"row\">\n");
//      out.write(" \t\t\t\t<div class=\"col-md-4\"><!-- left -->\n");
//      out.write(" \t\t\t\t\t\t<div class=\"list-group\"><!-- products -->\n");
//      out.write("\t\t\t\t\t\t  <a href=\"Controller?page=all-products\" class=\"list-group-item\" style=\"background:  #d6d4d3;\">\n");
//      out.write("\t\t\t\t\t\t    All Products\n");
//      out.write("\t\t\t\t\t\t  </a>\n");
//      out.write("\t\t\t\t\t\t  <a href=\"Controller?page=mobiles\" class=\"list-group-item\">Mobiles</a>\n");
//      out.write("\t\t\t\t\t\t  <a href=\"Controller?page=laptops\" class=\"list-group-item\">Laptops</a>\n");
//      out.write("\t\t\t\t\t\t  <a href=\"Controller?page=clothing\" class=\"list-group-item\">Clothing</a>\n");
//      out.write("\t\t\t\t\t\t  <a href=\"Controller?page=home-decor\" class=\"list-group-item\">Home Decor</a>\n");
//      out.write("\t\t\t\t\t\t</div> \n");
//      out.write(" \t\t\t\t</div><!-- left -->\n");
//      out.write("\n");
//      out.write(" \t\t\t\t<div class=\"col-md-8\"><!-- right -->\n");
//      out.write(" \t\t\t\t\t<h2 style=\"text-align: center;\">Clothing</h2><br>\n");
//      out.write(" \t\t\t\t\t\n");
//      out.write(" \t\t\t\t\t<h5>Sort by(Price):</h5>\n");
//      out.write("\t\t\t\t\t<form action=\"Controller\" method=\"get\" style=\"border: none;margin:0px;padding: 0px;margin-bottom: 20px;\">\n");
//      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"page\" value=\"price-sort\">\n");
//      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"action\" value=\"clothing\">\n");
//      out.write("\t\t\t\t\t<select name=\"sort\">\n");
//      out.write("\t\t\t\t\t<option value=\"low-to-high\">Low to high</option>\n");
//      out.write("\t\t\t\t\t<option value=\"high-to-high\">high to low</option>\n");
//      out.write("\t\t\t\t\t</select>\n");
//      out.write("\t\t\t\t\t<input type=\"submit\" value=\"Go!\">\n");
//      out.write("\t\t\t\t\t</form>\n");
//      out.write(" \t\t\t\t\t\n");
//      out.write(" \t\t\t\t\t");
//      if (_jspx_meth_c_forEach_1(_jspx_page_context))
//        return;
//      out.write("\n");
//      out.write(" \t\t\t\t\t\n");
//      out.write(" \t\t\t\t</div>\n");
//      out.write(" \t\t\t</div>\n");
//      out.write(" \t\t</div>\n");
//      out.write(" \t</div>\n");
//      out.write("\t\n");
//      out.write("\t\n");
//      out.write("\t<footer>\n");
//      out.write("\t\t<div class=\"footer\"> &copy; 2018 Copyright:\n");
//      out.write("\t      <a href=\"Controller?page=index\"> Tiazon.com</a>\n");
//      out.write("\t    </div>\n");
//      out.write("\t</footer>\n");
//      out.write("\t\n");
//      out.write("</body>\n");
//      out.write("</html>");
//    } catch (Throwable t) {
//      if (!(t instanceof SkipPageException)){
//        out = _jspx_out;
//        if (out != null && out.getBufferSize() != 0)
//          out.clearBuffer();
//        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
//        else throw new ServletException(t);
//      }
//    } finally {
//      _jspxFactory.releasePageContext(_jspx_page_context);
//    }
//  }
//
//  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
//          throws Throwable {
//    PageContext pageContext = _jspx_page_context;
//    JspWriter out = _jspx_page_context.getOut();
//    //  c:set
//    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
//    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
//    _jspx_th_c_set_0.setParent(null);
//    _jspx_th_c_set_0.setVar("x");
//    _jspx_th_c_set_0.setValue(new String("0"));
//    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
//    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
//      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
//      return true;
//    }
//    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
//    return false;
//  }
//
//  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
//          throws Throwable {
//    PageContext pageContext = _jspx_page_context;
//    JspWriter out = _jspx_page_context.getOut();
//    //  c:forEach
//    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
//    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
//    _jspx_th_c_forEach_0.setParent(null);
//    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cartlist }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
//    _jspx_th_c_forEach_0.setVar("i");
//    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
//    try {
//      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
//      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
//        do {
//          out.write("\n");
//          out.write("\t\t");
//          if (_jspx_meth_c_set_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
//            return true;
//          out.write('\n');
//          out.write('	');
//          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
//          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
//            break;
//        } while (true);
//      }
//      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
//        return true;
//      }
//    } catch (Throwable _jspx_exception) {
//      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
//        out = _jspx_page_context.popBody();
//      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
//    } finally {
//      _jspx_th_c_forEach_0.doFinally();
//      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
//    }
//    return false;
//  }
//
//  private boolean _jspx_meth_c_set_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
//          throws Throwable {
//    PageContext pageContext = _jspx_page_context;
//    JspWriter out = _jspx_page_context.getOut();
//    //  c:set
//    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
//    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
//    _jspx_th_c_set_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
//    _jspx_th_c_set_1.setVar("x");
//    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x+1 }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
//    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
//    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
//      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
//      return true;
//    }
//    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
//    return false;
//  }
//
//  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
//          throws Throwable {
//    PageContext pageContext = _jspx_page_context;
//    JspWriter out = _jspx_page_context.getOut();
//    //  c:choose
//    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
//    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
//    _jspx_th_c_choose_0.setParent(null);
//    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
//    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
//      do {
//        out.write("\n");
//        out.write("\t\t\t\t\t");
//        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
//          return true;
//        out.write("\n");
//        out.write("\t\t\t\t\t");
//        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
//          return true;
//        out.write("\n");
//        out.write("\t\t\t\t");
//        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
//        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
//          break;
//      } while (true);
//    }
//    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
//      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
//      return true;
//    }
//    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
//    return false;
//  }
//
//  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
//          throws Throwable {
//    PageContext pageContext = _jspx_page_context;
//    JspWriter out = _jspx_page_context.getOut();
//    //  c:when
//    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
//    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
//    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
//    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${session == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
//    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
//    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
//      do {
//        out.write("\n");
//        out.write("\t\t\t\t\t\t<li><a href=\"Controller?page=login\">Login</a></li>\n");
//        out.write("\t\t\t\t\t\t<li><a href=\"Controller?page=sign-up\">Sign-up</a></li>\n");
//        out.write("\t\t\t\t\t");
//        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
//        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
//          break;
//      } while (true);
//    }
//    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
//      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
//      return true;
//    }
//    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
//    return false;
//  }
//
//  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
//          throws Throwable {
//    PageContext pageContext = _jspx_page_context;
//    JspWriter out = _jspx_page_context.getOut();
//    //  c:when
//    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
//    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
//    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
//    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${session != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
//    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
//    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
//      do {
//        out.write("\n");
//        out.write("\t\t\t\t\t\t<li><a href=\"Controller?page=logout\" style=\"color: #F24638;\">Logout</a></li>\n");
//        out.write("\t\t\t\t\t\t<li><a href=\"#\">My Account(");
//        if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
//          return true;
//        out.write(")</a></li>\n");
//        out.write("\t\t\t\t\t");
//        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
//        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
//          break;
//      } while (true);
//    }
//    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
//      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
//      return true;
//    }
//    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
//    return false;
//  }
//
//  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
//          throws Throwable {
//    PageContext pageContext = _jspx_page_context;
//    JspWriter out = _jspx_page_context.getOut();
//    //  c:out
//    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
//    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
//    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
//    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
//    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
//    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
//      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
//      return true;
//    }
//    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
//    return false;
//  }
//
//  private boolean _jspx_meth_c_out_1(PageContext _jspx_page_context)
//          throws Throwable {
//    PageContext pageContext = _jspx_page_context;
//    JspWriter out = _jspx_page_context.getOut();
//    //  c:out
//    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
//    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
//    _jspx_th_c_out_1.setParent(null);
//    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
//    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
//    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
//      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
//      return true;
//    }
//    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
//    return false;
//  }
//
//  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
//          throws Throwable {
//    PageContext pageContext = _jspx_page_context;
//    JspWriter out = _jspx_page_context.getOut();
//    //  c:forEach
//    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
//    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
//    _jspx_th_c_forEach_1.setParent(null);
//    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
//    _jspx_th_c_forEach_1.setVar("product");
//    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
//    try {
//      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
//      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
//        do {
//          out.write("\n");
//          out.write(" \t\t\t\t\t\t\n");
//          out.write(" \t\t\t\t\t\t");
//          if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
//            return true;
//          out.write("\n");
//          out.write(" \t\t\t\t\t\t\n");
//          out.write(" \t\t\t\t\t\t\n");
//          out.write(" \t\t\t\t\t");
//          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
//          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
//            break;
//        } while (true);
//      }
//      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
//        return true;
//      }
//    } catch (Throwable _jspx_exception) {
//      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
//        out = _jspx_page_context.popBody();
//      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
//    } finally {
//      _jspx_th_c_forEach_1.doFinally();
//      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
//    }
//    return false;
//  }
//
//  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
//          throws Throwable {
//    PageContext pageContext = _jspx_page_context;
//    JspWriter out = _jspx_page_context.getOut();
//    //  c:if
//    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
//    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
//    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
//    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getCategory() == 'clothing' }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
//    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
//    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
//      do {
//        out.write("\n");
//        out.write(" \t\t\t\t\t\t\t\n");
//        out.write("\t\t \t\t\t\t\t<div class=\"col-md-4\">\n");
//        out.write("\t\t \t\t\t\t\t\t<img src=\"");
//        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getImage() }", java.lang.String.class, (PageContext)_jspx_page_context, null));
//        out.write("\" class=\"img-responsive\" ><br>\n");
//        out.write("\t\t \t\t\t\t\t\t<div class=\"text-center\"><a style=\"color: black;\">");
//        if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
//          return true;
//        out.write("</a></div>\t\n");
//        out.write("\t\t \t\t\t\t\t\t<p style=\"text-align: center;\"> &#x20b9;  ");
//        if (_jspx_meth_c_out_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
//          return true;
//        out.write("</p>\n");
//        out.write("\t\t \t\t\t\t\t\t<div class=\"text-center\">  <a class=\"btn btn-primary\" href=\"Controller?page=addtocart&action=clothing&id=");
//        if (_jspx_meth_c_out_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
//          return true;
//        out.write("\">Add to Cart</a> </div><br>\n");
//        out.write("\t\t \t\t\t\t\t</div>\n");
//        out.write(" \t\t\t\t\t\t\t\n");
//        out.write(" \t\t\t\t\t\t");
//        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
//        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
//          break;
//      } while (true);
//    }
//    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
//      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
//      return true;
//    }
//    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
//    return false;
//  }
//
//  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
//          throws Throwable {
//    PageContext pageContext = _jspx_page_context;
//    JspWriter out = _jspx_page_context.getOut();
//    //  c:out
//    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
//    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
//    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
//    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getName() }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
//    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
//    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
//      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
//      return true;
//    }
//    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
//    return false;
//  }
//
//  private boolean _jspx_meth_c_out_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
//          throws Throwable {
//    PageContext pageContext = _jspx_page_context;
//    JspWriter out = _jspx_page_context.getOut();
//    //  c:out
//    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
//    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
//    _jspx_th_c_out_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
//    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ product.getPrice() }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
//    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
//    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
//      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
//      return true;
//    }
//    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
//    return false;
//  }
//
//  private boolean _jspx_meth_c_out_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
//          throws Throwable {
//    PageContext pageContext = _jspx_page_context;
//    JspWriter out = _jspx_page_context.getOut();
//    //  c:out
//    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
//    _jspx_th_c_out_4.setPageContext(_jspx_page_context);
//    _jspx_th_c_out_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
//    _jspx_th_c_out_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getId()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
//    int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
//    if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
//      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
//      return true;
//    }
//    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
//    return false;
//  }
//}
