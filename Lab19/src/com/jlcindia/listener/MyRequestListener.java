package com.jlcindia.listener;

import javax.servlet.*;

import javax.servlet.annotation.WebListener;

@WebListener

public class MyRequestListener implements ServletRequestListener{
public MyRequestListener(){
	System.out.println("**MyRequestListener() Def cons :");
}
public void requestDestroyed(ServletRequestEvent arg0){
	System.out.println("**requestDestroyed");
}
public void requestInitialized(ServletRequestEvent arg0){
	System.out.println("**requestInitialized");
}
}