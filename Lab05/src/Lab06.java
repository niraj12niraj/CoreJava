interface Inter3{
	class Aa implements Inter3{}
	class Bb extends Aa{}
	class Cc extends Bb{}
}
public class Lab06 {
	public static void main(String[] args) {
		/*Inter3 arr[]=new Bb[3];
		arr[0]=new Bb();
		arr[1]=new Bb();
		arr[2]=new Cc();*/
		int arr[]=new int[7];
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

}
