class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E{}

public class Lab04 {
public static void main(String[] args) {
/*D dobj=new D();
A aobj=dobj;
B bobj=dobj;
//D dobj1=aobj;
B bobj1=(B)aobj;
D dobj1=(D)aobj;*/
	A aobj=new D();
	//C cobj=(C)aobj;
	/*System.out.println(aobj instanceof A);
	System.out.println(aobj instanceof B);
	System.out.println(aobj instanceof C);
	System.out.println(aobj instanceof D);
	//System.out.println(aobj instanceof E);
	*/
	D dob=new D();
	B bob=new B();
	C cob=new C();
	E eob=new E();
	
System.out.println(aobj==dob);
System.out.println(aobj==bob);
System.out.println(aobj==cob);
//System.out.println(aobj==eob);
//System.out.println(bob==cob);

}
}
