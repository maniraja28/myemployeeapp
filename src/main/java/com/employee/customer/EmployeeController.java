package com.employee.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService service;

	@GetMapping("/employees")
	public List<Employee> getallEmployeeDetails() {

		List<Employee> list = service.getfindAllEmployeeDetails();
		return list;
	}

}
