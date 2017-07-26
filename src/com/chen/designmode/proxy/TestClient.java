package com.chen.designmode.proxy;

public class TestClient {
	public static void main(String[] args) {
		Account acctount = new AccountImp();//创建本身
		AccountProxy proxy = new AccountProxy(acctount);//把自己的章子派给代理去办事
		
	//	System.out.println(Thread.currentThread().getName());
		proxy.queryAcctount();
		proxy.updateAcctount();
		
		
	}
}
