package com.employee.customer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository  extends JpaRepository<Customer,Integer>{


	//findByXXX
	//SELECT * FROM employee_db.customer where adress='Bangalore';
	List<Customer> findByAdress(String adress);
	List<Customer> findByName(String name);
	List<Customer> findByMobileNumber(String mobilenumber);
	
}
