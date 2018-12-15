
public class Lab22 {
	public static void main(String[] args) {
		String st1="jlc";
		String st2=new String("jlc");
		String st3=st2.intern();
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		System.out.println(st1==st2);
		System.out.println(st1==st3);
		 System.out.println();
		 String st4="OK".intern();
		 System.out.println(st4);
		 String st5="OK";
		 System.out.println(st4==st5);
		 System.out.println(st5);
	}
	
		
	}

