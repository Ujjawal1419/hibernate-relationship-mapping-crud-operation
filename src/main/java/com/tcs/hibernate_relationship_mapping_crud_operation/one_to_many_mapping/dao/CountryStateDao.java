package com.tcs.hibernate_relationship_mapping_crud_operation.one_to_many_mapping.dao;

import java.util.List;

import com.tcs.hibernate_relationship_mapping_crud_operation.one_to_many_mapping.entity.Country;
import com.tcs.hibernate_relationship_mapping_crud_operation.one_to_many_mapping.entity.State;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class CountryStateDao {
  
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("hibernate-mapping");
	
	EntityManager em=null;
	
	EntityTransaction et=null;
	
	public Country saveCountryStateDao(Country country,List<State> states) {
		
		em=emf.createEntityManager();
		
		et= em.getTransaction();
		if(country==null || states.isEmpty()) {
			
			return null;
		}
		
		et.begin();
		
		for(State state:states) {
			em.persist(state);
		}
		
		em.persist(country);
		
		et.commit();
		
		return country;
	}
	
	public Country saveStatesAndAssociateWithCountryDao(int countryId,List<State> states) {
		em=emf.createEntityManager();
		et=em.getTransaction();
		
		Country country=em.find(Country.class,countryId );
		
		if(country==null ||states.isEmpty()) {
			
			return null;
		}
		et.begin();
		String  insertCountry_StateQuery="insert into country_state(country_id,states_id) values(?1,?2)";
		Query query=em.createNativeQuery(insertCountry_StateQuery);
		
		for(State state: states) {
			em.persist(state);
			query.setParameter(1, country.getId());
			query.setParameter(2, state.getId());
			
			query.executeUpdate();
			
		}
		
		et.commit();
		return country;
	}
}
