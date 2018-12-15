package com.jlcindia.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class LoginServlet extends HttpServlet {
	protected void service(HttpServletRequest req,HttpServletResponse  res)throws 
	ServletException,IOException{
		System.out.println("Service() of TestServlet**");
		String unm=req.getParameter("uname");
		String pwd=req.getParameter("pword");
		Writer out=res.getWriter();
		out.write("<h1>Welcome to JLC");
		String page="";
		boolean check=true;
		if(unm==null||unm.trim().isEmpty()){
			page="/WEB-INF/required.html";
			check=false;
			RequestDispatcher rd=req.getRequestDispatcher(page);
			rd.forward(req, res);
		}else
			if(pwd==null||pwd.trim().isEmpty()){
				page="/WEB-INF/required.html";
				check=false;
				RequestDispatcher rd=req.getRequestDispatcher(page);
				rd.forward(req, res);
			}
			if(check){
				if(unm.equals(pwd)){
					page="WEB-INF/home.html";
					RequestDispatcher rd=req.getRequestDispatcher(page);
					rd.forward(req,res);
				}else{
					page="WEB-INF/error.html";
					RequestDispatcher rd=req.getRequestDispatcher(page);
					rd.forward(req, res);
				}
			}
			out.write("<h1>Again Welcome to JLC");
			System.out.println("Service() completed -Last Statement**");
		}
		
	}

