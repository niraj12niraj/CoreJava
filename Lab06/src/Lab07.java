
public class Lab07 {
	public static void main(String[] args) {
		Student7 st=new Student7(22);
		//new Student(10);
		st.finalize();
		//System.runFinalizersOnExit(true);
		System.out.println("Sid :"+st.sid);
	}

}
class Student7{
	int sid;
	Student7(int sid){
		this.sid=sid;
	}
	public void finalize(){
		System.out.println("Finalize :"+sid);
	}
	
}
