package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DTOS.Phone;
import java.util.ArrayList;

public final class ListPhone_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            section{    \n");
      out.write("            }\n");
      out.write("            .img {\n");
      out.write("            text-align: center;\n");
      out.write("            border: solid 1px black;\n");
      out.write("            padding: 5px;\n");
      out.write("            margin: 5px;\n");
      out.write("            height: 250px;\n");
      out.write("            width: 200px;\n");
      out.write("            float: left;\n");
      out.write("            }\n");
      out.write("            div{\n");
      out.write("                display: inline-block;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section>\n");
      out.write("            ");
  ArrayList<Phone> lst = new ArrayList<>();
                lst = (ArrayList<Phone>) request.getAttribute("Phones");
                for(Phone p : lst){
      out.write("\n");
      out.write("                <div class=\"img\">\n");
      out.write("                    ");
      out.print( p.getPhoneName() );
      out.write(" <br><img \n");
      out.write("                        src=\"images/");
      out.print( p.getImageURL() );
      out.write("\" width=\"120\"> <br>\n");
      out.write("                    ");
      out.print( p.getPrice() );
      out.write("Đ <br>\n");
      out.write("                    <a href=\"ControllerServlet?action=delete\">delete</a> |\n");
      out.write("                    <a href=\"ControllerServlet?action=update\">update</a>\n");
      out.write("                </div>    \n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </section>\n");
      out.write("        <footer> <a href=ControllerServlet?action=add\">Add new items</a> </footer>\n");
      out.write("    </body>\n");
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
