package com.tcs.hibernate_relationship_mapping_crud_operation.one_to_many_mapping_bi_directional.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.tcs.hibernate_relationship_mapping_crud_operation.one_to_many_mapping_bi_directional.dao.Country1State1Dao;
import com.tcs.hibernate_relationship_mapping_crud_operation.one_to_many_mapping_bi_directional.entity.State1;

public class InsertState1AndAssociateWithCountry1Controller {

	public static void main(String[] args) {
		
		State1 state1=new State1();
		state1.setId(501);
		state1.setName("Lombok");
		state1.setCapitalName("Island");
		
		State1 state2= new State1();
		state2.setId(502);
		state2.setName("Jakarta");
		state2.setCapitalName("Java");
		
		List<State1> states= new ArrayList<State1>(Arrays.asList(state1,state2));
		
		new Country1State1Dao().saveStates1AndAssociateWithCountry1Dao(0, null);
	}
}
