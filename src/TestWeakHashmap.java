import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;


public class TestWeakHashmap {
	public static void main(String[] args) {
		String a = new 	String("a");
		String b = new String("b");
		Map map =new HashMap();
		WeakHashMap wemap = new WeakHashMap();
		map.put(a, "aaa");
		map.put(b, "bbbb");
		
		wemap.put(a, "aaa");
		wemap.put(b, "bbbb");
		
		map.remove(a);
		a=null;
		b=null;
		
		System.gc();
		
	  Set<Map.Entry<String, String>>  entry=	(Set<Entry<String, String>>) map.entrySet();
	   Iterator<Entry<String, String>> set = entry.iterator();
	   while(set.hasNext()){
		   Map.Entry<String, String> it = set.next();
		   System.out.println("key :"+it.getKey()+"value:"+it.getValue());
	   }
	   
	   
	   
//	   Set<Map.Entry<String, String>> weken = wemap.entrySet();
//	   Iterator<Entry<String, String>>  itwe =  weken.iterator();
//	   while(itwe.hasNext())
//		  
//		   Map.Entry<String, String> itwe =  itwe.next();
//	       System.out.println("key :"+it.getKey()+"value:"+it.getValue());
//		   
//	   }
	
	 Iterator j = wemap.entrySet().iterator(); 
	 while (j.hasNext()) { 
	 Map.Entry en = (Map.Entry)j.next(); 
	 System.out.println("weakmap:"+en.getKey()+":"+en.getValue()); 
	 } 
			   
		
		
	}
}
