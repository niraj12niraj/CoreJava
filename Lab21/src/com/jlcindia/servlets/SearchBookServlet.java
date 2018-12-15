package com.jlcindia.servlets;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SearchBookServlet extends HttpServlet{
protected void service(HttpServletRequest req,HttpServletResponse res)throws 
ServletException,IOException{
	String cat=req.getParameter("category");
	if(cat!=null&&cat.equals("Java")){
		ArrayList<String>blist=new ArrayList<String>();
		blist.add("java");
		blist.add("jdbc");
		blist.add("jsp");
		blist.add("servlet");
		blist.add("ejb");
		blist.add("rmi");
		HttpSession sess=req.getSession();
		sess.setAttribute("BOOKS", blist);
		}
	else{
		req.setAttribute("MSG", "No books found with category"+cat);
	}
	RequestDispatcher rd=req.getRequestDispatcher("showbooks.jsp");
	rd.forward(req, res);
}
}
