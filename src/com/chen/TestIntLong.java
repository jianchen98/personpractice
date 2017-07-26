package com.chen;

public class TestIntLong {
	public static void main(String[] args) {
		int i = 400;
		int j = 400;
		Integer a = 400;
		Integer b = 400;
		
		System.out.println(i==j);
		System.out.println(a==b);
		
		String str1 = "abcd";
		String str2 = new String("abcd");
		String str3= "abcd";
		String str4=str1.intern();//查找常量池中是否存在一份equal相等的字符创。如果有返回引用
//		System.out.println(str1==str3);//false
		System.out.println(str1==str4);
	}
}
