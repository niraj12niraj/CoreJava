
public class Lab03 {
public static void main(String[] args) {
	Employee emps[]=new Employee[500];
	for(int i=0;i<emps.length;i++){
		//new Employee("jlc-"+(i+1));
		emps[i]=new Employee("jlc-"+(i+1));
	}
}
}
class Employee{
	String eid;
	double add[]=new double[123456];
	Employee(String eid){
		this.eid=eid;
		System.out.println("\nObject Created with id :"+eid);
	}
	protected void finalize(){
		System.out.println("Finalize :"+eid);
	}
}
