package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class AddServlet extends HttpServlet{

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//
//		public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
//			
//			int i = Integer.parseInt(req.getParameter("num1"));
//			int j = Integer.parseInt(req.getParameter("num2"));
//			
//			int k=i+j;
//			
//			PrintWriter out= res.getWriter();
//			
//			out.println("res"+k);
//			
//		
//			
//		}
	
//	only accept post method
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
	
	int i = Integer.parseInt(req.getParameter("num1"));
	int j = Integer.parseInt(req.getParameter("num2"));
	
	int k=i+j;
	
	PrintWriter out= res.getWriter();
	
	out.println("res"+k);
	
}
	
//	only accept get method
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
	int i = Integer.parseInt(req.getParameter("num1"));
	int j = Integer.parseInt(req.getParameter("num2"));
	
	int k=i+j;
	
	
		
//		Send data from one servlet to another
//	1.cookies
//	2.session management
//	3.URL Rewritting
	
// 	res.sendRedirect("square?k="+k); //URL Rewriting
	
//	session
//	HttpSession session = req.getSession();
//	session.setAttribute("k", k);
//	res.sendRedirect("square");
	
//	cookies
	Cookie cookie = new Cookie("k",k+"");
	res.addCookie(cookie);
	res.sendRedirect("square");
	
//  To call another servlet two methods "redirect and request dispatcher"
		
//	req.setAttribute("k",k);
//		
//	RequestDispatcher rd= req.getRequestDispatcher("square");  
//	rd.forward(req, res);
}
}
			
			
			
			