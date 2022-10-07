package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class Flights_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Phoenix-Travels</title>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        <div class=\"main\">\n");
      out.write("            <div class=\"navbar\">\n");
      out.write("                <a href=\"Flights.jsp\"><img src=\"3.png\" class=\"logo\"></a>\n");
      out.write("                <nav>\n");
      out.write("                    <ul>\n");
      out.write("                        <li class=\"active\"><a href=\"Flights.jsp\">Staff G1</a></li>\n");
      out.write("                        <li><a href=\"Flights.jsp\">Flights</a></li>\n");
      out.write("                        <li><a href=\"index.html\">Add Flights</a>\n");
      out.write("                        <li><a href=\"tickets.html\">Tickets</a></li>\n");
      out.write("                        <li><a href=\"home.jsp\">Clients</a></li>\n");
      out.write("                        <li><a href=\"registration.jsp\">Log Out</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <br><br>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <center><h1><b>Available Flights</b></h1></center>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <center><form method=\"get\" action=\"flightdata\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <h3><b>Select Flight</b></h3>\n");
      out.write("                        <br>\n");
      out.write("        ");
 
            Connection con;
            PreparedStatement pat;
            ResultSet rs;
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost/flights","root","");
                pat=con.prepareStatement("select distinct Flight_ID from flights");
                rs=pat.executeQuery();
                
                if(rs.next())
                {
                    out.println("<tr>");
                    out.println("<td> Choose Flight</td>");
                    out.println("<td>");
                    out.println("<select Flight_ID='combo'>");
                do{
                    String Flight_ID = rs.getString("Flight_ID");
                    out.println("<option value='"+ Flight_ID + "'>" + Flight_ID + "</option>");
                }
                while(rs.next());
                out.println("</select>");
                rs.close();
                out.println("</td></tr>");
                out.println("</tr><td colspan=2 align=center><input type=submit value=Show></td></tr>");
                }
            
            else
            {
                out.println("<tr>");
                out.println("<td colsppan=2 alingn=right>");
                out.println("Sorry Table is empty");
                out.println("</td");
            }
            out.println("</table");
            out.println("/form");
            }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </form>\n");
      out.write("                </center>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("        <br><br>\n");
      out.write("        \n");
      out.write("    </header>\n");
      out.write("    \n");
      out.write("   \n");
      out.write("    \n");
      out.write("</body>\n");
      out.write("\n");
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
