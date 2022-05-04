package com.revature.Repository;

import com.revature.entity.Account;
import com.revature.entity.TDetails;
import java.util.List; 
import com.revature.entity.AccDetails;

public interface AccountRepository {
	void save(AccDetails accdetails);
	Account load(String accNumber);
	
	public void tsave(TDetails tdetails);
	public List<TDetails> getTransfer();
	public List<AccDetails> getAccDetails(int n1);
	void edit(int n1);
	public void delete(int id);
	public int count();
	public int countAcc();
	public void getEmailc(int n1);
	void update(Account account);

}
