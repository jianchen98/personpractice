package com.chen.designmode.proxy;

public class AccountImp implements Account {

	@Override
	public void queryAcctount() {
		// TODO Auto-generated method stub
     System.out.println("查看账户");
	}

	@Override
	public void updateAcctount() {
		// TODO Auto-generated method stub
		System.out.println("修改账户");
	}

}
