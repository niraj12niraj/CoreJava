class A2{
	public void show(){
		System.out.println("super");
	}
}
class B2 extends A2{
	public void show(){
		System.out.println("child");
	}
	 public void display(){
		System.out.println("display");
	}
}
public class Lab12 {
	public static void main(String[] args) {
		A2 obj=new B2();
			obj.show();
			//obj.display();
			
		}
	}


