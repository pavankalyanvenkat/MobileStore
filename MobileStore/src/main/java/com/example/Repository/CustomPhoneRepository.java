package com.example.Repository;

import java.util.List;


import com.example.Model.Phone;

public interface CustomPhoneRepository {
	
	List<Phone> getNamesLikeOrBrandLike(String name);
	
}