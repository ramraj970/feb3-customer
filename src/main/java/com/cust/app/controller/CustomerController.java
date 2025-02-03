
package com.cust.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.cust.app.entity.Customer;
import com.cust.app.service.CustomerService;


@RestController
public class CustomerController {
	
	@Autowired
	CustomerService cSer;
  
	
	@PostMapping("/customer1/customer/add")
	public String addNewCustomer(@RequestBody Customer custData) {
		System.out.println("from browser customer data--->"+custData);
		
		cSer.addNewCustomer(custData);
		
		return "successfully added new record --->";

	}
	

}
