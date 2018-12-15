package com.jlcindia.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AddToCartServlet extends HttpServlet{
	protected void service(HttpServletRequest req,HttpServletResponse res)throws 
	ServletException,IOException{
		//Accessing the existing session object
		HttpSession sess=req.getSession(false);
		//validating session is available or not
		if(sess==null){
			req.setAttribute("MSG", "Session is destroyed");
			}else{
				String bnm=req.getParameter("bname");
				//adding the client selected book to session
				sess.setAttribute(bnm, bnm);
				req.setAttribute("ADDED", bnm+" is added to cart");
			}
		RequestDispatcher rd=req.getRequestDispatcher("showBooks.jsp");
		rd.forward(req, res);
	}

}
