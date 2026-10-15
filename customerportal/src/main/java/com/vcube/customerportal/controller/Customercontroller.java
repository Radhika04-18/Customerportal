package com.vcube.customerportal.controller;

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

import com.vcube.customerportal.model.Customer;
import com.vcube.customerportal.service.CustomerService;

//http:localhost:9111/customer
@RestController
@RequestMapping("/customer")

public class Customercontroller {
	@Autowired
	CustomerService customerService;
	
	@GetMapping("hello")
	String hello() {
		return "good morning";
	}
	//http://localhost:9111/customer/getCustomer/1
	@GetMapping("getCustomer/{id}")
	Customer getCustomer(@PathVariable Integer id) {
		return customerService.getCustomer(id);
	}
	//http://localhost/customer/updateCustomer/1
	@PutMapping("updateCustomer/{id}")
	Customer updateCustomer(@PathVariable Integer id,@RequestBody Customer c) {
		Customer customerFromDB=getCustomer(id);
		
		customerFromDB.setAge(c.getAge());
		customerFromDB.setMarks(c.getMarks());
		customerFromDB.setCity(c.getCity());
		customerFromDB.setName(c.getName());
		return customerService.updateCustomer(customerFromDB);
	}
	//http://localhost:9111/customer/deleteCustomer/1
	@DeleteMapping("deleteCustomer/{id}")
	String deleteCustomer(@PathVariable Integer id) {
		customerService.deleteCustomer(id);
		return "Delete Customer with"+id+"successfully.";
	}
	
	@GetMapping("/getAllCustomer")
	List<Customer>getAllCustomer(){
		return customerService.getAllCustomer();
	}
	
	//http:localhost:9111/customer//cc
	@PostMapping("//cc")
	
	Customer createCustomer(@RequestBody Customer c) {
		return customerService.saveCustomer(c);
	}
}
