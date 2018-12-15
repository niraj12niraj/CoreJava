
public class X {
	public static void main(String[] args) {
		new Y().m1();
		new Z().m1();
		Z z=new Z();
		z.m2();
		Y y=new Y();
		y.m1();
		y.m2();
		z.m1();
		//Z.m1();
		//Y.m1();
		Y.m2();
		Z.m2();
	}

}
class Y{
	void m1(){}
	static void m2(){
		
	}
}
class Z extends Y{
	void m1(){}
	static void m2(){}
}
