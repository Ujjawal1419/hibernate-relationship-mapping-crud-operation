package com.tcs.hibernate_relationship_mapping_crud_operation.one_to_one_mapping_bi_directional.dao;

import com.tcs.hibernate_relationship_mapping_crud_operation.one_to_one_mapping.entity.Person;
import com.tcs.hibernate_relationship_mapping_crud_operation.one_to_one_mapping_bi_directional.entity.Adhar1;
import com.tcs.hibernate_relationship_mapping_crud_operation.one_to_one_mapping_bi_directional.entity.Person1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Person1Adhar1Dao {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernate-mapping");
    EntityManager em=null;
    EntityTransaction et= null;
    
    
    public Person savePerson1Adhar1Dao(Person1 person, Adhar1 adhar) {
		
        em=emf.createEntityManager();
        et=em.getTransaction();
        
        et.begin();
        
       // em.persist( adhar); /* doesn't required adhar when we use cascade*/
        em.persist(person);
        
        et.commit();
  		return null;
  	}
  	
  	 
}
