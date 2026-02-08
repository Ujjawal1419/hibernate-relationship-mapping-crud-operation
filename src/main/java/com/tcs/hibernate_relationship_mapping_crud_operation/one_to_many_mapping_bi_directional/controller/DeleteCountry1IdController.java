package com.tcs.hibernate_relationship_mapping_crud_operation.one_to_many_mapping_bi_directional.controller;

import com.tcs.hibernate_relationship_mapping_crud_operation.one_to_many_mapping_bi_directional.dao.Country1State1Dao;

public class DeleteCountry1IdController {
	
	public static void main(String[] args) {
		
		boolean b=new Country1State1Dao().deleteCountry1ByCountryIdDao(91);
		
		String msg=b?"deleted":"something went wrong";
		
		System.out.println(msg);
	}
}
