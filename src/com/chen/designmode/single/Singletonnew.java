package com.chen.designmode.single;

public class Singletonnew {
	private Singletonnew(){};
	//��̬�ڲ��� �汾
	public static Singletonnew   getinstance(){
		
		return Singletoninstance.s;
	} 
	
	private static class Singletoninstance{
		 static Singletonnew s = new Singletonnew();
	}
}
