package com.main.utilities;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import com.main.model.Account;
import com.main.model.DataClass;

public class TransactionUtilitiesTest {
	
	public static List<Account> accountList = new ArrayList<>();
	public static Account account1 = new Account();
	public static Account account2 = new Account();

	@BeforeClass
	public static void setUp() {

	}
	
	@AfterClass
	public static void tearDown() {
		
		account1 = new Account();
		account2 = new Account();
	}
	
	@Test
	public void testTransferMoney() {
		
		DataClass.initAccountList();		
		accountList = DataClass.accountList;
		
		// We are gonna assume Account 1 as Origin Account
		account1 = accountList.get(0);
		// We are gonna assume Account 2 as Target Account
		account2 = accountList.get(1);
		float originAccountBalance = account1.getBalance();
		float targetAccountBalance = account2.getBalance();
		
		TransactionUtilities.MakeTransaction(account1.getId(), 200, account2.getId());
		
		accountList = DataClass.accountList;
		
		if (originAccountBalance-200 == accountList.get(0).getBalance() &&
				targetAccountBalance+200 == accountList.get(1).getBalance()) {
			assertTrue(true);
		} else {
			fail("Transaction has made incorrectly");
		}
		
		
		
	}

}
