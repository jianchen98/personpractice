package com.chen.designmode.single;

public class Single {
	private static Single s = new Single();//ȱ�㣺ֻҪ����������̬�򣬾ͻ���г�ʼ�����˷��ڴ�
	private Single(){};
	public static Single getInstance(){
		return s;
	}
}
