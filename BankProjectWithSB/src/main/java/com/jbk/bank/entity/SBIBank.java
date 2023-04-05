package com.jbk.bank.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SBIBank {
	private int id;
	private String Cusname;
	private String email;
	private double mobno;
	private double balance;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCusname() {
		return Cusname;
	}

	public void setCusname(String cusname) {
		Cusname = cusname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getMobno() {
		return mobno;
	}

	public void setMobno(double mobno) {
		this.mobno = mobno;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "SBIBank [id=" + id + ", Cusname=" + Cusname + ", email=" + email + ", mobno=" + mobno + ", balance="
				+ balance + "]";
	}

}
