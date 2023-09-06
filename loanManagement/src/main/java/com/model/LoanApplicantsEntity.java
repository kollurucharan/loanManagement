package com.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lrc_loanapplicants")
public class LoanApplicantsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int la_id;
	// ff
	int la_cust_id;
	String la_date;
	// ff
	int la_lt_id;
	double la_amount;
	double la_emirange_from;
	double la_emirange_to;
	int la_nom_req;
	double la_cibil_score;
	String la_staus;
	String la_conclusion_remarks;
	// ff
	int la_ln_id;
	public int getLa_id() {
		return la_id;
	}
	public void setLa_id(int la_id) {
		this.la_id = la_id;
	}
	public int getLa_cust_id() {
		return la_cust_id;
	}
	public void setLa_cust_id(int la_cust_id) {
		this.la_cust_id = la_cust_id;
	}
	public String getLa_date() {
		return la_date;
	}
	public void setLa_date(String la_date) {
		this.la_date = la_date;
	}
	public int getLa_lt_id() {
		return la_lt_id;
	}
	public void setLa_lt_id(int la_lt_id) {
		this.la_lt_id = la_lt_id;
	}
	public double getLa_amount() {
		return la_amount;
	}
	public void setLa_amount(double la_amount) {
		this.la_amount = la_amount;
	}
	public double getLa_emirange_from() {
		return la_emirange_from;
	}
	public void setLa_emirange_from(double la_emirange_from) {
		this.la_emirange_from = la_emirange_from;
	}
	public double getLa_emirange_to() {
		return la_emirange_to;
	}
	public void setLa_emirange_to(double la_emirange_to) {
		this.la_emirange_to = la_emirange_to;
	}
	public int getLa_nom_req() {
		return la_nom_req;
	}
	public void setLa_nom_req(int la_nom_req) {
		this.la_nom_req = la_nom_req;
	}
	public double getLa_cibil_score() {
		return la_cibil_score;
	}
	public void setLa_cibil_score(double la_cibil_score) {
		this.la_cibil_score = la_cibil_score;
	}
	public String getLa_staus() {
		return la_staus;
	}
	public void setLa_staus(String la_staus) {
		this.la_staus = la_staus;
	}
	public String getLa_conclusion_remarks() {
		return la_conclusion_remarks;
	}
	public void setLa_conclusion_remarks(String la_conclusion_remarks) {
		this.la_conclusion_remarks = la_conclusion_remarks;
	}
	public int getLa_ln_id() {
		return la_ln_id;
	}
	public void setLa_ln_id(int la_ln_id) {
		this.la_ln_id = la_ln_id;
	}

}