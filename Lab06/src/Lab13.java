
public class Lab13 {
	public static void main(String[] args) {
		Stud1 st=new Stud1("sri");
		Emp1 em=new Emp1("sri");
		System.out.println("main");
		System.out.println("main :"+(st.snm==em.enm));
		st.show(em);
	}

}
class Stud1{
	String snm;
	Stud1(String snm){
		this.snm=snm;
	}
	void show(Emp1 em){
		String msg="sri";
		System.out.println("Stud1.show() :"+(em.enm==msg));
		System.out.println("Stud1.show() :"+(em.enm==snm));
		em.display(this);
	}
}
class Emp1{
	String enm;
	Emp1(String enm){
		this.enm=enm;
	}
	void display(Stud1 st){
		String var="sri";
		System.out.println("Emp1.dispaly()");
		System.out.println("Emp1.dis :"+(st.snm==var));
		System.out.println("Emp1.dis :"+(st.snm==enm));
	}
}