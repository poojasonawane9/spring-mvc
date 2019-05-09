package com.capgemini.bankapp.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.capgemini.bankapp.model.BankAccount;

public class BankAccountRowMapper implements RowMapper<BankAccount> {

		public BankAccount mapRow(ResultSet rs,int RowNum)  throws SQLException {
			int accountId = rs.getInt(1);
			String accountHolderName = rs.getString(2);
			String accountType = rs.getString(3);
			double accountBalance = rs.getDouble(4);
			

			BankAccount bankAccount = new BankAccount(accountId,accountHolderName,accountType,accountBalance);
			return bankAccount;
			
		}
	}

