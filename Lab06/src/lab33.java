import java.util.*;
public class lab33 {
	public static void main(String[] args) {
		Map map=new LinkedHashMap();
		map.put("eid", new Integer(99));
		map.put("name", "Srinivas");
		map.put("phone", new Long(412313563L));
		map.put("vaild", new Boolean(true));
		/*System.out.println(map);
		System.out.println("remove(eid)"+map.remove("eid"));
		System.out.println(map);
		System.out.println("put-phone "+map.put("phone",new Long(4534544546L)));
		System.out.println(map);
		System.out.println("get()");
		System.out.println(map.get("name"));
		System.out.println(map.get("email"));*/
		
		/*System.out.println("\n***Keys");
		Set keys=map.keySet();
		Iterator it=keys.iterator();
		while(it.hasNext()){
			Object key=it.next();
			System.out.println(key);
		}
		System.out.println("\n***Values");
		Collection col=map.values();
		Iterator it1=col.iterator();
		while(it1.hasNext()){
			Object val=it1.next();
			System.out.println(val);*/
		
		System.out.println("\n**Keys and Values");
		Set data=map.entrySet();
		Iterator it=data.iterator();
		while(it.hasNext()){
			Object obj=it.next();
			Map.Entry entry=(Map.Entry)obj;
			Object key=entry.getKey();
			Object val=entry.getValue();
			System.out.println(key+"\t\t" +val);
		}
		
	}

}
