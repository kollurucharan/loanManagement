package com.DAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


import com.model.CustomerdetailsEntity;

import com.model.LoanApplicantsEntity;
import com.model.LoannomEntity;

@Component

public class EmployeeDAOImp implements EmployeeDAO {

	@PersistenceContext
	private EntityManager em;
	

	@Override
	public void first() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}
   
	 CustomerdetailsEntity cd;
	 LoanApplicantsEntity lp;
	 LoannomEntity ln;

	@Override
	@Transactional
	public void customer(CustomerdetailsEntity cd) {
		this.cd=cd;
		em.persist(cd);
		// TODO Auto-generated method stub
		System.out.println(cd.getCust_address());
	}



	@Override
	@Transactional
	public void applicaints(LoanApplicantsEntity lp) {
		// TODO Auto-generated method stub
		this.lp=lp;
		em.persist(lp);
		System.out.println(lp.getLa_amount());
	}



	@Override
	@Transactional
	public void nominee(LoannomEntity ln) {
		// TODO Auto-generated method stub
		this.ln=ln;
		em.persist(ln);
		System.out.println(ln.getLn_relation());
	}



	@Override
	public void finall() {
		// TODO Auto-generated method stub
		
	}

}
