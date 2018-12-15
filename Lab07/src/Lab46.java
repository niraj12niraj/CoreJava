

class Table1{  
	 synchronized void printTable(int n){//synchronized method  
	   for(int i=1;i<=5;i++){  
	     System.out.println(n*i);  
	     try{  
	      Thread.sleep(400);  
	     }catch(Exception e){System.out.println(e);}  
	   }  
	  
	 }  
	}  
	  
	class MyThread15 extends Thread{  
	Table t;  
	MyThread15(Table t){  
	this.t=t;  
	}  
	public void run(){  
	t.printTable(5);  
	}  
	  
	}  
	class MyThread16 extends Thread{  
	Table t;  
	MyThread16(Table t){  
	this.t=t;  
	}  
	public void run(){  
	t.printTable(100);  
	}  
	}  
	  
	public class Lab46{  
	public static void main(String args[]){  
	Table obj = new Table();//only one object  
	MyThread15 t1=new MyThread15(obj);  
	MyThread16 t2=new MyThread16(obj);  
	t1.start();  
	t2.start();  
	}  
	}  