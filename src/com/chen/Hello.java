package com.chen;

class A{
	
	A(){
		System.out.println("A");
	}
}
public class Hello  extends A{
	public static void main(String[] args) {
//		System.out.println("aaaa");
		Hello h = new Hello();
	}
	Hello(){
//		/super();
		System.out.println("helllo");
	}
}
