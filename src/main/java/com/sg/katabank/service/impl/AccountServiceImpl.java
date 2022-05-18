package com.sg.katabank.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.sg.katabank.model.Account;
import com.sg.katabank.model.Operation;
import com.sg.katabank.model.OperationTypeEnum;
import com.sg.katabank.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Override
	public void deposit(Account account, double amount) {
		if(amount > 0) {	
		  account.setBalance(account.getBalance() + amount);
          account.addOperation(new Operation(OperationTypeEnum.DEPOSIT, amount));
       
        } else throw new IllegalArgumentException("Amount not valid");
		
		
	}

	@Override
	public void withdraw(Account account, double amount) {
		 if (amount > 0 && amount <= account.getBalance()) {
			 account.setBalance(account.getBalance() - amount);
		     account.addOperation(new Operation(OperationTypeEnum.WITHDRAW, amount));
	} else throw new IllegalArgumentException("Balance is not sufficient");

}

	@Override
	public List<Operation> printHistory(Account account) {
		
		return account.getOperations();
	}}
