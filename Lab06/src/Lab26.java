
public class Lab26 {
	public static void main(String[] args) {
		Hello1 h=Hello1.getHello1();
		System.out.println(h);
		System.out.println(Hello1.getHello1());
		System.out.println(Hello1.getHello1());
		Hello1 h2=(Hello1)h.clone();
		System.out.println(h2);
		
	}

}
class Hello1{
	private static Hello1 INS=null;
	/*static{
		INS=new Hello1();
	}*/
	private Hello1(){}
	public static Hello1 getHello1(){
		if(INS==null)
			INS=new Hello1();
		return INS;
	}
	protected Object clone(){
		return this;
	}
}
