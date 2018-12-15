
public class Lab11 {
	public static void main(String[] args) {
		Stud st=new Stud("sri");
		Emp em=new Emp("sri");
		System.out.println(st.snm==em.enm);
		st.show(em);
	}

}
class Stud{
	String snm;
	Stud(String snm){
		this.snm=snm;
		
	}
	void show(Emp em){
		String msg="sri";
		System.out.println(em.enm==msg);
		System.out.println(em.enm==snm);
		
	}
}
class Emp{
	String enm;
	Emp(String enm){
		this.enm=enm;
	}
	void display(Stud st){
		String var="sri";
		System.out.println(st.snm==var);
		System.out.println(st.snm==enm);
	}
}
