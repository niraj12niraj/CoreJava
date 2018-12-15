
public class Lab05 {
public static void main(String[] args) {
	Student5 st=new Student5("jlc-001");
	new Student5("jlc-002");
	System.runFinalizersOnExit(true);
	//System.runFinalizersOnExit(false);
	System.out.println("Main Completed");
}
}
class Student5{
	String sid;
	Student5(String sid){
		this.sid=sid;
		System.out.println("Object Created with id :"+sid);
	}
protected void finalize(){
	System.out.println("Finalize :"+sid);
}}
