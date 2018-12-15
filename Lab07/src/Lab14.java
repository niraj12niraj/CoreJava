import java.io.*;


public class Lab14 {
	public static void main(String[] args)throws Exception {
		try{
			FileOutputStream fos=new FileOutputStream("G:\\Info.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fos);{
				Address ad=new Address("33/1","Mathikere");
				Student st=new Student(99,"Sri",541312534,ad);
				Student.count=9;
				System.out.println(st);
				oos.writeObject(st);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
class Address{
	String sid;
	String street;
	Address(String sid,String street){
		this.sid=sid;
		this.street=street;
	}
}
class Student implements Serializable{
	int sid;
	transient String name="XXXX";
	long phone=11213513;
	static int count=3;
	Address add;
	Student(int sid,String name,long phone,Address add){
		this.sid=sid;
		this.name=name;
		this.phone=phone;
		this.add=add;
	}
	public String toString(){
		return sid+"\t"+name+"\t"+phone+"\t"+add;
	}
}
