

public class Lab24 {
	public static void main(String[] args) {
		ThreadGroup tg=new ThreadGroup("jlc");
		MyThread5 t1=new MyThread5(tg,"Hello");
		MyThread5 t2=new MyThread5(tg,"Hai");
	}
	

}
class MyThread5 implements Runnable{
	MyThread5(ThreadGroup tg,String tname){
		Thread t=new Thread(tg,this,tname);
		t.start();
		
	}
	public void run(){
		Thread th=Thread.currentThread();
		ThreadGroup tg=th.getThreadGroup();
		System.out.println("Thread Name :"+th.getName());
		System.out.println("Thread Group :"+tg.getName());
	}
}
