package com.employee.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // annotations is used in spring
@RequestMapping("/customeres")
public class CustomerController {

	@Autowired
	CustomerService service;

	@PostMapping
	public void addCustomer(@RequestBody Customer customer) {
		service.addCustomer(customer);
	}

	@GetMapping
	public List<Customer> getAllCustomeres() {// method creation
		List<Customer> customerlist = service.getAllCustomers();// object calling invoked service method
		return customerlist;
	}

	@PutMapping // post or put @RequestBody is common
	public void updateCustomer(@RequestBody Customer customer) {
		service.updateCustomer(customer);
	}

	@DeleteMapping("/{id}")
	public void deleteCustomerById(@PathVariable Integer id) {
		service.deleteCustomer(id);
	}

	@GetMapping("/{city}")
	public List<Customer> getCustomerByCity(@PathVariable String city) {// method creation

		List<Customer> customerlist = service.getCustomerByCity(city);
		return customerlist;
	}

	@GetMapping("/name/{name}")
	public List<Customer> getCustomerByName(@PathVariable String name) {
		List<Customer> customerlist = service.getCustomerByName(name);
		return customerlist;
	}
	@GetMapping("/usersdata")
	public String getAllUserData() {
		
		String response = service.getAllUsersData();
		return response;
	}
}
