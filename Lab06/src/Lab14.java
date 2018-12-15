
public class Lab14 {
	public static void main(String[] args) {
		String str="jlc,java learning center." +
				"No 1 java training and placement." +
				"java is papular langauge.";
		String res[]=str.split("java",1);
		System.out.println("Length :"+res.length);
		for(int i=0;i<res.length;i++){
			String st=res[i];
			System.out.println(i+"\t"+st);
		}
		System.out.println("******************************");
		String res1[]=str.split("java",2);
		System.out.println("Length :"+res1.length);
		for(int i=0;i<res1.length;i++){
			String st=res1[i];
			System.out.println(i+"\t"+st);
		}
		System.out.println("******************************");
		String res2[]=str.split("java",3);
		System.out.println("Length :"+res2.length);
		for(int i=0;i<res2.length;i++){
			String st=res2[i];
			System.out.println(i+"\t"+st);
	}
		System.out.println("******************************");
		String res3[]=str.split("java",4);
		System.out.println("Length :"+res3.length);
		for(int i=0;i<res3.length;i++){
			String st=res3[i];
			System.out.println(i+"\t"+st);
	}
		System.out.println("******************************");
		String res4[]=str.split("java",5);
		System.out.println("Length :"+res4.length);
		for(int i=0;i<res4.length;i++){
			String st=res4[i];
			System.out.println(i+"\t"+st);
	}

}
}