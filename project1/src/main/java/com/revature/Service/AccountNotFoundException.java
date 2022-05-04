package com.revature.Service;

@SuppressWarnings("serial")
public class AccountNotFoundException extends RuntimeException {

	public AccountNotFoundException(String accNum) {
		super(accNum);
	}

}
