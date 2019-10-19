package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckB extends HttpServlet
{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
		      response.setContentType("text/html");

		      PrintWriter out = response.getWriter();

			String mathsFlag=request.getParameter("maths");
			String physicsFlag=request.getParameter("physics");
			String historyFlag=request.getParameter("history");

			String result = "Math  :"+mathsFlag+"\n"+"Physics : "+physicsFlag+"\n"+"history :"+historyFlag;

			out.println("<h>"+result+"</h>");
		   }
			
		   // Method to handle POST method request.
		   public void doPost(HttpServletRequest request, HttpServletResponse response)
		      throws ServletException, IOException {
		      doGet(request, response);
		   }
}
