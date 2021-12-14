package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// ServletConfig & ServletContext
// servletconfig specific to that servlet and servletcontext to all servlet

public class config extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out= res.getWriter();
		out.print("hi");
		
//		To get the xml param , getservletcontext ( comes from htttpservlet which extend jsp servlets), req.getservletcontext
		
		ServletContext ctx= getServletContext();
		String name= ctx.getInitParameter("Name");
		out.println(name);
		
		ServletConfig cng= getServletConfig();
		String dept= cng.getInitParameter("Name");
		out.println("<html><body bgcolor='cyan'>");
		out.println(dept);
		out.print("</body></html>");
	}
}
