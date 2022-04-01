package com.employee.customer;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service // annotation spring will import
public class CustomerService {// class name

	@Autowired
	CustomerRepository repository;

	public List<Customer> getAllCustomers() {
		List<Customer> customerlist = repository.findAll();
		return customerlist;
	}

	public void addCustomer(Customer customer) {// postMapping
		repository.save(customer);
	}

	public void updateCustomer(Customer customer) {// putMapping
		repository.save(customer);
	}

	public void deleteCustomer(Integer id) {// deletemapping
		repository.deleteById(id);
	}

	public List<Customer> getCustomerByCity(String city) {

//		List<Customer> customerlist = repository.findAll(); // Get all customers data
//		
//		// filter customenrs based on city
//		List<Customer> customersByCity = customerlist.stream().filter(customer -> customer.getAdress().equalsIgnoreCase(city))
//				.collect(Collectors.toList());
//		
//		// return filtered list 
//		return customersByCity;
		
		List<Customer> customersByCity = repository.findByAdress(city);
		return customersByCity;
	}
		
	public List<Customer> getCustomerByName(String name) {
		
//		List<Customer> customerlist = repository.findAll();//get all customers data
//		// filter based on names
//		List<Customer> customersByName = customerlist.stream().filter(customer -> customer.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
//		return customersByName;
		List<Customer> customersByName = repository.findByName(name);
		return customersByName;
	}
	public List<Customer>getCustomerByMobileNumber(String mobilenumber){
		List<Customer>customersByMobileNumber = repository.findByMobileNumber(mobilenumber);
		return customersByMobileNumber;
	}
//	public Set<Integer> getfindAllCustomerId() {// method
//
//		Set<Integer> set = new LinkedHashSet<>();// object creation
//		set.add(123);// adding the data by using crud operations
//		set.add(234);
//		set.add(345);
//		set.add(456);
//		set.add(567);
//
//		return set;// return thye we have to return the data set
//
//	}
//
//public List<Customer> getfindAllCustomerDetails() {
//
//		Customer c1 = new Customer();
//		c1.setId(111);
//		c1.setName("raja");
//		c1.setMobilenumber("9849201399");
//		c1.setAdress("Nagaram");
//
//		Customer c2 = new Customer();
//		c2.setId(222);
//		c2.setName("ravi");
//		c2.setMobilenumber("9640116771");
//		c2.setAdress("Gondi");
//		Customer c3 = new Customer();
//		c3.setId(333);
//		c3.setName("vasu");
//		c3.setMobilenumber("9492567892");
//		c3.setAdress("Ramarajulanka");
//
//		Customer c4 = new Customer();
//		c4.setId(444);
//		c4.setName("prasad");
//		c4.setMobilenumber("9989354344");
//		c4.setAdress("Malkipuram");
//
//	List<Customer> customerList = new ArrayList<>();
//		customerList.add(c1);
//		customerList.add(c2);
//		customerList.add(c3);
//		customerList.add(c4);
//		return customerList;
//}
//	
//	public List<Customer> getAllCustomerDetails()
//	{
//		List<Customer> customerlist = repository.findAll();
//		return customerlist;
//	}
	public String getAllUsersData() {
		
		// External API - How to consume an API
		// RestTemplate class - HttpClient 
		// Webclient 
		
		RestTemplate rt = new RestTemplate();
		String response = rt.getForEntity("https://jsonplaceholder.typicode.com/users", String.class).getBody();
		return response;
		
		
	}

}
