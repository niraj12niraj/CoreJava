class Student2{
	int sid;
	String name;
	Student2(int sid,String name){
		this.sid=sid;
		this.name=name;
	}
}
public class Lab1031 {
	public static void main(String[] args) {
		//Student2 st1=null;
		//System.out.println(st1);
		//st1=
		Student2 st1=new Student2(99,"Sri");
		System.out.println(st1);
		System.out.println("\n**Defalut implementation");
		String cname=st1.getClass().getName();
		int hc=st1.hashCode();
		System.out.println(hc);
		System.out.println("hascode :"+hc);
		System.out.println(st1.hashCode());
		String hx=Integer.toHexString(hc);
		System.out.println(/* "hexString  :"+*/hx);
		String msg=cname+"@"+hx;
		System.out.println(msg);
		/*String str=new String("Java Learning Center");
		System.out.println(str);
		Integer ref=new Integer(123);
		System.out.println(ref);*/
	}

}
