package com.chen.designmode.single;

public class Single {
	private static Single s = new Single();//缺点：只要访问其它静态域，就会进行初始化，浪费内存
	private Single(){};
	public static Single getInstance(){
		return s;
	}
}
