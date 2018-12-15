
public class LAB50 {
	public static void main(String[] args) {
		Hello11 h1=new Hello11();
		Hello11 h2=new Hello11();
		MyThread18 th1=new MyThread18(h1);
		//MyThread18 th2=new MyThread18(h1);
		MyThread18 th3=new MyThread18(h2);
		th1.start();
		//th2.start();
		th3.start();
	}

}
class MyThread18 extends Thread{
	Hello11 h=null;
	MyThread18(Hello11 h){
		this.h=h;
	}
	public void run(){
		h.show();
	}
}
class Hello11{
	synchronized void show(){
		Thread th=Thread.currentThread();
		for(int i=0;i<3;i++){
			System.out.println(th.getName()+"-SHOW :"+"\t"+this);
			try{
				Thread.sleep(500);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}