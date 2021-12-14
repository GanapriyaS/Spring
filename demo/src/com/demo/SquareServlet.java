package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SquareServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
//		int k = (int)req.getAttribute("k");
		
//		int k = Integer.parseInt(req.getParameter("k"));
		
//		HttpSession session = req.getSession();
//		int k= (int)session.getAttribute("k");
//		session.removeAttribute("k");
		
		int k=0;
		Cookie cookies[]=req.getCookies();
		for (Cookie c:cookies) {
			if(c.getName().equals("k"))
			{
				k= Integer.parseInt(c.getValue());
			}
		}
		
		
		k=k*k;
		PrintWriter out= res.getWriter();
		
		out.println("result"+k);
		
	}
}


// Lifecycle of servlet - init,service and destroy  |   HttpServletResponse and Request are interfaces , this object is given by tomcat