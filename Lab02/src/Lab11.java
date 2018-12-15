
public class Lab11 {
	public static void main(String[] args) {
		int n=5,i=1;
		while(i<=10){
			System.out.println(n*i++);
		}
		System.out.println("===============================");
		int a=5;
		for(int b=1;b<=10;b++){
			System.out.println(a*b);
		}
		System.out.println("================================");
       int e=1;
		for(int c=1;c<=10;c++){
			
			
		
		System.out.println(e*c);
		
	}
		{e=2;
		for(int c=1;c<=10;c++)
		System.out.println(e*c);
		System.out.println("--------------------------");
		}
	int f=4,g=0;
	while(g++<10){
		System.out.println(f*g);
	}
	System.out.println("***************************");
	char ch='A';
	int rows=0;
	while(rows<5){
		int cols=0;
		while(cols<=rows){
			System.out.print(ch+" ");
			//System.out.println(" ");
			cols++;
			ch++;
		}
		System.out.println();
		rows++;
		//System.out.println(" ");
		ch++;
	}
	System.out.println("+++++++++++++++++++++++");
	int m=5;
	char ch1='A';
	for(int r=0;r<m;r++){
	//for space
	for(int c=0;c<m-r;c++){
	System.out.print("  ");//two space
	}
	//for character
	for(int c=0;c<=r;c++){
	System.out.print(ch1+" ");
	}
	System.out.println();
	ch1++;
	}
	System.out.println("...........................");
	for(int r=0;r<m;r++){
	//for space
	for(int c=0;c<n-r;c++){
	System.out.print(" ");//one space
	}
	//for character
	for(int c=0;c<=r;c++){
	System.out.print(ch+" ");
	}
	System.out.println();
	ch++;
	}
	System.out.println("-------------------------------");
	char ch2='A';
	for(int p=5;p>=0;p--){
	//for space
		for(int q=0;q<m-p;q++){
	System.out.print(" ");//one space
	}
	//for character
		for(int q=0;q<=p;q++){
	System.out.print(ch2+" ");
	}
	System.out.println();
	ch2++;
	}
	System.out.println("...........................");
	int m1=5;
	char ch3='A';
	for(int r1=5;r1>=1;r1--){
	//for space
		for(int c1=0;c1<m1-r1;c1++){
	System.out.print(" ");//one space
	}
	//for character
		for(int c1=0;c1<=r1;c1++){
	System.out.print(ch3+" ");
	}
	System.out.println();
	ch3++;
	}
	int m2=5;
	char ch4='A';
	for(int r2=0;r2<m2;r2++){
	//for space
	for(int c2=5;c2<1;c2--){
	System.out.print("  ");//two space
	}
	//for character
	for(int c2=0;c2<=r2;c2++){
	System.out.print(ch4+" ");
	}
	System.out.println();
	ch4++;
	}
	}
	}