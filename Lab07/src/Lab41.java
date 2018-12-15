import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors;  
public class Lab41 {
public static void main(String[] args) {
	WorkerThread wt=new WorkerThread();
	//WorkerThread wt1=new WorkerThread();
	wt.run();
	//wt1.run();
}
}
class WorkerThread implements Runnable {  
    private String message;  
    public WorkerThread(String s){  
        this.message=s;  
    }  
     public WorkerThread() {
		// TODO Auto-generated constructor stub
	}
	public void run() {  
        System.out.println(Thread.currentThread().getName()+
        		" (Start) message = "+message);  
        processmessage();
        //call processmessage method that sleeps the thread for 2 seconds  
        System.out.println(Thread.currentThread().getName()+" (End)");
        //prints thread name  
    }  
    private void processmessage() {  
        try {  Thread.sleep(2000);  
        } catch (InterruptedException e)
        { e.printStackTrace(); }  
    }  
}  
