package com.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginCheck")
public class Servlet extends HttpServlet {
	

//		@Override
//		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//			resp.setContentType("text/html");
//			
//			String uname = req.getParameter("uname");
//			String pwd = req.getParameter("pwd");
//			
//			if(uname.equals("majrul") && pwd.equals("123456"))
//				resp.getWriter().write("<h1>Welcome back</h1>");
//			else
//				resp.getWriter().write("<h1>Invalid Username/Password</h1>");
//					
//		}
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
resp.setContentType("text/html");
		
		String uname = req.getParameter("uname");
		String pwd = req.getParameter("pwd");
		
		if(uname.equals("surbhi") && pwd.equals("12345"))
			resp.getWriter().write("<h1 id='text'>Welcome back</h1>");
		else
			resp.getWriter().write("<h1>Invalid Username/Password</h1>");}
				
	
	}


