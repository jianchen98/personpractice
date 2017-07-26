package com.chen.designmode.single;

public class Singletonnew {
	private Singletonnew(){};
	//静态内部类 版本
	public static Singletonnew   getinstance(){
		
		return Singletoninstance.s;
	} 
	
	private static class Singletoninstance{
		 static Singletonnew s = new Singletonnew();
	}
}
