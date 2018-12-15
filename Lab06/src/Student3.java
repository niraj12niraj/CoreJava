
public class Student3 implements Cloneable{
int sid;
Student3(int sid){
	this.sid=sid;
}

public static void main(String[]args)throws Exception{
Student3 st1=new Student3(11);
Student3 st2=(Student3)st1.clone();
System.out.println(st1==st2);
System.out.println(st1.sid);
System.out.println(st2.sid);
}
}

