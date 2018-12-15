/*interface Inter{
	int show();
}
/*interface Inter2{
	int show();
}*/
class X {
	public static void show(){
		System.out.println("show method");
		
	}
}
/*class Y extends X implements Inter1{
	public void show(){}
}*/

	/*public void show(){}
}
class Y implements Inter2{
	public int show(){
		return 0;
	}}
class Z implements Inter1,Inter2{
	public void show(){}
	public int show(){}
}*/

public class Lab03 {
public static void main(String[] args) {
	//Inter in=new X();
	X x=new X();
	x.show();
	
	
}
}
