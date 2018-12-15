class HelloA{
	{System.out.println("IB HelloA");
	class Inner{}
	}

static{
	System.out.println("SB-HelloA");
	class Inner{}
}
HelloA(){
	System.out.println("DC HelloA");
	class Inner{}
}
void m1(){
	System.out.println("m1() HelloA");
	class Inner{}
}
}
public class Lab07 {
	public static void main(String[] args) {
		System.out.println("Hello Guys");
	}

}
