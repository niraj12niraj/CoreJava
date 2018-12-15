package com.jlcindia.servlets;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class RemoveFromCartServlet extends HttpServlet{
protected void service(HttpServletRequest req,HttpServletResponse res)throws
ServletException,IOException{
	HttpSession sess=req.getSession(false);
	if(sess==null){
		req.setAttribute("MSG", "Session is destroyed");
	}else{
		String bnm=req.getParameter("bname");
		//removing the client selected from session
		sess.removeAttribute(bnm);
	}
	RequestDispatcher rd=req.getRequestDispatcher("showcart.jlc");
	rd.forward(req, res);
}
}
