package com.sg.katabank.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sg.katabank.model.Account;
import com.sg.katabank.model.Operation;
import com.sg.katabank.service.AccountService;

@RestController
public class AccountController {
	 private final AccountService accountService; 
	 
	 
	 public AccountController(AccountService accountService) {
	        this.accountService = accountService;
	    }
	
	
	@PostMapping("/deposit")
	public ResponseEntity<Account> deposit (@RequestBody Account account, double amount)
	{ 
		try {
		accountService.deposit(account, amount);
		
	}catch (Exception e) {
		
		return new ResponseEntity<Account>(HttpStatus.EXPECTATION_FAILED);
	}
		return new ResponseEntity<Account>(HttpStatus.CREATED);
		
	}
	
	
	@PostMapping("/withdraw")
	public ResponseEntity<Account> withdraw (@RequestBody Account account, double amount)
	{
		try {
		accountService.deposit(account, amount);
	}catch (Exception e) {
			
		return new ResponseEntity<Account>(HttpStatus.EXPECTATION_FAILED);
	}
		return new ResponseEntity<Account>(HttpStatus.CREATED);
			
		}
	
    @GetMapping("/operations-history")
    public ResponseEntity<List<Operation>> checkOperationsHistory(@RequestBody Account account) {
    	try {
         accountService.printHistory(account);
    	
    }catch (Exception e) {
		
		return new ResponseEntity<List<Operation>>(HttpStatus.EXPECTATION_FAILED);
	}
		return new ResponseEntity<List<Operation>>(HttpStatus.CREATED);
			
		}
	
    }

