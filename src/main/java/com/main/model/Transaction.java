package com.main.model;

import java.util.Date;

public class Transaction {
	
	public int id = 0;
	public int accountOrigin = 0;
	public int accoundTarget = 0;
	public String concept;
	public float amount = 0;
	public Date transactionDate;
	
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
	 * @return the accountOrigin
	 */
	public int getAccountOrigin() {
		return accountOrigin;
	}
	/**
	 * @param accountOrigin the accountOrigin to set
	 */
	public void setAccountOrigin(int accountOrigin) {
		this.accountOrigin = accountOrigin;
	}
	/**
	 * @return the accoundTarget
	 */
	public int getAccoundTarget() {
		return accoundTarget;
	}
	/**
	 * @param accoundTarget the accoundTarget to set
	 */
	public void setAccoundTarget(int accoundTarget) {
		this.accoundTarget = accoundTarget;
	}
	/**
	 * @return the concept
	 */
	public String getConcept() {
		return concept;
	}
	/**
	 * @param concept the concept to set
	 */
	public void setConcept(String concept) {
		this.concept = concept;
	}
	/**
	 * @return the amount
	 */
	public float getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(float amount) {
		this.amount = amount;
	}
	/**
	 * @return the transactionDate
	 */
	public Date getTransactionDate() {
		return transactionDate;
	}
	/**
	 * @param transactionDate the transactionDate to set
	 */
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	
	
	
	

}
