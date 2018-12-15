
public class Lab23 {
	public static void main(String[] args) {
		ThreadGroup tg=new ThreadGroup("jlc");
		MyThread4 t1=new MyThread4(tg,"Hello");
		MyThread4 t2=new MyThread4(tg,"Hai");
	}
	

}
class MyThread4 extends Thread{
	MyThread4(ThreadGroup tg,String tname){
		super(tg,tname);
		start();
		
	}
	public void run(){
		Thread th=Thread.currentThread();
		ThreadGroup tg=th.getThreadGroup();
		System.out.println("Thread Name :"+th.getName());
		System.out.println("Thread Group :"+tg.getName());
	}
}
