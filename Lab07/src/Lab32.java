
public class Lab32 {
	public static void main(String[] args) {
		MyThread8 t1=new MyThread8();
		//t1.setPriority(3);
		//t1.setPriority(11);
		//t1.setPriority(0);
		//t1.setPriority(1);
		System.out.println(t1);
		t1.setName("Hello");
		System.out.println(t1);
		
	}

}
class MyThread8 extends Thread{}
