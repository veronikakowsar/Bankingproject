package com.revature.Service;

public interface TxrService {
	boolean transfer(double amount, String fromAcc, String toAcc);
}
