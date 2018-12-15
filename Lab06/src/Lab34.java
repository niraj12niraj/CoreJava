import java.util.*;
public class Lab34 {
	public static void main(String[] args) {
		Date dt=new Date();
		System.out.println(dt);
		System.out.println("Date\t :"+dt.getDate());
		System.out.println("Mon\t :"+dt.getMonth());
		System.out.println("Mon+1\t :"+(dt.getMonth()+1));
		System.out.println("Year\t :"+dt.getYear());
		System.out.println("Year+1900\t :"+(dt.getYear()+1900));
		System.out.println("Hours\t :"+dt.getHours());
		System.out.println("Minute\t :"+dt.getMinutes());
		System.out.println("Sec\t :"+dt.getSeconds());
		System.out.println("\nStoring date");
		dt.setDate(3);
		dt.setMonth(1);
		dt.setYear(105);
		System.out.println(dt);
		Date dt1=new Date(112,12,25);
		Date dt2=new Date(112,6,25);
		System.out.println("\ndt1 :"+dt1);
		System.out.println("\ndt2 :"+dt2);
		System.out.println("\ndt1.compareTo(dt2) :"+dt1.compareTo(dt2));
		System.out.println("\ndt2.compareTo(dt1) :"+dt2.compareTo(dt1));
		System.out.println("\ndt1.after(dt2) :"+dt1.after(dt2));
		System.out.println("\ndt1.before(dt2) :"+dt1.before(dt2));
	}

}
