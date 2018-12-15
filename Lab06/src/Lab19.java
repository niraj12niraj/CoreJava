
public class Lab19 {
	public static void main(String[] args) {
		int  i=Integer.parseInt("101",2);
		System.out.println(i);
		int ref=Integer.valueOf("101",2);
		System.out.println(ref);
		int  i1=Integer.parseInt("101",8);
		System.out.println(i1);
		int ref1=Integer.valueOf("101",8);
		System.out.println(ref1);
		System.out.println(Character.isMirrored('a'));
		System.out.println(Character.isMirrored('A'));
		System.out.println(Character.isMirrored(']'));
		System.out.println(Character.isMirrored('('));
		Character c1=new Character('A');
		System.out.println(c1.hashCode());
		int in1=123;
		int in2=124;
		System.out.println(in1==in2);
		in1++;
		System.out.println(in1==in2);
		in1++;
		System.out.println(in1==in2);
		in2++;
		System.out.println(in1==in2);
		++in1;
		System.out.println(in1==in2);
		System.out.println(++in1==in1++);
		System.out.println(++in1==in1--);
		System.out.println(++in1==--in1);
		System.out.println(in1++==++in1);
		System.out.println(in1++==in1);
		System.out.println(in1++==in1++);
		System.out.println(in1);
	}

}
