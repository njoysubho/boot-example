package org.bootexample.controller;

import org.bootexample.entity.Customer;
import org.bootexample.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	@Autowired
	private CustomerServiceImpl customerService;
	@RequestMapping(value="/customers",method=RequestMethod.POST,consumes="application/json")
	public ResponseEntity<Customer> create(@RequestBody Customer cust){
		customerService.create(cust);
		ResponseEntity<Customer>resp=new ResponseEntity<Customer>(cust, HttpStatus.CREATED);
		return resp;
	}

}
