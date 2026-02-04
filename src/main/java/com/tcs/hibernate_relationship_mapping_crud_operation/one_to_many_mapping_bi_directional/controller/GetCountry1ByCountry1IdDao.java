package com.tcs.hibernate_relationship_mapping_crud_operation.one_to_many_mapping_bi_directional.controller;

import com.tcs.hibernate_relationship_mapping_crud_operation.one_to_many_mapping_bi_directional.dao.Country1State1Dao;
import com.tcs.hibernate_relationship_mapping_crud_operation.one_to_many_mapping_bi_directional.entity.Country1;

public class GetCountry1ByCountry1IdDao {
	 public static void main(String[] args) {
		
		Country1 country= new Country1State1Dao().getCountry1ByIdDao(91);
		
		System.out.println(country.getCapitalName());
	}

}
