package com.example.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.example.Model.Phone;

@Repository
public class CustomPhoneRepositorylmpl implements CustomPhoneRepository {

    @PersistenceContext
    EntityManager entityManager;
    
	@SuppressWarnings("unchecked")
	@Override
	public List<Phone> getNamesLikeOrBrandLike(String name) {
		 Query query = entityManager.createQuery("from Phone where lower(model) LIKE :model OR lower(brand.name) LIKE :brandName");
	     query.setParameter("model", "%" + name.toLowerCase() + "%");
	     query.setParameter("brandName", "%" + name.toLowerCase() + "%");

	     return query.getResultList();
	}

}