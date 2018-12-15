
public class Lab22 {
	public static void main(String[] args) {
		//ThreadGroup tg=new ThreadGroup("jlc");
		MyThread3 t1=new MyThread3("Hello");
		MyThread3 t2=new MyThread3("Hai");
	}
	

}
class MyThread3 implements Runnable{
	MyThread3(String tname){
		Thread t=new Thread(this,tname);
		t.start();
		
	}
	public void run(){
		Thread th=Thread.currentThread();
		ThreadGroup tg=th.getThreadGroup();
		System.out.println("Thread Name :"+th.getName());
		System.out.println("Thread Group :"+tg.getName());
	}
}
