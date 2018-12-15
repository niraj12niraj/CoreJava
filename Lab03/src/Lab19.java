
public class Lab19 {
public static void main(String[] args) {
System.out.println("Main :"+Hello.a);	
	
}
}
class Hello{
	static int a=10;
	 //static Hello h;
	//=new Hello();
	{
		System.out.println("IB");
	}
	static{
		System.out.println("SB");
	}
	Hello h1;
	
	static Hello h2;
	{
         System.out.println("h2");
        	 System.out.println("h1");
}
	static{
		System.out.println("last");}
	static Hello h;//=new Hello();
	}
