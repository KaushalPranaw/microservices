package com.test.spring.batch.config;

import org.springframework.batch.item.ItemProcessor;

import com.test.spring.batch.entity.Customer;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

	@Override
	public Customer process(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		if(customer.getCountry().equals("USA"))
			return customer;
		else
			return null;
	}

}
