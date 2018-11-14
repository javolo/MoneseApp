package com.main.model;

import java.util.ArrayList;
import java.util.List;
import com.main.model.Account;

public class DataClass {

	public static List<Account> accountList = new ArrayList<>();
	public static List<Transaction> transactionList = new ArrayList<>();
	public static Account account1 = new Account();
	public static Account account2 = new Account();

	public static void initAccountList() {

		// We define the bunch of Account for our problem
		account1.setId(1);
		account1.setAccountHolder("Daniel Miller");
		account1.setSortCode(202020);
		account1.setAccountNumber(86598712);
		account1.setTypeAccount("Savings");
		account1.setBalance(2578.25f);
		accountList.add(account1);

		account2 = new Account();
		account2.setId(2);
		account2.setAccountHolder("Daniel Miller");
		account2.setSortCode(202050);
		account2.setAccountNumber(25758964);
		account2.setTypeAccount("Current");
		account2.setBalance(5689.79f);
		accountList.add(account2);
	}
	
}
