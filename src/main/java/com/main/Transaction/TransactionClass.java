package com.main.Transaction;


import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.main.model.Account;
import com.main.model.DataClass;
import com.main.model.JTableResult;
import com.main.utilities.TransactionUtilities;


@Path("Transaction")
public class TransactionClass {
	
	private static TransactionUtilities transactionUtilities;
	
	public TransactionClass() {
		super();
		synchronized (this) {
			if (transactionUtilities == null) {
				transactionUtilities = new TransactionUtilities();
			}
		}
	}
	
	@GET
	@Path("GetAllMyAccounts")
	@Produces({MediaType.APPLICATION_JSON})
	public List<Account> getAllMyAccounts(){
		// In here we would retrieve for the session after the authentication the user ID.
		// In this case we would hard code this part
		// User: Daniel Miller
		if (DataClass.accountList.isEmpty()) {
			DataClass.initAccountList();
		}
		
		return TransactionUtilities.getAccountByName("Daniel Miller");
	}
	
	@GET
	@Path("GetTargetAccount")
	@Produces({MediaType.APPLICATION_JSON})
	public List<Account> GetTargetAccount(@QueryParam("origin") final int originAccountID){
		// In here we would retrieve for the session after the authentication the user ID.
		// In this case we would hard code this part
		// User: Daniel Miller
		
		return TransactionUtilities.getAccountByNameAndOrigin("Daniel Miller", originAccountID);
	}
	
	@GET
	@Path("GetAccountInformation")
	@Produces({MediaType.APPLICATION_JSON})
	public Account GetAccountInformation(@QueryParam("origin") final int originAccountID){
		// In here we would retrieve for the session after the authentication the user ID.
		// In this case we would hard code this part
		// User: Daniel Miller
		
		return TransactionUtilities.GetAccountInformation(originAccountID);
	}
	
	@POST
	@Path("MakeTransaction")
	@Produces({MediaType.APPLICATION_JSON})
	public void MakeTransaction(@FormParam("origin") final int originAccountID,
			@FormParam("amount") final int amountTransfer,
			@FormParam("target") final int targetAccountID){
		// In here we would retrieve for the session after the authentication the user ID.
		// In this case we would hard code this part
		// User: Daniel Miller
		
		TransactionUtilities.MakeTransaction(originAccountID, amountTransfer, targetAccountID);
	}
	
	@POST
	@Path("GetAccountTransactionList")
	@Produces({MediaType.APPLICATION_JSON})
	public JTableResult GetAccountTransactionList(@QueryParam("acc") final int accountID){
		// In here we would retrieve for the session after the authentication the user ID.
		// In this case we would hard code this part
		// User: Daniel Miller
		
		return TransactionUtilities.GetAccountTransactionList(accountID);
	}
	

	
}
