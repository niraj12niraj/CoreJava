
public class Lab01 {
public static void main(String[] args) {
	Employee em=new Employee(99,"sri");
	System.out.println(em);
}
}
class Employee{
	int eid;
	String  Name;
	Employee(int eid,String Name){
		this.eid=eid;
		this.Name=Name;
	}
	@Override
	public String toString(){
		return eid+"\t"+Name;
	}
}
