import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;


public class TestMap {
	public static void main(String[] args) {
		
     //1、第一种方式 
	/*	Map<Integer,String> map  = new TreeMap<Integer,String>();
		map.put(1, "a");
		map.put(2, "b");
		for(Map.Entry<Integer, String> entry:map.entrySet()){
			System.out.println(entry.getKey()+":  "+entry.getValue());
			
		}*/
		
		  //2、第二种方式 
		/*	Map  map  = new HashMap ();
			map.put(1, "a");
			map.put(2, "b");
		   
			Iterator it = map.entrySet().iterator();
			
			while(it.hasNext()){
				Map.Entry  entry =     (Entry) it.next();
				Integer key = (Integer) entry.getKey();
				String value = (String) entry.getValue();
				System.out.println(key+" "+value);
			}*/
		
		
		List list = new ArrayList();
		list.add("aa");
		list.add(0, "bbb");
		
		for(Object s:list){
			System.out.println(s);
		}
			
		
	}
}
