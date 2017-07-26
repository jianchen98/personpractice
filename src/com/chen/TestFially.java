	package com.chen;

public class TestFially {
	public static void main(String[] args) {
		add();
	}
 public static int add(){
	int i = 1; 
	
 
 try { 
	 System.out.println("try block"); 
	 System.exit(0); 
	 return i; 
	 }finally { 
	 System.out.println("finally block"); 
			 } 
		 } 
}
