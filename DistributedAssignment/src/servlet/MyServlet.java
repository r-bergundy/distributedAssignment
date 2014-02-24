package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		PrintWriter out = res.getWriter();
		
		String user = req.getParameter("user");
		String password = req.getParameter("pass");
		
		
		
		out.println("<HTML><BODY>");
		out.println("Your Username is: "+user + ", Password: " + password);
		out.println("<div><ol><li>Coffee</li><li>Tea</li><li>Milk</li></ol></div>");
		out.println("</BODY></HTML>");
	}

}
