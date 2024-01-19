package com.example.services;

import java.util.List;

import com.example.Model.Phone;

public interface PhoneService {
	public List<Phone> getAllPhones();
	public List<Phone> getPhones(String brand);
}
