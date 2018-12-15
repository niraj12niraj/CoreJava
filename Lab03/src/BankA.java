
public class BankA {
	public static void main(String[] args) {
		BankC bc=new BankC();
		BankD bd=new BankD();
		bc.Cid=01;
		bd.Cid=02;
		bc.Name="Radha";
		bd.Name="Radhika";
		bc.phone=8328382;
		bd.phone=4453424;
		bc.Add="Baloroe";
		bd.Add="Kabjsnjas";
		System.out.println(bc.Cid);
		System.out.println(bc.Name);
		System.out.println(bc.phone);
		System.out.println(bc.Add);
		System.out.println(bd.Cid);
		System.out.println(bd.Name);
		System.out.println(bd.phone);
		System.out.println(bd.Add);
		
	}

}
class BankB{
	String Name;
	int phone;
	String Add;
	int Cid;
	void RecordCustomerB(int Cid,String Name,int phone,String Add){
		
	}
}
class BankC extends BankB{
	void RecordCustomerC(int Cid,String Name,int phone,String Add){
		
	}
	
}
class BankD extends BankB{
	void RecordCustomerD(int Cid,String Name,int phone,String Add){
		
	}
}