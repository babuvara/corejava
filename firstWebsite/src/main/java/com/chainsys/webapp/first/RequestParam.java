package com.chainsys.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class InitParam
 */
public class RequestParam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @return 
     * @see HttpServlet#HttpServlet()
     */
    public RequestParam() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost called");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		// javax.servlet.http.HttpSession ses = request.getSession(true);
		String str_name =(String) request.getParameter("name");  //request to scope
		   out.println("<div>"+str_name+"</div>");
	        String str_company = (String)request.getParameter("company");  //it read the key name given in html
	        out.println("<div>"+str_company+"</div>");

//		Enumeration enu = getInitParameterNames();  // Enumeration is like iterator
//		  while(enu.hasMoreElements())
//		    {
//		  		String init = (String)enu.nextElement();
//		  		out.println(init+" : " +getInitParameter(init)+"<br>");
//		    }
		out.println("INSIDE");
	}

}
