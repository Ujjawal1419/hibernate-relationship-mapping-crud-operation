package com.tcs.hibernate_relationship_mapping_crud_operation.one_to_many_mapping_bi_directional.dao;

import java.util.List;

import com.tcs.hibernate_relationship_mapping_crud_operation.one_to_many_mapping_bi_directional.entity.Country1;
import com.tcs.hibernate_relationship_mapping_crud_operation.one_to_many_mapping_bi_directional.entity.State1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Country1State1Dao {

	EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernate-mapping");
	
	 EntityManager em=null;
	 
	 EntityTransaction et= null;
	 
	 public Country1 saveCountryStateDao(Country1 country,List<State1> states) {
		 em=emf.createEntityManager();
		 
		 et=em.getTransaction();
		 
		 if(country==null || states.isEmpty()) {
			 
			 return null;
			 
		 }
		 et.begin();
		 
		 
		 
		 em.persist(country);
		 
		 et.commit();
		 
		 return country;
	 }
	 
	 public Country1 saveStates1AndAssociateWithCountry1Dao(int countryId, List<State1> states) {
		  em=emf.createEntityManager();
		  
		  et=em.getTransaction();
		  
		  Country1 country= em.find(Country1.class, countryId);
		  
		  if(country==null || states.isEmpty()) {
			  
			  return null;
		  }
		  et.begin();
		  
		  for(State1 state: states) {
			  state.setCountry(country);
			  
			  em.persist(state);
		  }
		  
		  et.commit();
		  
		  return country;
	 }
	 
	 public boolean deleteCountry1ByCountryIdDao(int countryId) {
		 
		 em=emf.createEntityManager();
		 
		 Country1 country=em.find(Country1.class, countryId);
		 
		 if(country!=null) {
			 
			 et.begin();
			 
			 em.remove(country);
			 
			 et.commit();
			 
			 return true;
			 
		 }
		 return false;
	 }
	 
	 public Country1 getCountry1ByIdDao(int countryId) {
		 
		 em=emf.createEntityManager();
		 
		 return  em.find(Country1.class, countryId);
		 
	 }
}
