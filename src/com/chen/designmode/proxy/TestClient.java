package com.chen.designmode.proxy;

public class TestClient {
	public static void main(String[] args) {
		Account acctount = new AccountImp();//��������
		AccountProxy proxy = new AccountProxy(acctount);//���Լ��������ɸ�����ȥ����
		
	//	System.out.println(Thread.currentThread().getName());
		proxy.queryAcctount();
		proxy.updateAcctount();
		
		
	}
}
