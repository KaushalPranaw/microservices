package com.test.empcrudwithpg.repository;

import com.test.empcrudwithpg.model.Address;
import com.test.empcrudwithpg.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
}
