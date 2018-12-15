class Fello{
	char ch;
	void show(){
		System.out.println(ch==0);
		//System.out.println(ch=='');
		System.out.println(ch=='\u0000');
	}
}
public class Lab04 {
	public static void main(String[] args) {
		Fello h=new Fello();
		h.show();
	}

}
