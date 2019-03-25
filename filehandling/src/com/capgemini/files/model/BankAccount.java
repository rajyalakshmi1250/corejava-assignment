package com.capgemini.files.model;

import java.io.Serializable;

public class BankAccount implements Serializable{
	private int accountId;
	private String accountHolderName;
	private String accountType;
	private double accountBalance;
	private DebitCard debitCard;
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankAccount(int accountId, String accountHolderName, String accountType, double accountBalance,
			DebitCard debitcard) {
		super();
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
		this.debitCard = debitCard;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
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
	public DebitCard getDebitcard() {
		return debitCard;
	}
	public void setDebitcard(DebitCard debitcard) {
		this.debitCard = debitcard;
	}
	
	

}
