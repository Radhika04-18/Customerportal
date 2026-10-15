package com.vcube.customerportal.service;

import java.util.List;

import com.vcube.customerportal.model.Customer;

public interface CustomerService {
	
	
	 Customer saveCustomer(Customer c);
	 
	 Customer getCustomer(Integer id);
	 
	 List<Customer> getAllCustomer();
	 
	 Customer updateCustomer(Customer id);
	 
	 void deleteCustomer(Integer id);
	 
	 
	
	

}
