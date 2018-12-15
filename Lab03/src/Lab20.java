class A1{
	int x=10;
}
class B1 extends A1{
	String x="jlc";
	void show(){
		System.out.println(x);
		System.out.println(super.x);
	}
}
public class Lab20 {
public static void main(String[] args) {
	B1 b=new B1();
	//A1 a=b;
	b.show();
}
}
