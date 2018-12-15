

class Simple1{}  

class Lab02{  
  void printName(Object obj){  
  Class c=obj.getClass();    
  System.out.println(c.getName());  
  }  
  public static void main(String args[]){  
   Simple1 s=new Simple1();  
   
   Lab02 t=new Lab02();  
   t.printName(s);  
 }  
}  