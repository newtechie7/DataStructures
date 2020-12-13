package com.ds.account.list.data;

public class Account {

	private int accountNumber;
	private String accountName;

	public Account(int accountNumber, String accountName) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountName=" + accountName + "]";
	}

}
