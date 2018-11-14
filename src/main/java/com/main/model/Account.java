package com.main.model;

public class Account {
	
	public int id = 0;
	public int sortCode = 0;
	public int accountNumber = 0;
	public String accountHolder = null;
	public float balance = 0;
	public String typeAccount = null;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the sortCode
	 */
	public int getSortCode() {
		return sortCode;
	}
	/**
	 * @param sortCode the sortCode to set
	 */
	public void setSortCode(int sortCode) {
		this.sortCode = sortCode;
	}
	/**
	 * @return the accountNumber
	 */
	public int getAccountNumber() {
		return accountNumber;
	}
	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	/**
	 * @return the accountHolder
	 */
	public String getAccountHolder() {
		return accountHolder;
	}
	/**
	 * @param accountHolder the accountHolder to set
	 */
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	/**
	 * @return the balance
	 */
	public float getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(float balance) {
		this.balance = balance;
	}
	/**
	 * @return the typeAccount
	 */
	public String getTypeAccount() {
		return typeAccount;
	}
	/**
	 * @param typeAccount the typeAccount to set
	 */
	public void setTypeAccount(String typeAccount) {
		this.typeAccount = typeAccount;
	}
	
	
	

}
