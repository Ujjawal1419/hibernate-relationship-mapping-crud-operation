package com.tcs.hibernate_relationship_mapping_crud_operation.one_to_many_mapping.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.tcs.hibernate_relationship_mapping_crud_operation.one_to_many_mapping.dao.CountryStateDao;
import com.tcs.hibernate_relationship_mapping_crud_operation.one_to_many_mapping.entity.Country;
import com.tcs.hibernate_relationship_mapping_crud_operation.one_to_many_mapping.entity.State;

public class InsertCountryStateController {
	public static void main(String[] args) {

		CountryStateDao dao = new CountryStateDao();

		State state1 = new State();
		state1.setId(101);
		state1.setName("Jharkhand");
		state1.setCapitalName("Ranchi");

		State state2 = new State();
		state2.setId(102);
		state2.setName("Bihar");
		state2.setCapitalName("Patna");

		State state3 = new State();
		state3.setId(103);
		state3.setName("Assam");
		state3.setCapitalName("Dispur");

		List<State> states = new ArrayList<State>(Arrays.asList(state1, state2, state3));

		Country country = new Country();
		country.setId(91);
		country.setName("INDIA");
		country.setCapitalName("DELHI");
		country.setStates(states);

		dao.saveCountryStateDao(country, states);
	}
}
