

public class Lab25 {
	public static void main(String[] args) {
		ThreadGroup tg=new ThreadGroup("jlc");
		MyThread6 t1=new MyThread6(tg);
		MyThread6 t2=new MyThread6(tg);
	}
	

}
class MyThread6 implements Runnable{
	MyThread6(ThreadGroup tg){
		Thread t=new Thread(tg,this);
		t.start();
		
	}
	public void run(){
		Thread th=Thread.currentThread();
		ThreadGroup tg=th.getThreadGroup();
		System.out.println("Thread Name :"+th.getName());
		System.out.println("Thread Group :"+tg.getName());
	}
}
