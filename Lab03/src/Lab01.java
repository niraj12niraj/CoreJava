
public class Lab01 {
	public static void main(String[] args) {
		Hai h1=new Hai();
		System.out.println(h1.a);
		System.out.println(h1.b);
		System.out.println(h1.c);
		
		//class Hello1{
		//static
        Hello1 h3=new Hello1();
		{
		System.out.println(h3.a);
		System.out.println(h3.b);
		System.out.println(h3.c);
		}
		Radha1 r1=new Radha1();
		
		System.out.println(r1.a);
		System.out.println(r1.b);
		System.out.println(r1.c);
	}

}
class Hai extends Hello1 {
	
	//static
		int a=12;
		//int b=01;
		//int c=02;
		
}
class Hello1 extends Radha1{
	//static
	int b=13;
}
class Radha1 {
	//static
	int c=14;
	static int a=10;
	static int  b=15;
}
class Ram extends Radha1{
	
}