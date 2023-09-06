package com.DAO;


import com.model.CustomerdetailsEntity;

import com.model.LoanApplicantsEntity;
import com.model.LoannomEntity;

public interface EmployeeDAO {
	public void first();
	public void customer(CustomerdetailsEntity cd);
	public void applicaints(LoanApplicantsEntity lp);
	public void nominee(LoannomEntity ln);
	public void finall();
	
}
