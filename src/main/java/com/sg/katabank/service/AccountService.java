package com.sg.katabank.service;

import com.sg.katabank.model.Account;
import com.sg.katabank.model.Operation;
import java.util.List;

public interface AccountService {
	
	 void deposit(Account account, double amount);
	 void withdraw(Account account, double amount);
	 List<Operation> printHistory(Account account);
	
}
