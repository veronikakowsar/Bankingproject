package com.revature.Service;

public class AccountBalanceException extends RuntimeException {

	public AccountBalanceException(double balance) {
		super(String.valueOf(balance));
	}

}