package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lrc_Loan_Nominees")
public class LoannomEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int ln_id;
	String ln_nominee;
	String ln_relation;

	public int getLn_id() {
		return ln_id;
	}

	public void setLn_id(int ln_id) {
		this.ln_id = ln_id;
	}

	public String getLn_nominee() {
		return ln_nominee;
	}

	public void setLn_nominee(String ln_nominee) {
		this.ln_nominee = ln_nominee;
	}

	public String getLn_relation() {
		return ln_relation;
	}

	public void setLn_relation(String ln_relation) {
		this.ln_relation = ln_relation;
	}

	@Override
	public String toString() {
		return "Loannom [ln_id=" + ln_id + ", ln_nominee=" + ln_nominee + ", ln_relation=" + ln_relation + "]";
	}

}