
public class Lab21 {
	public static void main(String[] args) {
		MyThread2 t1=new MyThread2("Hello");
		MyThread2 t2=new MyThread2("Hai");
	}

}
class MyThread2 extends Thread{
	MyThread2(String tname){
		super(tname);
		//Thread t=new Thread(this);
		//t.start();
		start();
	}
	public MyThread2() {
		// TODO Auto-generated constructor stub
	}
	public void run(){
		Thread th=Thread.currentThread();
		ThreadGroup tg=th.getThreadGroup();
		System.out.println("Thread Name :"+th.getName());
		System.out.println("Thread Group :"+tg.getName());
	}
}
