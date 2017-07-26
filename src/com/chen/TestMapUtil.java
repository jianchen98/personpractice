package com.chen;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;


import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.collections.MapUtils;

public class TestMapUtil {

	public static void main(String[] args) {
		/*String[] arr = {"123","456","789","123"}; 
		List<String> list = Arrays.asList(arr); 
		//数组转换为map,一维数组时，奇数为key,偶数为value,奇数个元素，最后一个舍掉 
		//.二维数组当做两个一维数组 
		
		Map map = MapUtils.putAll(new HashMap(), arr); 
		
		System.out.println(MapUtils.getString(map, "123"));
		Iterator  it = map.keySet().iterator();
		while(it.hasNext()){
			Object key = it.next();
			System.out.println(key+":"+map.get(key));
			System.out.println(MapUtils.getString(map, "123"));
		}
		
		//map效率 最高的遍历方式
		
		Set<Map.Entry<String,String>> set = map.entrySet();
		Iterator<Map.Entry<String,String>> it = set.iterator();
		while(it.hasNext()){
			Map.Entry<String,String> entry =  it.next();
			System.out.println(entry.getKey()+" :"+entry.getValue());
		}
		
		String ipaddr="192.168.1.1";
		String a[] = ipaddr.split("\\.");
		System.out.println(a[0]);*/
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try
		 
		{
		 
		  Date d1 = df.parse("2004-03-26 13:31:40");
		 
		  Date d2 = df.parse("2004-03-26 11:30:24");
		  long diff = d1.getTime() - d2.getTime();//这样得到的差值是微秒级别
		  long days = diff / (1000 * 60 * 60 * 24);
		 
		  long hours = (diff-days*(1000 * 60 * 60 * 24))/(1000* 60 * 60);
		  long minutes = (diff-days*(1000 * 60 * 60 * 24)-hours*(1000* 60 * 60))/(1000* 60);
		  long seconde = (diff-days*(1000 * 60 * 60 * 24)-hours*(1000* 60 * 60)-minutes*(1000* 60))/(1000);
		  String minYMDHMS = ""+days+"天"+hours+"小时"+minutes+"分"+seconde+"秒";
		  System.out.println(""+days+"天"+hours+"小时"+minutes+"分"+seconde+"秒");
		 
		}
		catch (Exception e)
		{
		}
	        
	      
	
	}
		  
	
	
}


