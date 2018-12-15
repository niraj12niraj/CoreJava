package com.jlcindia.listener;


import javax.servlet.annotation.WebListener;
import javax.servlet.http.*;
@WebListener
public abstract class MySessionListener implements HttpSessionListener{
public MySessionListener(){
	System.out.println("**MySessionListener() Def cons :");
}
public void sessionCreate(HttpSessionEvent arg0){
	System.out.println("**Session Created");
}
public void sessionDestroyed(HttpSessionEvent arg0){
	System.out.println("**Session Destroyed");
}
}