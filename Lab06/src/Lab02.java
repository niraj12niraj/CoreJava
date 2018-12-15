class Hai{
	public void finalize(){
		System.out.println("Hai-Finalize");
	}
}
class Hello{
	void show(){
		System.out.println("Hello-show()");
	}
	void m1(){
		System.out.println("M1-statrt");
		Hai h1=new Hai();
		Hai h2=new Hai();
		Hai h3=new Hai();
		System.out.println(h1);
	}
	public void finalize(){
		System.out.println("Hello-Finalize");
	}
}
public class Lab02 {
public static void main(String[] args) {
	new Hello().show();
	Hello h1=new Hello();
	h1=null;
	Hello h2=new Hello();
	Hello h3=new Hello();
	h2=h3;
	new Hello().m1();
	//System.runFinalization();
	System.gc();
	
}
}
