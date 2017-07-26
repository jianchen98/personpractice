package com.chen;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestCountNumber {
	public static void main(String[] args) {
		String s = "123123";
		Map<Character,Integer> map = new HashMap<Character,Integer>();
	
		char []str = s.toCharArray();
		int count=0;
		for(int i = 0;i<str.length;i++){
			if(!map.containsKey(str[i])){
				map.put(str[i],1);
			}
			else{
				//mapµƒ÷µ◊‘∂Ø–ﬁ∏ƒ
				count = map.get(str[i])+1;
				map.put(str[i], count);
			}
		}
		
		Set<Map.Entry<Character,Integer>> set = map.entrySet();
        Iterator<Entry<Character, Integer>> it = set.iterator();
        while(it.hasNext()){
            Map.Entry<Character,Integer> entry =  it.next();
            System.out.println(entry.getKey()+" :"+entry.getValue());
        }
				
//        Map hmap=new HashMap();
//        hmap.put("≤‚ ‘",1);
//        hmap.put("≤‚ ‘2",2);
//        System.out.println(hmap.get("≤‚ ‘2"));
//        hmap.put("≤‚ ‘2",4);
//        System.out.println(hmap.get("≤‚ ‘2"));
	}
}
