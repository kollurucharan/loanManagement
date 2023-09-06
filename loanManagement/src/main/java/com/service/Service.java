package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.DAO.EmployeeDAO;
import com.model.CustomerdetailsEntity;
import com.model.LoanApplicantsEntity;
import com.model.LoannomEntity;

@Component
public class Service {
	
	
	 EmployeeDAO dd;
		@Autowired
		 public Service(EmployeeDAO dd) {
			this.dd=dd;
		}
		public void first()
		{
			dd.first();
		}
		public void customer(CustomerdetailsEntity cd) {
			dd.customer(cd);
		}
		public void applicaints(LoanApplicantsEntity lp)
		{
			dd.applicaints(lp);
		}
		public void nominee(LoannomEntity ln)
		{
			dd.nominee(ln);
		}
		public void finall()
		{
			dd.finall();
		}
}
