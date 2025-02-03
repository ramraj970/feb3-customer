package com.cust.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cust.app.entity.Customer;
import com.cust.app.repo.CustomerRepo;
@Service
public class CustomerService {
	@Autowired
 CustomerRepo custrepo;

public void addNewCustomer(Customer custData) {
	custrepo.save(custData);

	
}


}