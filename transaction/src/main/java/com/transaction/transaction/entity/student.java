package com.transaction.transaction.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	
	private String sname;
	
	private String city;
	
	@OneToOne
	private laptop laptop;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(laptop laptop) {
		this.laptop = laptop;
	}
	
}
