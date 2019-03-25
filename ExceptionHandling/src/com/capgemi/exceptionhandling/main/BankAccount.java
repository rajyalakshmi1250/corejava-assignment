package com.capgemi.exceptionhandling.main;
public class BankAccount {
	private long accountid;
	private String accountHoldername;
	private String accountType;
	private double accountBalance;

	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankAccount(long accountid, String accountHoldername, String accountType, double accountBalance) {
		super();
		this.accountid = accountid;
		this.accountHoldername = accountHoldername;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}

	public long getAccountid() {
		return accountid;
	}

	public void setAccountid(long accountid) {
		this.accountid = accountid;
	}

	public String getAccountHoldername() {
		return accountHoldername;
	}

	public void setAccountHoldername(String accountHoldername) {
		this.accountHoldername = accountHoldername;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public double withdraw(double amount) {
		if(accountBalance >= amount)
			accountBalance = accountBalance - amount;
		else
			System.out.println("you don't have sufficient balance");
		     return accountBalance;
		
		
	}
	public double deposit(double amount) {
		accountBalance = accountBalance+amount;
		return accountBalance;
		// TODO Auto-generated method stub
		
	}


	

	
	
}
