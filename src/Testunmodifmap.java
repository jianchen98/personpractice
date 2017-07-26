import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.collections.iterators.EntrySetMapIterator;


public class Testunmodifmap {

	
		   public static void main(String[] s) {
		      //object hash table 
		      Hashtable<String,String> table = new Hashtable<String,String>();
		      
		      // populate the table
		      table.put("key1", "value1");
		      table.put("key2", "value2");
		      table.put("key3", "value3");
		      
		      System.out.println("Initial collection: "+table);
		      
		      // create unmodifiable map
		      Map m = Collections.unmodifiableMap(table);

		      // try to modify the collection
//		      m.put("key3", "value3");
		      //1  fro each
		     /* for(Map.Entry<String, String> entry:table.entrySet()){
		    	  System.out.println("key:="+entry.getKey()+"value="+entry.getValue());
		      }*/
		     Iterator it = m.entrySet().iterator();
		     while(it.hasNext()){
		    	 Map.Entry<String, String> entry = (Entry<String, String>) it.next();
		    	 System.out.println(entry.getKey()+"***"+entry.getValue());
		     }
		      
		      
		   }
}
