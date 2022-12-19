package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.demo.Entity.CustomerEntity;
import com.example.demo.exception.ResourceNotFoundeexception;
import com.example.demo.repository.Customerrepository;
@Service
public class CustomerServiceImpl implements CustomerService 
{
	@Autowired
	private Customerrepository customerrepository;

	@Override
	public CustomerEntity saveLogin(CustomerEntity customerentity) 
	{
		return customerrepository.save(customerentity);
	}

	@Override
	public List<CustomerEntity> getAllLogins() 
	{
		return customerrepository.findAll();
	}

	@Override
	public ResponseEntity<Optional<CustomerEntity>> getProductByid(String tracking) {
		return ResponseEntity.ok(customerrepository.findById(tracking));
	}

	@Override
	public ResponseEntity<CustomerEntity> updateProductById(String tracking, CustomerEntity customerentity) 
	{
		CustomerEntity customer=customerrepository.findById(tracking).orElseThrow();
		customer.setEmail(customerentity.getEmail());
		customer.setPhone(customerentity.getPhone());
		customer.setProduct_shiped(customerentity.getProduct_shiped());
		CustomerEntity updatedProduct=customerrepository.save(customer);
		return ResponseEntity.ok(updatedProduct);
	}
}


