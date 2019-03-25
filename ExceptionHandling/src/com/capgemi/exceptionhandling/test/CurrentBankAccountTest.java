package com.capgemi.exceptionhandling.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;

import com.capgemi.exceptionhandling.main.CurrentBankAccount;
import com.capgemi.exceptionhandling.name.LowBalanceException;

public class CurrentBankAccountTest {

	CurrentBankAccount currentAccount;

	@Before
	public void setUp() {
		currentAccount = new CurrentBankAccount(101, "Lahari", 24000, 20000);
	}

	@Test
	public void tesBankAccountIsCreatedWithDefaultConstructor() {
		CurrentBankAccount currentAccount = new CurrentBankAccount();
		assertNotNull(currentAccount);
	}

	@Test
	public void tesBankAccountIsCreatedWithParametrizedConstructor() {
		assertEquals(101, currentAccount.getAccountid());
		assertEquals("Lahari", currentAccount.getAccountHoldername());
		assertEquals(24000.0, currentAccount.getAccountBalance(), 0.01);
		assertEquals(20000, currentAccount.getDebitLimit(), 0.01);

	}
	@Test
	public void testWithdrawAmountWithCurrentBalance() throws LowBalanceException {
		currentAccount.withdraw(24000);
		assertEquals(0, currentAccount.getAccountBalance(),0.01);
	}
	@Test
	public void testWithdrawAmountWithoutExtendingDebitLimt() throws LowBalanceException {
		currentAccount.withdraw(34000);
		assertEquals(0, currentAccount.getAccountBalance(),0.01);
	}
	
	@Test(expected = LowBalanceException.class)
	public void testWithdrawAmountWithExtendingDebitLimt() throws LowBalanceException {
		currentAccount.withdraw(55000);
		
	}
	@Test
	public void testDepositAmountWithBorrowedAmountGreaterThanZero() throws LowBalanceException {
		currentAccount.withdraw(20000);
		currentAccount.deposit(25000);
		assertEquals(29000, currentAccount.getAccountBalance(),0.01);
	}
	
	@Test
	public void testDepositAmountWithBorrowedAmountEqualToZero() throws LowBalanceException {
		currentAccount.withdraw(24000);
		currentAccount.deposit(25000);
		assertEquals(25000, currentAccount.getAccountBalance(),0.01);
	}
	@Test
	public void testDepositAmountWithBorrowedAmountLessThanZero() throws LowBalanceException {
		currentAccount.withdraw(34000);
		currentAccount.deposit(25000);
		assertEquals(15000, currentAccount.getAccountBalance(),0.01);
	}
}
