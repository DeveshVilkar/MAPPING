package com.jsp.person.account;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BankAcount {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bank_id;
	private String bank_name;
	private long ifsc_code;
	private long account_no;
	
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public long getIfsc_code() {
		return ifsc_code;
	}
	public void setIfsc_code(long ifsc_code) {
		this.ifsc_code = ifsc_code;
	}
	public long getAccount_no() {
		return account_no;
	}
	public void setAccount_no(long account_no) {
		this.account_no = account_no;
	}
	

}
