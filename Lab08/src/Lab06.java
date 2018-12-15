import java.lang.reflect.*;
class Lab06{
	public static void main(String[] args) {
		try{
			Class cls=Class.forName("JlcStudent");
			System.out.println("Public :"+Modifier.PUBLIC);
			System.out.println("Priv :"+Modifier.PRIVATE);
			System.out.println("Prot :"+Modifier.PROTECTED);
			System.out.println("Fina :"+Modifier.FINAL);
			System.out.println("Stat :"+Modifier.STATIC);
			System.out.println("Nati :"+Modifier.NATIVE);
			System.out.println("Abst :"+Modifier.ABSTRACT);
			System.out.println("Synch :"+Modifier.SYNCHRONIZED);
			Method ms[]=cls.getDeclaredMethods();
			for(int i=0;i<ms.length;i++){
				Method m=ms[i];
				System.out.println("\n******"+m);
				int mod=m.getModifiers();
			System.out.println("Modifier :"+mod);
			System.out.println("PUBLIC :"+Modifier.isPublic(mod));
			System.out.println("PRIVATE :"+Modifier.isPrivate(mod));
			System.out.println("PROTECTED :"+Modifier.isProtected(mod));
			System.out.println("FINAL :"+Modifier.isFinal(mod));
			System.out.println("STATIC :"+Modifier.isStatic(mod));
			System.out.println("NATIVE :"+Modifier.isNative(mod));
			System.out.println("ABSTRACT :"+Modifier.isAbstract(mod));
			System.out.println("SYNCHRONIZED :"+Modifier.isSynchronized(mod));
			}
			
		}catch(Exception e){
			System.out.println("JLC Student class Not Found");
			e.printStackTrace();
		}
	}
}
abstract class JlcStudent{
	public void m1(){}
	native final void m2();
	public synchronized void m3(){}
	protected abstract void m4();
	private static final void m5(){}
	void m6(){}
	
	
}