package com.employee.customer;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // customer class is directly access through the database table that means mysql or oracle
public class Customer {

	@Id // unique means differnt state not similar 
	private int id;// state or fields
	private String name;
	private String mobilenumber;
	private String adress;
  //generate setters and getters methods using fields
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

}
