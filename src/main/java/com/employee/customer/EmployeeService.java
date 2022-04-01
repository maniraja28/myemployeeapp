package com.employee.customer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	public List<Employee> getfindAllEmployeeDetails() {

		List<Employee> list = new ArrayList<>();
		
		Employee e1 = new Employee();
		e1.setName("raja");
		e1.setDesigination("software enginner");
		e1.setSalary(69999.55);

		Employee e2 = new Employee();
		e2.setName("ravi");
		e2.setDesigination("networking enginner");
		e2.setSalary(87666.78);

		Employee e3 = new Employee();
		e3.setName("prasad");
		e3.setDesigination("software enginner");
		e3.setSalary(58555.55);

		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		return list;

	}

}
