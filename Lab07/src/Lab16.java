
import java.io.*;


public class Lab16 {
	public static void main(String[] args)throws Exception {
		try{
			FileOutputStream fos=new FileOutputStream("G:\\Info.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fos);{
				Address1 ad=new Address1("33/1","Mathikere");
				Student2 st=new Student2(99,"Sri",541312534,ad);
				Student2.count=9;
				System.out.println(st);
				oos.writeObject(st);
				System.out.println("Object Serialized");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
class Address1{
	String aid;
	String street;
	Address1(String sid,String street){
		this.aid=sid;
		this.street=street;
	}
	
	public String toString(){
		return aid+"\t"+street;
	}
}
class Student2 implements Externalizable{
	int sid;
	transient String name="XXXX";
	long phone=11213513;
	static int count=3;
	Address1 add;
	public Student2(){}
	Student2(int sid,String name,long phone,Address1 add){
		this.sid=sid;
		this.name=name;
		this.phone=phone;
		this.add=add;
	}
	public String toString(){
		return sid+"\t"+name+"\t"+phone+"\t"+add;
	}
	public void writeExternal(ObjectOutput out)throws IOException{
		out.write(count);
		out.writeObject(name);
		out.writeObject(add.aid);
		out.writeObject(add.street);
	}
	public void readExternal(ObjectInput in)throws IOException,ClassNotFoundException{
		count=in.readInt();
		name=in.readObject().toString();
		//add=new Address1();
		add.aid=in.readObject().toString();
		add.street=in.readObject().toString();
	}
}
