class A1{
	public void show(){
		System.out.println("super");
	}
}
class B1 extends A1{
	public void show(){
		System.out.println("In child");
	}
}
public class Lab10 {
	public static void main(String[] args) {
		A1 obj=new B1();
		obj.show(); 
	}

}
