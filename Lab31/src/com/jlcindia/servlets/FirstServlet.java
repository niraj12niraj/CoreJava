package com.jlcindia.servlets;
import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
public class FirstServlet extends HttpServlet {  
public void doGet(HttpServletRequest request, HttpServletResponse response){  
        try{  
 
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
          
        String n=request.getParameter("userName");  
	        out.print("Welcome "+n);  
          
	        //creating form that have invisible textfield  
	   //out.print("<form action='SecondServlet'>");  
      // out.print("<input type='hidden' name='userName' value='"+n+"'>");  
      //out.print("<input type='submit' value='go'>");  
       //out.print("</form>");  
     //appending the username in the query string  
      //out.print("<a href='SecondServlet?userName="+n+"'>visit</a>");  
         
	        HttpSession session=request.getSession();  
	               session.setAttribute("userName",n);  
	       	  
	              out.print("<a href='servlet2'>visit</a>");  

       out.close();  

	                }catch(Exception e){System.out.println(e);}  
	    }  
	  
	}  

