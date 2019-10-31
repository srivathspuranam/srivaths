package application;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Success {
	 /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		protected void doGet(HttpServletRequest request,
	            HttpServletResponse response) throws ServletException, IOException {
	        PrintWriter writer = response.getWriter();
	 
	        writer.println("" + "" + "<center>"
	                + "Details Added Successfully" + "</center>" + ""
	                + "");
	    }
	 
}

