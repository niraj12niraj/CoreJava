
public class Lab49 {
public static void main(String[] args) {
	Account acc=new Account();
	new AccountThread(acc);
	
}
}
class Account{
	int bal=950;
	public void withdraw(int amt){
		if(bal>=amt){
			System.out.println(Thread.currentThread().getName()+
					"is going to withdraw........:"+bal);
			try{
				
			}catch(Exception e){}
			bal-=amt;
			System.out.println(Thread.currentThread().getName()+
					"is completed withdraw.......:"+bal);
		}
		else{
			System.out.println("No Funds for :"+Thread.currentThread().getName());
		}
	}
	public int getBal(){
		return bal;
	}
}
class AccountThread implements Runnable{
	Account acc=null;
	AccountThread(Account acc){
		this.acc=acc;
		Thread t1=new Thread(this,"A ");
		Thread t2=new Thread(this,"B ");
		t1.start();
		t2.start();
	}
	public void run(){
		for(int i=0;i<1;i++){
			acc.withdraw(800);
			if(acc.getBal()<0){
				System.out.println("Account is Ocerdrawn.............");
			}
		}
	}
}