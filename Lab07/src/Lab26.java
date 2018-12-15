


public class Lab26 {
	public static void main(String[] args) {
		ThreadGroup tg=new ThreadGroup("jlc");
		MyThread7 t1=new MyThread7();
		MyThread7 t2=new MyThread7();
		t1.start();
		t1.setName("Hello");
		t2.start();
		t2.setName("Hai");
		
		
	}
	

}
class MyThread7 extends Thread{
	
	public void run(){
		Thread th=Thread.currentThread();
		ThreadGroup tg=th.getThreadGroup();
		System.out.println("Thread Name :"+th.getName());
		System.out.println("Thread Group :"+tg.getName());
	}
}
