class Outer{
	void m1(){
		//Inner1 ob1=new Inner1();
		class Inner1{
			void show(){
				System.out.println("Inner1");
			}
		}
		new Inner1().show();
		//Inner1 ob1=new Inner1();
	}
	void m2(){
		class Inner2{}
	}
	void m3(){
	/*Inner1 ob1=new Inner1();
	Inner2 ob2=new inner2();*/
	}
}
public class Lab08 {
	public static void main(String[] args) {
		new Outer().m1();
	}

}
