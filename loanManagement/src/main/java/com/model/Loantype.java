package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lrc_loanType")
public class Loantype {
	@Id
	int lt_id;
	String ly_name;
	String lt_desc;

	public int getLt_id() {
		return lt_id;
	}

	public void setLt_id(int lt_id) {
		this.lt_id = lt_id;
	}

	public String getLy_name() {
		return ly_name;
	}

	public void setLy_name(String ly_name) {
		this.ly_name = ly_name;
	}

	public String getLt_desc() {
		return lt_desc;
	}

	public void setLt_desc(String lt_desc) {
		this.lt_desc = lt_desc;
	}

	@Override
	public String toString() {
		return "Loantype [lt_id=" + lt_id + ", ly_name=" + ly_name + ", lt_desc=" + lt_desc + "]";
	}

}
