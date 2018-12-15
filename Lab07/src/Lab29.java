
public class Lab29 {
	public static void main(String args[]){  
		Multi3 m1=new Multi3();  
		Thread t1 =new Thread(m1); 
		//Thread t2 =new Thread(m1);
		t1.start();
		t1.run();
		 }  
}
class Multi3 implements Runnable{  
	public void run(){  
	System.out.println("thread is running...");  
	}  
	  
	
	}  