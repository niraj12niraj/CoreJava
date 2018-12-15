import java.util.*;
public class Lab17 {
	public static void main(String[] args) {
		Collection col=new ArrayList();
		System.out.println(col);
		System.out.println("Size :"+col.size());
		System.out.println("Empty :"+col.isEmpty());
		System.out.println();
		col.add("Sri");
		col.add("Nivash");
		col.add("Dande");
		col.add("Sd");
		Object arr[]=col.toArray();
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
			arr[i]="jlc";
		}
		System.out.println("1 :"+col);
		System.out.println("2 :"+col.contains("Srinivas"));
		System.out.println("3 :"+col.contains("Sri"));
		System.out.println("4 :"+col.contains("Radha"));
		System.out.println("5 :"+col);
		System.out.println("6 :"+col.contains("Srinivas"));
		System.out.println("7 :"+col.contains("Sd"));
		System.out.println("8 :"+col);
		System.out.println("Size :"+col.size());
		System.out.println("Empty :"+col.isEmpty());
		col.clear();
		System.out.println("9 :"+col);
		System.out.println("Size :"+col.size());
	}

}
