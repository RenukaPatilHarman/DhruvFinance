package com.dhruv.server.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dhruv.server.domain.Customer;
import com.dhruv.server.repository.ICustomerRepository;

@RestController
@RequestMapping(path = "/customer")
public class CustomerController {

	@Autowired
	ICustomerRepository repository;

	@GetMapping("/allCustomers")
	public List<Customer> getAllCustomers() {
		List<Customer> customers = repository.findAll();
		return customers;
	}

	@PostMapping("/addCustomer")
	public ResponseEntity<?> addCustomer(@RequestBody Customer customer) {
		if (repository.save(customer) != null)
			return new ResponseEntity<>(null, HttpStatus.CREATED);
		else
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
	}
}
