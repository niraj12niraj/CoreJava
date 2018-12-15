package com.jlcindia.servlets;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;


public class TestServlet extends HttpServlet{
protected void service(HttpServletRequest req,HttpServletResponse res)throws
ServletException,IOException{
	System.out.println("TestSerclet()->service**");
	System.out.println("Accessing Session Object**");
	HttpSession sess=req.getSession();
	String eml=req.getParameter("email");
	ServletContext ctx=getServletContext();
	System.out.println("Storing Attribute");
	ctx.setAttribute("email", eml);
	System.out.println("Replaceing Attribute in Context");
	ctx.setAttribute("email", "raja@jlc.com");
	System.out.println("Removing Attribute in Context");
	ctx.removeAttribute("email");
	System.out.println("Invalidating Session Object");
	sess.invalidate();
	Writer out=res.getWriter();
	out.write("<h1>Verify the server console");
}
}
