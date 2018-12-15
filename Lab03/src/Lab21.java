class A2{
	void show(int ab){
		System.out.println("A2 Show()");
	}
}
class B2 extends A2{
	void show(int ab){
		System.out.println("B2 show()");
	}
}
public class Lab21 {
public static void main(String[] args) {
	A2 ref=new A2();
	ref.show(67);
}
}
