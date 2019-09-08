package com.dhruv.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhruv.server.domain.Customer;

public interface ICustomerRepository extends JpaRepository<Customer, Integer> {

	
}
