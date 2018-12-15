package com.jlcindia.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
@WebServlet(name="regServlet",urlPatterns={"/register.jlc"})
public class TestServlet extends HttpServlet{
	protected void service(HttpServletRequest req,HttpServletResponse res)throws
	ServletException,IOException{
		//-verifying the html action
		String uri=req.getRequestURI();
		Writer out=res.getWriter();
		res.setContentType("text/html");
		out.write("<h1>Request processed with action :"+uri);
	}

}
