package com.employee.customer;

import javax.persistence.Entity;

@Entity
public class Employee {
	
	private String name;//state or fields
	private String desigination;
	private Double salary;

	public String getName() {//setters and getters method
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesigination() {
		return desigination;
	}

	public void setDesigination(String desigination) {
		this.desigination = desigination;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

}
