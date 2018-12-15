import java.util.*;
public class Lab20 {
	public static void main(String[] args) {
		long time=System.currentTimeMillis();
		Date dt=new Date(time);
		System.out.println(dt);
		String pnm=System.getProperty("os.name");
		System.out.println("OS.name :"+pnm);
		System.setProperty("os.name","UNIX");
		String pnm1=System.getProperty("os.name");
		System.out.println("OS.Name :"+pnm1);
		System.setProperty("JLC.Website","www.ljcindia.com");
		System.out.println(System.getProperty("JLC.Website"));
	}

}
