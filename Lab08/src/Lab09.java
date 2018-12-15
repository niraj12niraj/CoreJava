import java.lang.reflect.*;

public class Lab09 {
public static void main(String[] args)throws Exception {
	String str="ABC";
	System.out.println(str);
	Util.changeStringValue(str,"jlc");
	
}
}
class Util{
	static void changeStringValue(String str,String str1)throws Exception{
		Class cls=str.getClass();
		Field field=cls.getDeclaredField("value");
		//field set as Accessiable(true)
		Object obj=field.get(str);
		char ch[]=(char[])obj;
		for(int i=0;i<ch.length;i++){
			ch[i]=str1.charAt(i);
		}
		
	}
}
