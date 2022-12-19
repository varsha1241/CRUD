package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.CourierEntity;
import com.example.demo.Entity.CustomerEntity;
import com.example.demo.exception.ResourceNotFoundeexception.ResourceNotFoundException;
import com.example.demo.repository.Courierrepository;

@Service
public class CourierServiceImpl implements CourierService 
{
	@Autowired
	private Courierrepository courierrepository;

	@Override
	public CourierEntity saveLogin(CourierEntity courierentity) 
	{
		return courierrepository.save(courierentity);
	}

	@Override
	public List<CourierEntity> getAllLogins() 
	{
		return courierrepository.findAll();
	}

	@Override
	public ResponseEntity<Optional<CourierEntity>> getProductByid(String track) 
	{
		return ResponseEntity.ok(courierrepository.findById(track));
	}

	@Override
	public ResponseEntity<CourierEntity> updateProductById(String track, CourierEntity courierentity) 
	{
		CourierEntity courier=courierrepository.findById(track).orElseThrow();
		courier.setAddress(courierentity.getAddress());
		courier.setDate(courierentity.getDate());
		courier.setBill_amount(courierentity.getBill_amount());
		CourierEntity updatedProduct=courierrepository.save(courier);
		return ResponseEntity.ok(updatedProduct);
	}
}
