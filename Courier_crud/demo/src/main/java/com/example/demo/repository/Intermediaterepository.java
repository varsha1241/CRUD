package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.Entity.IntermediateEntity;
@Repository
public interface Intermediaterepository extends JpaRepository<IntermediateEntity,Long> 
{

}
