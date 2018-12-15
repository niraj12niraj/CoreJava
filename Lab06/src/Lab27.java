
class Hello2{
	void m1()throws ArithmeticException,ArrayIndexOutOfBoundsException{
		try{
			m2();
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("m1-ok :"+e);
			if(1==2){
				throw new ArithmeticException("Don't do this");
			}		}}
	void m2()throws ArrayIndexOutOfBoundsException{
		m3();
	}
	void m3()throws ArrayIndexOutOfBoundsException{
		try{
			m4();
		}catch(ArithmeticException e){
			System.out.println("m3()-ok :"+e);
			throw new ArrayIndexOutOfBoundsException();
			
		}
	}
	void m4()throws ArithmeticException{
		m5();
	}
	void m5()throws ArithmeticException{
		int x=10/0;
	}
}
public class Lab27 {
	public static void main(String[] args) {
		try{
			Hello2 h=new Hello2();
			h.m1();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
