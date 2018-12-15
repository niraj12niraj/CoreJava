import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@interface JLCcloneable{}
@JLCcloneable
class Emp{
	int eid;
	String name;
	Emp(int eid,String name){
	this.eid=eid;
	this.name=name;
	}
	@Override
	public String toString(){
		return eid+"\n"+name;
		}
	public Emp getCloneabledObject()throws CloneNotSupportedException{
		boolean b1=this.getClass().isAnnotationPresent((Class<? extends Annotation>) 
				JLCcloneable.class);
		if(b1){
			return new Emp(this.eid,this.name);
		}
		throw new CloneNotSupportedException("Emp clss not using JlcCloneable");
	}
}
public class Lab03 {
	public static void main(String[] args) throws CloneNotSupportedException{
		Emp emp=new Emp(99,"srinivas");
		System.out.println(emp);
		Emp emp1=emp.getCloneabledObject();
		System.out.println(emp1);
		System.out.println(emp!=emp1);
		
	}

}
