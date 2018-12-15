//import java.io.*;
public class Lab01 {
public static void main(String[] args) 
{
	/*//Object obj=new Object();
	//Object obj1=obj.clone();
	//System.out.println(obj==obj1);*/
	Student1 st1=new Student1(11);
	Student1 st2=st1.clone();
	System.out.println(st1==st2);
	System.out.println(st1.sid);
	System.out.println(st2.sid);
}
}
class Student1 //implements Cloneable
{
	int sid;
	Student1(int sid){
	this.sid=sid;
}
public  Student1 clone(){
	return new Student1(this.sid);
	
}
}
	/*Hello h1=new Hello(99);
	Hello h2=h1.clone();
	System.out.println(h1==h2);
	System.out.println(h1.a);
	System.out.println(h2.a);
	
	
}}
class Hello{
	int a;
	Hello(int a){
		this.a=a;
	}
	public Hello clone(){
		return new Hello(this.a);
	}
}*/