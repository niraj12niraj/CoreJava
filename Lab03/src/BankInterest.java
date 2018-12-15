
public class BankInterest {
public static void main(String[] args) {
	//Bank b=new Bank();
	SBI s=new SBI();
	ICICI i=new ICICI();
	AXIS a=new AXIS();
	//System.out.println("Bank rate of interest:"+b.RateOfInterest());
	System.out.println("SBI rate of interest:"+s.RateOFInterest());
	System.out.println("ICIC rate of interest:"+i.RateOfInterest());
	System.out.println("Axis rate of interest:"+a.RateOfInterest());
	
	
}
}
class Bank{
	int RateOfInterest(){
		return 0;
	}
}
class SBI extends Bank{
	int RateOFInterest(){
		return 8;
	}
}
class ICICI extends Bank{
	int RateOfInterest(){
		return 7;
	}
}
class AXIS extends Bank{
	int RateOfInterest(){
		return 9;
	}
}
