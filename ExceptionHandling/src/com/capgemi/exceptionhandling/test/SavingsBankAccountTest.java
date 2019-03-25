package com.capgemi.exceptionhandling.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;

import com.capgemi.exceptionhandling.main.BankAccount;
import com.capgemi.exceptionhandling.main.SavingsBankAccount;
import com.capgemi.exceptionhandling.name.LowBalanceException;

public class SavingsBankAccountTest extends BankAccount  {

	SavingsBankAccount savingsAccount;

	@Before
	public void setUp() {
		savingsAccount = new SavingsBankAccount(101, "Lahari" ,24000,true);
	}

	@Test
	public void tesBankAccountIsCreatedWithDefaultConstructor() {
		SavingsBankAccount savingsAccount = new SavingsBankAccount();
		assertNotNull(savingsAccount);
	}
	@Test
	public void tesBankAccountIsCreatedWithParametrizedConstructor() {
		assertEquals(101, savingsAccount.getAccountid());
		assertEquals("Lahari", savingsAccount.getAccountHoldername());
		assertEquals(24000.0, savingsAccount.getAccountBalance(), 0.01);
		assertTrue(savingsAccount.isSalaryAccount());
		
	}
	
	@Test
	public void tesBankAccountIsCreatedWithParametrizedConstructorSavedAccountFalse() {
		SavingsBankAccount savingsAccount = new SavingsBankAccount(101, "Lahari" ,24000,false);
		assertEquals(101, savingsAccount.getAccountid());
		assertEquals("Lahari", savingsAccount.getAccountHoldername());
		assertEquals(24000.0, savingsAccount.getAccountBalance(), 0.01);
		assertFalse(savingsAccount.isSalaryAccount());
		
	}
	@Test
	public void testWithdrawSalaryAccountWithSufficientFund() throws LowBalanceException {
		savingsAccount.withdraw(5000);
		assertEquals(19000, savingsAccount.getAccountBalance(),0.01);
	}
	
	@Test(expected = LowBalanceException.class)
	public void testWithdrawSalaryAccountWithInSufficientFund() throws LowBalanceException {
		savingsAccount.withdraw(25000);
		
	}
	@Test
	public void testWithdrawWithSalaryAccountWithSufficientFund() throws LowBalanceException {
		SavingsBankAccount savingsAccount = new SavingsBankAccount(101, "Lahari" ,24000,false);
		savingsAccount.withdraw(5000);
		assertEquals(19000, savingsAccount.getAccountBalance(),0.01);
	}
	
	@Test(expected = LowBalanceException.class)
	public void testWithdrawWithoutSalaryAccountWithInSufficientFund() throws LowBalanceException {
		SavingsBankAccount savingsAccount = new SavingsBankAccount(101, "Lahari" ,24000,false);
		savingsAccount.withdraw(18000);
		
	}

}
