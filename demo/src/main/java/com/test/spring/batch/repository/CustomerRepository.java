package com.test.spring.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.spring.batch.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
