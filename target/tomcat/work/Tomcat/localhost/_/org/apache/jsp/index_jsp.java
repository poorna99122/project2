/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-08-10 15:52:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write('\n');
      out.write('\n');

    /*If user tries to click on browser back button then he/ she should not be able to access this page*/
    response.setHeader("Cache-Control", "no-cache");
    response.setHeader("Cache-Control", "no-store");
    response.setHeader("Pragma", "no-cache");
    response.setDateHeader("Expires", 0);

      out.write("\n");
      out.write("\n");
      out.write("<!--\n");
      out.write("\tTODO: 4.11. If a user is already logged in then, redirect the user to the Home.jsp page directly.\n");
      out.write("\t(Hint: Make use of the email id stored in the session object. This email id should be stored in\n");
      out.write("\tthe session object when the user successfully signs in or sign up.)\n");
      out.write("-->\n");
      out.write("\n");
      out.write("<!--\n");
      out.write("\tTODO: 4.4. Design the \"Sign In / Sign Up\" page with following properties.\n");
      out.write("\t    1. Title of the page should be \"Sign In / Sign Up\"\n");
      out.write("\t    2. Provide method and action attributes of the form tag such that when user submit\n");
      out.write("\t        the form, the doPost() method of UserServlet get invoked.\n");
      out.write("\t    3. Provide \"User Email:\" label along with the text field as shown on the learn platform.\n");
      out.write("\t    4. Also, for the \"User Email:\" text field, provide placeholder as \"example@email.com\" and\n");
      out.write("\t        make this field required.\n");
      out.write("\t    5. Provide \"Password:\" label along with the text field as shown on the learn platform.\n");
      out.write("        6. Also, for the \"Password:\" text field, provide type as password, placeholder as \"********\"\n");
      out.write("            and make this field required.\n");
      out.write("        7. Use the table tag to align the labels and text fields.\n");
      out.write("        8. Provide \"Sign In\" and \"Sign Up\" submit buttons.\n");
      out.write("\n");
      out.write("-->\n");
      out.write("\n");
      out.write("<html>\n");
      out.write(" <head>\n");
      out.write("     <title>Sign In / Sign Up</title>\n");
      out.write(" </head>\n");
      out.write("\n");
      out.write("     <body>\n");
      out.write("     <form method=\"post\" action=\"/ublog/user\">\n");
      out.write("         <table>\n");
      out.write("             <tr>\n");
      out.write("                 <td>");
      out.write("<label for=\"emailId\">User Email:</label></td>\n");
      out.write("                 <td><input type=\"text\" placeholder=\"example@gmail.com\" required=\"required\" name=\"emailId\"/></td>\n");
      out.write("             </tr>\n");
      out.write("             <tr>\n");
      out.write("                 <td>");
      out.write("<label for=\"password\">Password:</label></td>\n");
      out.write("                 <td><input type=\"password\" placeholder=\"*********\" required=\"required\" name=\"password\"/></td>\n");
      out.write("             </tr>\n");
      out.write("         </table>\n");
      out.write("\n");
      out.write("           <input type=\"submit\" value=\"Sign In\" name=\"actionType\"/>\n");
      out.write("           <input type=\"submit\" value=\"Sign Up\" name=\"actionType\"/>\n");
      out.write("          <br><br>\n");
      out.write("          ");

              try{
                  if((Boolean) request.getAttribute("isError")){
                      out.println(request.getAttribute("errorMessage"));
                  }
              }
              catch(NullPointerException e){

              }

          
      out.write("\n");
      out.write("     </form>\n");
      out.write("     </body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--\n");
      out.write("    TODO: 4.12. Write the Java code to display the error message present in the request object. The\n");
      out.write("    error message should be displayed below the Sign In and Sing Up buttons. These error messages\n");
      out.write("    will be set inside the UserServlet. There can be multiple error messages such as\n");
      out.write("    \"No user registered with the given email address!\" when a user tries to log in using an\n");
      out.write("    email address which is not registered in the database. The java code should be able to print\n");
      out.write("    all such kinds of error messages.\n");
      out.write("-->\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
