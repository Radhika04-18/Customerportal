package com.vcube.customerportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vcube.customerportal.model.Customer;
import com.vcube.customerportal.repository.CustomerRepo;
@Service

public class CustomerServiceImpl implements CustomerService {
	@Autowired 
	 CustomerRepo customerrepo;
	
	 public Customer saveCustomer(Customer c)
	 {
		 return customerrepo.save(c);
	 }

	 @Override
	 public Customer getCustomer(Integer id) {
		return customerrepo.findById(id).orElseThrow();
	 }

	 @Override
	 public List<Customer> getAllCustomer() {
		
		return customerrepo.findAll();
	 }

	 @Override
	 public Customer updateCustomer(Customer c) {

		return customerrepo.save(c);
	 }

	 @Override
	 public void deleteCustomer(Integer id) {
		// TODO Auto-generated method stub
		
	 }

	 
}
