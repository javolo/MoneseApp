package com.main.utilities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.main.model.Account;
import com.main.model.DataClass;
import com.main.model.JTableResult;
import com.main.model.Transaction;

public class TransactionUtilities {
	
	public TransactionUtilities() {
		super();
	}

	public static synchronized List<Account> getAccountByName(final String accountHolder){

		List<Account> result = new ArrayList<>();

		for (Account acc : DataClass.accountList) {
			if (acc.accountHolder.equals(accountHolder)) {
				result.add(acc);
			}
		}

		return result;	
	}

	public static synchronized List<Account> getAccountByNameAndOrigin(final String accountHolder, final int accountOriginID){

		List<Account> result = new ArrayList<>();

		for (Account acc : DataClass.accountList) {
			if (acc.accountHolder.equals(accountHolder) && acc.id != accountOriginID) {
				result.add(acc);
			}
		}

		return result;	
	}

	public static synchronized Account GetAccountInformation(final int accountOriginID){

		Account result = new Account();

		for (Account acc : DataClass.accountList) {
			if (acc.id == accountOriginID) {
				return acc;
			}
		}

		return result;	
	}

	public static synchronized void MakeTransaction(final int accountOriginID, final float amountTransfer, final int targetAccountID){

		for (Account acc : DataClass.accountList) {
			if (acc.id == accountOriginID) {
				acc.setBalance(acc.getBalance()-amountTransfer);
			}
			if (acc.id == targetAccountID) {
				acc.setBalance(acc.getBalance()+amountTransfer);
			}
		}


		// Once transfer the money we include the info in the transaction list
		Transaction transaction = new Transaction();
		transaction.setAccountOrigin(accountOriginID);
		transaction.setAccoundTarget(targetAccountID);
		transaction.setAmount(amountTransfer);
		transaction.setConcept("Flat");
		transaction.setTransactionDate(new Date());
		DataClass.transactionList.add(transaction);
	}

	public static synchronized JTableResult GetAccountTransactionList(int accountID) {
		// We look in the transaction list and get a list with transaction (either money in or money out)
		List<Transaction> accountTransactionList = new ArrayList<>();

		for (Transaction tr : DataClass.transactionList) {
			if (tr.accountOrigin == accountID || tr.accoundTarget == accountID) {
				accountTransactionList.add(tr);
			}
		}
		
		JTableResult result = new JTableResult();
		result.setResult(JTableResult.OK);
		result.setRecords(accountTransactionList);
		result.setTotalRecordCount(String.valueOf(accountTransactionList.size()));

		return result;
	}

}
