
import java.io.*;  
class Lab01{  
  public static void main(String args[]){ 
	  System.out.println("Enter data");
	  try{
		  BufferedInputStream bis=new BufferedInputStream(System.in);
			  while(true){
				  int asc=bis.read();
				  if(asc==13)break;
				  char ch=(char)asc;
				  System.out.println(ch);
			  }
		  
	  }catch(Exception e){
		  e.printStackTrace();
	  }
  }
}