
public class Lab35{
	 public static void main(String[] args){  
	  TestDaemonThread3 t1=new TestDaemonThread3();//creating thread  
	  TestDaemonThread3 t2=new TestDaemonThread3();  
	  TestDaemonThread3 t3=new TestDaemonThread3();  
	  
	  t1.setDaemon(true);//now t1 is daemon thread  
	    
	  t1.start();//starting threads  
	  t2.start();  
	  t3.start();  
	 }  
	}  
class TestDaemonThread3 extends Thread{  
	 public void run(){  
		 if(Thread.currentThread().isDaemon()){//checking for daemon thread  
			   System.out.println("daemon thread work");  
		 }else{  
				   System.out.println("user thread work");      
	 }}}
	 