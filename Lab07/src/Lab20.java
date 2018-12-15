
public class Lab20 {
	public static void main(String[] args) {
		MyThread1 t1=new MyThread1();
		MyThread1 t2=new MyThread1();
	}

}
class MyThread1 extends Thread{
	MyThread1(){
		//start();
		Thread t=new Thread(this);
		t.start();
	}
	public void run(){
		Thread th=Thread.currentThread();
		ThreadGroup tg=th.getThreadGroup();
		System.out.println("Thread Name :"+th.getName());
		System.out.println("Thread Group Name :"+tg.getName());
	}
}
