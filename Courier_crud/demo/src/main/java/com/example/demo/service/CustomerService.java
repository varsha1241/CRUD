package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.example.demo.Entity.CustomerEntity;
public interface CustomerService 
{
	CustomerEntity saveLogin(CustomerEntity customerentity);
	List<CustomerEntity> getAllLogins();
	ResponseEntity<Optional<CustomerEntity>> getProductByid(String tracking);
	ResponseEntity <CustomerEntity> updateProductById(String tracking, CustomerEntity customerentity);
}

