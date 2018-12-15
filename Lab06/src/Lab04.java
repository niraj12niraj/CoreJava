
public class Lab04 {
public static void main(String[] args) {
	Student4 st=new Student4(88);
	st.finalize();
	System.out.println("Sid :"+st.sid);
}
}
class Student4{
	int sid;
	Student4(int sid){
		this.sid=sid;
	}
	public void finalize(){
		System.out.println("Finalize :"+sid);
	}
}
