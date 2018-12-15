package com.jlcindia.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class TestServlet extends HttpServlet{
	protected void service(HttpServletRequest req,HttpServletResponse res)throws
	ServletException,IOException{
		System.out.println("**service() method of TestServlet**");
		Writer out=res.getWriter();
		out.write("<h1>Hi,Welcome to JLC");
	}}