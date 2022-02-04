package packageApp;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Myservlet extends HttpServlet {

 public void doGet(HttpServletRequest request, 
  HttpServletResponse response) 
  throws ServletException, IOException {
  
  PrintWriter out = response.getWriter();
  out.println("<HTML>");
  out.println("<HEAD>");
  out.println("<TITLE>Servlet Testing</TITLE>");
  out.println("</HEAD>");
  out.println("<BODY>");
  out.println("Bonjour Lea Harrouz");
  out.println("</BODY>");
  out.println("</HTML>");
 }
}