
public class Lab18 {
	public static void main(String[] args) {
		short s1=128;
		short s2=130;
		short s3=128;
		int a1=120;
		int a2=130;
		Integer a1i=new Integer(a1);
		Integer a2i=new Integer(a2);
		Short sref1=new Short(s1);
		Short sref2=new Short(s2);
		Short sref3=new Short(s3);
		System.out.println("compare");
		System.out.println(sref1.compareTo(sref1));
		System.out.println(sref1.compareTo(sref2));
		System.out.println(sref1.compareTo(sref3));
		System.out.println("--Compare(short,short)--");
		System.out.println(Short.compare(sref1,sref1));
		System.out.println(Short.compare(sref1,sref2));
		System.out.println(Short.compare(sref1,sref3));
		System.out.println("hashCode()");
		System.out.println(sref1.hashCode());
		System.out.println(sref2.hashCode());
		System.out.println(sref3.hashCode());
		System.out.println(a1i.hashCode());
		System.out.println(a2i.hashCode());
		System.out.println("--equals()--");
		System.out.println(sref1.equals(sref2));
		System.out.println(sref1.equals(sref3));
	}

}
