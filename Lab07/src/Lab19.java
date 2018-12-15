
public class Lab19 {
	public static void main(String[] args) {
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		t1.start();
		t2.start();
		Thread t=Thread.currentThread();
		for(int i=100;i>=90;i--){
			System.out.println(t.getName()+"-value is :"+i);
		}
	}

}
class MyThread extends Thread{
	public void run(){
		Thread th=Thread.currentThread();
		for(int i=20;i>=10;i--){
			System.out.println(th.getName()+"-value is :"+i);
		try{
			Thread.sleep(100);
		}catch(Exception e){
			e.printStackTrace();
		}
		}
	}
}
