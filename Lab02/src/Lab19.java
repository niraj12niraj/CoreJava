  
public class Lab19 {
	static {
		System.out.println("sb1");
	}

public static void main(String... args) 
//static public final synchronized strictfp  void main(String... args)
{
System.out.println("Main :"+Hello1.a);	
	
}
}
class Hello1{
	static int a=10;
	static Hello1 h=new Hello1();
	{
		System.out.println("IB");
	}
	static{
		System.out.println("SB");
		//static 
		int b;
		b=0;
		//static
			String str="12";
			System.out.println(b);
			System.out.println(str);
		
		
	}
	class Hai{
		//public static void main(String... args)
		{
			//System.out.println("Hai Main");
		}
	}
}
