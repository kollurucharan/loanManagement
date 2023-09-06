package com.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lrc_Customer")
public class CustomerdetailsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int cust_id;
	String cust_fname;
	String cust_lname;
	String cust_dob;
	String cust_panno;
	int cust_mobile;
	String cust_address;
	String cust_gname;

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getCust_fname() {
		return cust_fname;
	}

	public void setCust_fname(String cust_fname) {
		this.cust_fname = cust_fname;
	}

	public String getCust_lname() {
		return cust_lname;
	}

	public void setCust_lname(String cust_lname) {
		this.cust_lname = cust_lname;
	}

	public String getCust_dob() {
		return cust_dob;
	}

	public void setCust_dob(String cust_dob) {
		this.cust_dob = cust_dob;
	}

	public String getCust_panno() {
		return cust_panno;
	}

	public void setCust_panno(String cust_panno) {
		this.cust_panno = cust_panno;
	}

	public int getCust_mobile() {
		return cust_mobile;
	}

	public void setCust_mobile(int cust_mobile) {
		this.cust_mobile = cust_mobile;
	}

	public String getCust_address() {
		return cust_address;
	}

	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}

	public String getCust_gname() {
		return cust_gname;
	}

	public void setCust_gname(String cust_gname) {
		this.cust_gname = cust_gname;
	}

	@Override
	public String toString() {
		return "Customerdetails [cust_id=" + cust_id + ", cust_fname=" + cust_fname + ", cust_lname=" + cust_lname
				+ ", cust_dob=" + cust_dob + ", cust_panno=" + cust_panno + ", cust_mobile=" + cust_mobile
				+ ", cust_address=" + cust_address + ", cust_gname=" + cust_gname + "]";
	}

}
