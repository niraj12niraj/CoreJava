package com.jlcindia.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class HelloServlet extends HttpServlet {
	protected void service(HttpServletRequest req,HttpServletResponse res)throws
	ServletException,IOException{
	System.out.println("**HelloServlet Class Service() Started");
	Writer out=res.getWriter();
	out.write("<h1>Verify the server Console");
	System.out.println("HelloServlet Class Service() Completed");
	}

}
