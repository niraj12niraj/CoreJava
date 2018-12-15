
public class Lab10 {
	public static void main(String[] args) {
		System.out.println("\n***With Student1");
		Student1 st1=new Student1(99,767578687);
		Student1 st2=new Student1(99,767578687);
		Student1 st3=new Student1(88,289299986);
		Student1 st4=st1;
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		System.out.println(st3.hashCode());
		System.out.println(st4.hashCode());
		System.out.println(st1==st2);
		System.out.println(st1==st3);
		System.out.println(st1==st4);
		System.out.println(st3==st4);
		
	}

}
class Student1{
	int sid;
	long phone;
	Student1(int sid,long phone){
		this.sid=sid;
		this.phone=phone;
	}
}
