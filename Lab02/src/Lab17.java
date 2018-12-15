
public class Lab17 {
	public static void main(String[] args) {
		Customer1 c1=new Customer1();
		c1.show();
		c1.cid=998;
		c1.name="Raja";
		c1.add="asfs";
		
		
	}

} 
class Customer1{
	int cid;
	String name;
	String add;
	void show(){
		System.out.println(cid);
	System.out.println(name);
	System.out.println(add);
}}

