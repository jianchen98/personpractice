package com.chen.designmode.proxy;

public class AccountProxy  implements Account{
	private Account account;
	//������� ����ʵ�ʶ��������
	public AccountProxy(Account account) {
		super();
		this.account = account;
	}

	@Override
	public void queryAcctount() {
		System.out.println("����ǰ��ѯ");
		// TODO Auto-generated method stub
		account.queryAcctount();
		System.out.println("������ѯ");
	}

	@Override
	public void updateAcctount() {
		System.out.println("����ǰ�޸�");
		// TODO Auto-generated method stub
		
		account.updateAcctount();
		System.out.println("������޸�");
		
	}

	
}
