
public class Lab40 {
	 public static void main(String args[]){  
		  TestJoinMethod5 t1=new TestJoinMethod5();  
		  TestJoinMethod5 t2=new TestJoinMethod5();  
		  System.out.println("Name of t1:"+t1.getName());  
		  System.out.println("Name of t2:"+t2.getName());  
		  System.out.println("id of t1:"+t1.getId());  
		  
		  t1.start();  
		  t2.start();  
		  
		  t1.setName("Sonoo Jaiswal");  
		  System.out.println("After changing name of t1:"+t1.getName());  
		 }  
}
class TestJoinMethod5 extends Thread{  
	  public void run(){  
	   System.out.println("running...");  
	  }  
	
	}  