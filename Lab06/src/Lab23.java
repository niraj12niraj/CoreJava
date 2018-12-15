
public class Lab23 {
	public static void main(String[] args) {
		Runtime rt=null;
		//rt=new Runtime();
		System.out.println(Runtime.getRuntime());
		System.out.println(Runtime.getRuntime());
		rt=Runtime.getRuntime();
		System.out.println("AP :"+rt.availableProcessors());
		System.out.println("MM :"+rt.maxMemory());
		System.out.println("TM :"+rt.totalMemory());
		System.out.println("FM :"+rt.freeMemory());
	}

}
