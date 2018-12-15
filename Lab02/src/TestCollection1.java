
import java.util.*;  
class TestCollection1{  
 public static void main(String args[]){  
   
 /* ArrayList<String> al=new ArrayList<String>();//creating arraylist  
  al.add("Ravi");//adding object in arraylist  
  al.add("Vijay");  
  al.add("Ravi");  
  al.add("Ajay");  
  
  Iterator itr=al.iterator();//getting Iterator from arraylist to traverse elements  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  */
	 
	 
  /*//class TestCollection2{  
	//  public static void main(String args[]){  
	   ArrayList<String> al=new ArrayList<String>();  
	   al.add("Ravi");  
	   al.add("Vijay");  
	   al.add("Ravi");  
	   al.add("Ajay");  
	   for(String obj:al)  
	     System.out.println(obj); 	  
 }  
}  
*/
	 
	 
	// import java.util.*;  
	// public class TestCollection3{  
	 // public static void main(String args[]){ 
	 
	 class Student{  
		  int rollno;  
		  String name;  
		  int age;  
		  Student(int rollno,String name,int age){  
		   this.rollno=rollno;  
		   this.name=name;  
		   this.age=age;  
		  }  
		}  
	   //Creating user-defined class objects  
	   Student s1=new Student(101,"Sonoo",23);  
	   Student s2=new Student(102,"Ravi",21);  
	   Student s3=new Student(103,"Hanumat",25);  
	       
	   ArrayList<Student> al=new ArrayList<Student>();//creating arraylist  
	   al.add(s1);//adding Student class object  
	   al.add(s2);  
	   al.add(s3);  
	     
	   Iterator itr=al.iterator();  
	   //traversing elements of ArrayList object  
	   while(itr.hasNext()){  
	     Student st=(Student)itr.next();  
	     System.out.println(st.rollno+" "+st.name+" "+st.age);  
	   }  
	  }  
	 }  