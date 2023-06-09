package com.demo.controller;


import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/employee")
@Api(value = "Employee Management" , protocols = "http")
public class Employee {
	
	public class ConcurrentHashMap<T1, T2> {
	ConcurrentHashMap<String,Employee> employees = new ConcurrentHashMap<>();
	}
	@ApiOperation(value = "To access particular employee by passing the employee id" , response = Employee.class, code = 200)
	
	@GetMapping ("/{id}")
	public Employee getContact(@Pathvariable String id) {
		List<Employee> employees;
		return employees.get(id);
	}
	
    @ApiOperation(value = "To get the list of employees" , response = Employee.class, code = 200)
	
	@GetMapping ("/list")
	public List<Employee> getAllContacts() {
    	
    	RequestMethod employees; 
    	return new ArrayList<Employee>(employees.values())
				
    
	}


    @ApiOperation(value = "To create an employee by passing the id,name,phone and designation" , response = Employee.class, code = 200)

    @PostMapping
    public class Employeee {
    public Employee addContact(@RequestBody Employeee contact) {
	employees.put(contact.getId(), contact);
	return contact;
    }
  }

}

