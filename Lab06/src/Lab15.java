
public class Lab15 {
	public static void main(String[] args) {
		String str="Hello world I am Niraj";
		System.out.println(str);
		String dir="G:\\set.txt";
		String res[]=dir.split("\\\\");
		for(int i=0;i<res.length;i++){
			String st=res[i];
			System.out.println(i+"\t"+st);
		}
	}

}
