class Hello{
	boolean b1;
	byte b2;
	short s;
	int i;
	long l;
	float f;
	double d;
	String str;
	Hello h;
	void show(){
		System.out.println("boolean ="+ b1);
		System.out.println("byte ="+b2);
		System.out.println("short ="+s);
		System.out.println("int ="+i);
		System.out.println("long ="+l);
		System.out.println("float ="+f);
		System.out.println("double ="+d);
		System.out.println("String ="+str);
		System.out.println("Hello ="+h);
	}
}
public class Lab03 {
	public static void main(String[] args) {
		Hello h=new Hello();
		h.show();
	}

}
