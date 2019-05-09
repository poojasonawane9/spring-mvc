package com.capgemini.bankapp.dao.impl;

import java.util.List;

import com.capgemini.bankapp.dao.BankAccountDao;
import com.capgemini.bankapp.exception.BankAccountNotFoundException;
import com.capgemini.bankapp.model.BankAccount;
import org.springframework.jdbc.core.JdbcTemplate;
public class BankAccountDaoImpl implements BankAccountDao{

	private JdbcTemplate jdbcTemplate;
	
	 public BankAccountDaoImpl(JdbcTemplate jdbcTemplate) {
     	this.jdbcTemplate = jdbcTemplate;
 	}
	
	@Override
	public double getBalance(long accountId) throws BankAccountNotFoundException {
		return accountId;
		
	}

	@Override
	public void updateBalance(long accountId, double newBalance) {
		
	}

	@Override
	public boolean deleteAccount(long accountId) {
		return false;
	}

	@Override
	public boolean addNewBankAccount(BankAccount account) {
		String query = "INSERT INTO bankaccounts (customer_name,account_type,account_balance) VALUES('"+account.getAccountHolderName()+"','"+account.getAccountType()+"','"+account.getAccountBalance()+"')";
		int result = jdbcTemplate.update(query);
		if(result==1)
			return true;
		else
			return false;
	}

	@Override
	public List<BankAccount> findAllbankAccounts() {
		return null;
	}

	@Override
	public BankAccount searchCustomerRecord(long accountId) throws BankAccountNotFoundException {
		return null;
	}

	@Override
	public boolean updateBankAccountDetails(long accountId, String accountHolderName, String accountType) {
		return false;
	}

	
}
