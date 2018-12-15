
abstract class HigherPerson {
	public static void main(String[] args) {
		Person per=null;
		//per.sleeping();
		per=new Student();
		per.sleeping();
		per.eating();
		per=new Employee();
		per.eating();
		per.walking();
		per.sleeping();
		/*Person per=new Person();
		per.walking();*/
		
		
	}


}
abstract class Person{
    void eating(){
		 System.out.println("Person eating");
	 }
	void sleeping(){
		 System.out.println("Person Sleeping");
	 }
	 static void walking(){
		 System.out.println("Person Walking");
	 }
}
class Employee extends Person{
	void working(){
		System.out.println("Employee Working");
	}
	static void walking(){
		System.out.println("Employee Walking");
	}
	void sleeping(){
		System.out.println("Employee Sleeping");
	}
}
class Student extends Person{
	void sleeping(){
		System.out.println("Student Sleeping"); 
	}
	void reading(){
		System.out.println("Student Reading");
	}
	static void walking(){
		System.out.println("Student Walking");
	}
}
