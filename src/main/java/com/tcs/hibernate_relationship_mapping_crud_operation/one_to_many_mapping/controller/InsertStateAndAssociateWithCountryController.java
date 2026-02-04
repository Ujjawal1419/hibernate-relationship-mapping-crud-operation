package com.tcs.hibernate_relationship_mapping_crud_operation.one_to_many_mapping.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.tcs.hibernate_relationship_mapping_crud_operation.one_to_many_mapping.dao.CountryStateDao;
import com.tcs.hibernate_relationship_mapping_crud_operation.one_to_many_mapping.entity.State;

public class InsertStateAndAssociateWithCountryController {
	
  public static void main(String[] args) {
	  
	  State state1=new State();
	  state1.setId(501);
	  state1.setName("lombok");
	  state1.setCapitalName("island");
	  
	  State state2=new State();
	  state2.setId(502);
	  state2.setName("jakarta");
	  state2.setCapitalName("java");
	  
	  List<State> states=new ArrayList<State>(Arrays.asList(state1,state2));
	  
	  new CountryStateDao().saveStatesAndAssociateWithCountryDao(0, null);
  }

}
