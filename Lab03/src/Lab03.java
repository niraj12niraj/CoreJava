
public class Lab03 {
public static void main(String[] args) {
	System.out.println("main");
	E e=new E();
	e.show();
	F f=new F();
	f.show();
}
}
class F{
	void show(){
		System.out.println("F");
	}
}
class E extends F{
	F f=new F();

 void show1(){
	 System.out.println("E");
 }
	
}
