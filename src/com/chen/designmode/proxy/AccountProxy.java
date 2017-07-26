package com.chen.designmode.proxy;

public class AccountProxy  implements Account{
	private Account account;
	//代理对象 持有实际对象的引用
	public AccountProxy(Account account) {
		super();
		this.account = account;
	}

	@Override
	public void queryAcctount() {
		System.out.println("代理前查询");
		// TODO Auto-generated method stub
		account.queryAcctount();
		System.out.println("代理后查询");
	}

	@Override
	public void updateAcctount() {
		System.out.println("代理前修改");
		// TODO Auto-generated method stub
		
		account.updateAcctount();
		System.out.println("代理后修改");
		
	}

	
}
