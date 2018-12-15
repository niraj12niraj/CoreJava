package com.jlcindia.listener;

import javax.servlet.*;


public class MyContextAttributeListener implements ServletContextAttributeListener{
public MyContextAttributeListener(){
	System.out.println("**MyContextAttributeListener()Def cons");
}
public void attributeAdded(ServletContextAttributeEvent event){
	String nm=event.getName();
	String val=event.getValue().toString();
	System.out.println("**attributeAdded() :"+nm+"\n"+val);
}
public void attributeRemoved(ServletContextAttributeEvent event){
	String nm=event.getName();
	String val=event.getValue().toString();
	System.out.println("**attributeRemoved() :"+nm+"\n"+val);
}

public void attributeReplaced(ServletContextAttributeEvent event){
	String nm=event.getName();
	String val=event.getValue().toString();
	System.out.println("**attributeReplaced() :"+nm+"\n"+val);
}
}