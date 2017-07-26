package com.chen;

public class TestConvertoString {
	public static void main(String[] args) {
		Integer i = 0;
		 int longtime = 500000;
		long starttime = System.currentTimeMillis();
		for (int j = 0;j<longtime;j++){
			String str = String.valueOf(i);
			
		}
		System.out.println("String value of: "+(System.currentTimeMillis()-starttime));
		
		 starttime = System.currentTimeMillis();
		for (int j = 0;j<longtime;j++){
			String str = i+"";
			
		}
		System.out.println("+ : "+(System.currentTimeMillis()-starttime));
		
		
		 starttime = System.currentTimeMillis();
		for (int j = 0;j<longtime;j++){
			String str =i.toString();
			
		}
		System.out.println("toString "+(System.currentTimeMillis()-starttime));
		
		long l = 12345678901234L;
		//long是八个字节，int 四个字节，所以从低到高取出32位
		
		//0000 0000 0000 0000 0000 1011 0011 1010 0111 0011 1100 1110 0010 1111 1111 0010
		
		//0111 0011 1100 1110 0010 1111 1111 0010

		int m = (int)l;

//		System.out.println(m);
		
		//http://localhost:8080/ynbfamp/sysmanage/portal!announcements.action
	}
}
