package com.tcs.hibernate_relationship_mapping_crud_operation.one_to_one_mapping.dao;

import com.tcs.hibernate_relationship_mapping_crud_operation.one_to_one_mapping.entity.Adhar;
import com.tcs.hibernate_relationship_mapping_crud_operation.one_to_one_mapping.entity.Person;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;



public class PersonAdharDao {
	
	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernate-mapping");
	 
	 EntityManager em= null;
	 
	 EntityTransaction et=null;
	 
	public Person savePersonAdharDao(Person person, Adhar adhar) {
		
      em=emf.createEntityManager();
      et=em.getTransaction();
      
      et.begin();
      
      em.persist( adhar);
      em.persist(person);
      
      et.commit();
		return null;
	}
	
	 public Person getPersonAndAdharByPersonIdDao(int personId) {
		 
		 em=emf.createEntityManager();
		 
		 return em.find(Person.class, personId);
	 }
	 
	 
	 public boolean deleteAdharByAdharNumber(long adharNumber) {
		 
		 em=emf.createEntityManager();
		 
		 et=em.getTransaction();
		 
		 Adhar adhar=em.find(Adhar.class,adharNumber);
		 
		 if(adhar!=null) {
			 et.begin();
			 
			 Query query=em.createQuery("SELECT p FROM Person p.adhar.adharNO=?1");
			 
			 query.setParameter(1, adhar.getAdharNo());
			 
			 Person person=(Person) query.getSingleResult();
			 person.setAdhar(null);
			 
			 em.merge(person);
			 
			 em.remove(adhar);
			 
			 et.commit();
			 	 
		 }
		 return false;
	 }
}
