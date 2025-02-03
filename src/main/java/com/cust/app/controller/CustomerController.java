
package com.cust.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.cust.app.entity.Customer;
import com.cust.app.service.CustomerService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class CustomerController {
	
	@Autowired
	CustomerService custSer;
  
	
	@PostMapping("/customer1/customer/add")
	public String createnewCustomer(@RequestBody Customer custData) {
		System.out.println("from browser customer data--->"+custData);
		
		custSer.addNewCustomer(custData);
		
		return "successfully added new customer--->"+custData.getName();

	}
	

}
