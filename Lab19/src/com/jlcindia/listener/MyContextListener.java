package com.jlcindia.listener;

import javax.servlet.*;

import javax.servlet.annotation.WebListener;

@WebListener

public class MyContextListener implements ServletContextListener{
	public MyContextListener(){
		System.out.println("**MyContextListener() Def Cons");
	}
	public void contextDestroyed(ServletContextEvent event){
		ServletContext ctx=event.getServletContext();
		System.out.println("**ContextDestroyed :"+ctx);
	}
	public void contextInitialized(ServletContextEvent event){
		ServletContext ctx=event.getServletContext();
		System.out.println("**contextInitialized :"+ctx);
	}

}
