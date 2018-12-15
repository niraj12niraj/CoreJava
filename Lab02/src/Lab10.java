
public class Lab10 {
	public static void main(String[] args) {
		int n=5;
		char ch='A';
		for(int r=5;r>=0;r--){
		//for space
			for(int c=0;c<r;c++){
		System.out.print(" ");//one space
		}
		//for character
			for(int c=0;c<n-r;c++){
		System.out.print(ch+" ");
		}
		System.out.println();
		ch++;
		}
		System.out.println("------------------------");
		int n1=5;
		char ch1='A';
		for(int r1=5;r1>=0;r1--){
		//for space
			for(int c1=0;c1<n1-r1;c1++){
		System.out.print(ch1+" ");//one space
		}
		//for character
			for(int c1=0;c1<=r1;c1++){
		System.out.print(" ");
		}
		System.out.println();
		ch1++;
		}}	
	}