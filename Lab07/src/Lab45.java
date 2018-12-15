
class Table{  
	  
	void printTable(int n){//method not synchronized  
	   for(int i=1;i<=5;i++){  
	     System.out.println(n*i);  
	     try{  
	      Thread.sleep(400);  
	     }catch(Exception e){System.out.println(e);}  
	   }  
	  
	 }  
	}  
	  
	class MyThread13 extends Thread{  
	Table t;  
	MyThread13(Table t){  
	this.t=t;  
	}  
	public void run(){  
	t.printTable(5);  
	}  
	  
	}  
	class MyThread14 extends Thread{  
	Table t;  
	MyThread14(Table t){  
	this.t=t;  
	}  
	public void run(){  
	t.printTable(100);  
	}  
	}  
	  
	class Lab45{  
	public static void main(String args[]){  
	Table obj = new Table();//only one object  
	MyThread13 t1=new MyThread13(obj);  
	MyThread14 t2=new MyThread14(obj);  
	t1.start();  
	t2.start();  
	}  
	}  
