package com.tcs.hibernate_relationship_mapping_crud_operation.one_to_many_mapping_bi_directional.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.tcs.hibernate_relationship_mapping_crud_operation.one_to_many_mapping_bi_directional.dao.Country1State1Dao;
import com.tcs.hibernate_relationship_mapping_crud_operation.one_to_many_mapping_bi_directional.entity.Country1;
import com.tcs.hibernate_relationship_mapping_crud_operation.one_to_many_mapping_bi_directional.entity.State1;

public class InsertCountry1State1Controller {

	public static void main(String[] args) {
		
		Country1State1Dao dao= new Country1State1Dao();
		
		State1 state1= new State1();
		state1.setId(101);
		state1.setName("Jharkhand");
		state1.setCapitalName("Ranchi");
		
		State1 state2=new State1();
		state2.setId(102);
		state2.setName("Bihar");
		state2.setCapitalName("Patna");
		
		State1 state3 = new State1();
		state3.setId(103);
		state3.setName("Assam");
		state3.setCapitalName("Dispur");
		
		List<State1> states =new ArrayList<State1>(Arrays.asList(state1,state2,state3));
		
		Country1 country = new Country1();
		country.setId(91);
		country.setName("INDIA");
		country.setCapitalName("DELHI");
		country.setStates(states);
		
		state1.setCountry(country);
		state2.setCountry(country);
		state3.setCountry(country);
		
		dao.saveCountryStateDao(country, states);
		
		System.out.println("Country and States inserted successfully");
		
	}
}
