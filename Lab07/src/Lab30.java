
public class Lab30 {
	 public static void main(String args[]){  
		  TestSleepMethod1 t1=new TestSleepMethod1();  
		  TestSleepMethod1 t2=new TestSleepMethod1();  
		   
		  //t1.start();  
		  //t2.start(); 
		  t1.run();
		  //t2.resume();
		  //t2.run();
		  //t1.start();
		  //t2.start();
		  t2.run();
		  //t2.start();
		  //t1.run();
		  //t1.start();
		 }  
}
class TestSleepMethod1 extends Thread{  
	 public void run(){  
	  for(int i=1;i<5;i++){  
	    try{Thread.sleep(500);
	    }catch(InterruptedException e)
	    {System.out.println(e);}  
	    System.out.println(i);  
	  }  
	 }  
	
	}  