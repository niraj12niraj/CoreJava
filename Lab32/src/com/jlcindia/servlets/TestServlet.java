package com.jlcindia.servlets;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class TestServlet extends HttpServlet{
protected void service(HttpServletRequest req,HttpServletResponse res)throws 
ServletException,IOException{
	String fnm=req.getParameter("fname");
	if(fnm==null||fnm.trim().length()==0){
		fnm="Guest";
	}
	Date dt=new Date();
	req.setAttribute("NM", fnm);
	req.setAttribute("DT", dt);
	req.getRequestDispatcher("show.jsp").forward(req,res);
}
}
