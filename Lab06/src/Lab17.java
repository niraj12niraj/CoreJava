
public class Lab17 {
	public static void main(String[] args) {
		String st1="Website is www.jlcindia.com";
		String st2="info@jlcindia.com is id to send email";
		boolean b1=st1.regionMatches(2,st2, 5,10);
		System.out.println(b1);
		boolean b2=st1.regionMatches(15, st2, 5,9);
		System.out.println(b2);
	}

}
