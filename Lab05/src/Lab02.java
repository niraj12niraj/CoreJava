abstract interface Inter{
	void m1();
	void m2();
	int A=10;
	int B=20;
}
/*interface Inter{
	
}*/
interface Inter1{
    void m2();
	void m3();
	int A=12;
	int C=30;
}
class Hello implements Inter,Inter1{
	public void m1(){
		System.out.println("Hello->m1()");
	}
	public void m2(){
		System.out.println("Hello->m2()");
	}
	public void m3(){
		System.out.println("Hello->m3()");
		System.out.println(Inter.A);
		System.out.println(Inter1.A);
		System.out.println(B);
		System.out.println(C);
	}
}
/*class Hai extends Hello{
	public  void m3(){
		System.out.println("Hai->m3()");
	}
	void m4(){
		System.out.println("Hai->m4()");
	}
}*/

public class Lab02 {
public static void main(String[] args) {
	System.out.println("Hello Guys");
	Hello h=new Hello();
     Inter ref=h;
     ref.m1();
     ref.m2();
     Inter1 ref1=h;
     ref1.m2();
     ref1.m3();
     
	/*h.m1();
	h.m2();
	h.m3();
	/*System.out.println(h.A);
	System.out.println(h.B);
	h.m2();
	h.m1();
	
	/*
	Inter ref=null;
	//ref=new Inter();
	ref=new Hello();
	ref.m1();
	ref.m2();
	/*ref=new Hai();
	ref.m3();
	ref.m4();
	
	Inter ref1=new Hai();
	ref1.m4;*/
	
	
}
}
