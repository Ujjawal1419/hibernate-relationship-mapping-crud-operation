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
		state1.setId(104);
		state1.setName("Madhesh");
		state1.setCapitalName("jankpur");

		State state2 = new State();
		state2.setId(105);
		state2.setName("Lumbini");
		state2.setCapitalName("Deukhuri");

		State state3 = new State();
		state3.setId(106);
		state3.setName("Gandaki");
		state3.setCapitalName("Pokhara");

		List<State> states = new ArrayList<State>(Arrays.asList(state1, state2, state3));

		Country country = new Country();
		country.setId(977);
		country.setName("NEPAL");
		country.setCapitalName("kATHMANDU");
		country.setStates(states);

		dao.saveCountryStateDao(country, states);
	}
}
