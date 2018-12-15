import java.util.*;
public class Lab21 {
	public static void main(String[] args) {
		System.out.println("\n***Accessing All Properties");
		Properties p=System.getProperties();
		Enumeration enm=p.propertyNames();
		while(enm.hasMoreElements()){
			String pName=enm.nextElement().toString();
			String val=System.getProperty(pName);
			System.out.println(pName+"\t:\t"+val);
		}
	}

}
