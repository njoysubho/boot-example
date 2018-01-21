package org.bootexample.service;

import org.bootexample.entity.Customer;
import org.bootexample.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl {
	@Autowired
	private CustomerRepository customerRepository;
	public void create(Customer customer){
		customerRepository.save(customer);
	}

}
