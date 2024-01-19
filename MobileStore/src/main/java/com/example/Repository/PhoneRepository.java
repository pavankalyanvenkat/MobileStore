package com.example.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Model.Phone;

@Repository
public interface PhoneRepository extends CrudRepository<Phone, Integer> {
	
}