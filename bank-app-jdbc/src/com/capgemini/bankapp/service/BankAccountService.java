package com.capgemini.bankapp.service;

import com.capgemini.bankapp.exception.LowBalanceException;

public interface BankAccountService {
	public double checkBalanace(long accountId);
	public double withdraw(long accountId, double amount) throws LowBalanceException;
	public double deposit(long accountId, double amount );
	public boolean deleteBankAccount(long accountId);
	

}
