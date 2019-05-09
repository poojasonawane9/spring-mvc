package com.cpagemini.bankapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.capgemini.bankapp.model.BankAccount;
import com.capgemini.bankapp.service.BankAccountService;

@Controller
@RequestMapping("/bankapp")
public class BankAppController {

	BankAccount account;
	
	@Autowired
	private BankAccountService service;

	@RequestMapping("/newAccount")
	public String createNewAccount() {
		return "newaccount";
	}
	
	@RequestMapping("/new")
	public String addNewBankAccount(@RequestParam("customerName") String accountHolderName,
			@RequestParam("type") String accountType, @RequestParam("balance") double accountBalance) {
		account = new BankAccount(accountHolderName, accountType, accountBalance);
		service.addNewBankAccount(account);
		return "success";
	}
}
