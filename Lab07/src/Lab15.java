
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Lab15 {
	public static void main(String[] args)throws Exception {
		try{
			FileOutputStream fos=new FileOutputStream("G:\\Info.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fos);{
			
				Student1 st=new Student1(99,"Sri",541312534);
				Student1.count=9;
				System.out.println(st);
				
				oos.writeObject(st);
				System.out.println("object Serialized");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}

class Student1 implements Serializable{
	int sid;
	transient String name="XXXX";
	long phone=11213513;
	static int count=3;
	
	Student1(int sid,String name,long phone){
		this.sid=sid;
		this.name=name;
		this.phone=phone;
		
	}
	public String toString(){
		return sid+"\t"+name+"\t"+phone;
	}
}
