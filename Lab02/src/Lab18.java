

public class Lab18 {
public static void main(String[] args) {
	Radha r1=new Radha();
	r1.show();
	r1.rid=87;
	Customer c1=new Customer();
	c1.Syso();
	c1.cid=23;;
	


	
}
}
	class Radha{
		int rid;
		String add;
		void show(){
			System.out.println(rid);
			System.out.println(add);
		}
	}
	
	class Customer extends Radha{
		int cid;
		String name="Raju";
		String add1="Bal";
		 void Syso() {
			System.out.println(name);
			System.out.println(add1);
	
		}}

	
