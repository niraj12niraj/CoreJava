import java.io.*;  
class Lab13{  
public static void main(String args[])throws Exception{  
  
 InputStreamReader r=new InputStreamReader(System.in);  
 BufferedReader br=new BufferedReader(r);  
  
 //String name="";  
 String name=br.readLine();
  while(name.equals("stop")){  
   System.out.println("Enter data: ");  
  //String name=br.readLine();  
   System.out.println("data is: "+name);  
  }  
  
  br.close();  
  r.close();  
 }  
}  