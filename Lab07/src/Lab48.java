class Table4{  
  
 synchronized static  void printTable(int n){  
   for(int i=1;i<=10;i++){  
     System.out.println(n*i);  
     try{  
       Thread.sleep(400);  
     }catch(Exception e){}  
   }  
 }  
}  
  
public class Lab48 {  
public static void main(String[] args) {  
      
    Thread t1=new Thread(){  
        public void run(){  
            Table4.printTable(1);  
        }  
    };  
      
    Thread t2=new Thread(){  
        public void run(){  
            Table4.printTable(10);  
        }  
    };  
      
    Thread t3=new Thread(){  
        public void run(){  
            Table4.printTable(100);  
        }  
    };  
      
    Thread t4=new Thread(){  
        public void run(){  
            Table4.printTable(1000);  
        }  
    };  
    t1.start();  
    t2.start();  
    t3.start();  
    t4.start();  
      
}  
}  