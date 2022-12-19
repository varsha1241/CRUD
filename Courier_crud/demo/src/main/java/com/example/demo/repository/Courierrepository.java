package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.Entity.CourierEntity;
@Repository
public interface Courierrepository extends JpaRepository<CourierEntity,String> 
{
	
}
