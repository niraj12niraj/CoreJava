import java.util.*;
public class Lab32 {
	public static void main(String[] args) {
		Vector v=new Vector();
		List list=new ArrayList();
		list.add("Sri");
		list.add("radha");
		list.add("raju");
		v.add("rani");
		v.addElement("ra");
		v.addElement("rah");
		v.addElement("rajuni");
		Enumeration enu=v.elements();
		while(enu.hasMoreElements())
			System.out.println(enu.nextElement());
		System.out.println("**************************");
		ListIterator lit=list.listIterator();
	while(lit.hasNext()){
		Object obj=lit.next();
		System.out.println(obj);
	}
		
		
	}

}
