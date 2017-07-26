package com.chen.designmode.single;

public class Singleton {
	private static Singleton single;
	private Singleton(){};
	
	public  static Singleton getInstance(){
		//˫�ؼ���
		if(null==single){
			synchronized(Singleton.class){
			 if(null==single){
			  single= new Singleton();
			 }
			}
		}
		return single;
	}
}
