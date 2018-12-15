import java.util.*;
import java.io.*;
public class Lab22 {
public static void main(String[] args)throws Exception {
	Object ref1=new int[]{10,21,13,14,15,12};
	Object ref2=new int[]{3,12,61,41,51,21};
	int obj1[]=new int[6];
	System.arraycopy(ref1, 0, obj1, 0, 6);
	System.out.println("First Array Data");
	for(int i=0;i<obj1.length;i++){
		System.out.println(i+"\t"+obj1[i]);
		
	}
	System.out.println("Second Array Data");
	System.arraycopy(ref2, 0, obj1, 0, 6);
	for(int i=0;i<obj1.length;i++){
		System.out.println(i+"\t"+obj1[i]);
		
	}
	int arr1[]={23,12,15,14};
	String st[]=new String[5];
	System.arraycopy(arr1, 0, st, 0, 4);
}
}
