package com.tcs.hibernate_relationship_mapping_crud_operation.one_to_many_mapping.controller;

import com.tcs.hibernate_relationship_mapping_crud_operation.one_to_many_mapping.dao.CountryStateDao;

public class DeleteStateByIdController {
	
	public static void main(String[] args) {
		
		boolean b=new CountryStateDao().deleteStateByStateIdDao(102);
		
		String msg=b?"deleted":"something went wrong";
		
		System.out.println(msg);
	}

}
