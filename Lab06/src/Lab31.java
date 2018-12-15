
public class Lab31 {
	public static void main(String[] args) throws CloneNotSupportedException{
		Student6 st=new Student6(22);
		System.out.println(st.sid);
		Student6 st2=st.myclone();
		System.out.println(st2.sid);
		System.out.println(st==st2);
	}

}
interface JLCCloneable{}
class Student6 implements JLCCloneable{
	int sid;
	Student6(int sid){
		this.sid=sid;
	}
	public Student6 myclone()throws CloneNotSupportedException{
		if(this instanceof JLCCloneable)
			return new Student6(sid); 
		else 
			throw new CloneNotSupportedException("implement JLCCloneable");
	}
}
