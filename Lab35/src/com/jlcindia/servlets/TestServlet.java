package com.jlcindia.servlets;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class TestServlet extends HttpServlet{
public void service(HttpServletRequest req,HttpServletResponse res)throws
ServletException,IOException{
	//1-Collect parameter
	String sn=req.getParameter("sname");
	String em=req.getParameter("email");
	String ems[]=req.getParameterValues("email");
	System.out.println(sn);
	System.out.println(em);
	for(String str:ems){
	System.out.println(str);
	}
	//2-Collect Headers
	String ho=req.getHeader("host");
	String re=req.getHeader("referer");
	String al=req.getHeader("accept-languge");
	String ae=req.getHeader("accept-encoding");
	System.out.println(ho);
	System.out.println(re);
	System.out.println(al);
	System.out.println(ae);
	//3-Collect Cookie
	Cookie ck[]=req.getCookies();
	for(Cookie c:ck){
		System.out.println(c.getName()+"----"+c.getValue());
	}
	Cookie ck1=new Cookie("email","Sri@jlc.com");
	Cookie ck2=new Cookie("phone","53354465");
	res.addCookie(ck1);
	res.addCookie(ck2);
	RequestDispatcher rd=req.getRequestDispatcher("show.jsp");
	rd.forward(req, res);
}
}
