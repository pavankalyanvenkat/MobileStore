package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Model.Phone;
import com.example.Repository.CustomPhoneRepository;
import com.example.Repository.PhoneRepository;

@Service
public class PhoneServicelmpl implements PhoneService {

	@Autowired
    private PhoneRepository phoneRepository;
	
	@Autowired
	private CustomPhoneRepository customPhoneRpository;
	
	@Override
	public List<Phone> getAllPhones() {
		return (List<Phone>) phoneRepository.findAll();
	}
	
	@Override
	public List<Phone> getPhones(String text) {
		
		List<Phone> allPhones = customPhoneRpository.getNamesLikeOrBrandLike(text);
		return allPhones;
	}

}
