package com.tcs.hibernate_relationship_mapping_crud_operation.one_to_one_mapping.dao;

import com.tcs.hibernate_relationship_mapping_crud_operation.one_to_one_mapping.entity.Adhar;
import com.tcs.hibernate_relationship_mapping_crud_operation.one_to_one_mapping.entity.Person;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;



public class PersonAdharDao {
	
	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernate-mapping");
	 
	 EntityManager em= null;
	 
	 EntityTransaction et=null;
	 
	public Person savePersonAdharDao(Person person, Adhar adhar) {
		
      em=emf.createEntityManager();
      et=em.getTransaction();
		return null;
	}
	

}
