package com.jlc.ref;
import java.io.Serializable;


public class Lab01 {
public static void main(String[] args) {
	try{
		String cname="com.jlc.ref.Student";
		Class cls=Class.forName(cname);
		showClassDetails(cls);
		Class cls1="OK".getClass();
		showClassDetails(cls1);
	}catch(Exception e){
		e.printStackTrace();
	}
}

private static void showClassDetails(Class cls) {
     System.out.println("\n***Name :"+cls.getName());
     Class superclass=cls.getSuperclass();
     System.out.println("Superclass :"+superclass.getName());
     Package pack=cls.getPackage();
     System.out.println("Package :"+pack.getName());
     Class interfs[]=cls.getInterfaces();
     System.out.println("Interfaces Implemented");
     for(int i=0;i<interfs.length;i++){
    	 Class intf=interfs[i];
    	 System.out.println("\t"+intf.getName());
     }}}
class Person implements Comparable{
	public int compareTo(Object o){
		return 0;
	}
}
class Student extends Person implements Serializable,Cloneable{}
