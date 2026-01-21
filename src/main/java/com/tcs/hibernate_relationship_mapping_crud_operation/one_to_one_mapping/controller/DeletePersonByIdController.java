package com.tcs.hibernate_relationship_mapping_crud_operation.one_to_one_mapping.controller;

import com.tcs.hibernate_relationship_mapping_crud_operation.one_to_one_mapping.dao.PersonAdharDao;

public class DeletePersonByIdController {
	public static void main(String[] args) {
		new PersonAdharDao().deletePersonByPersonIdDao(02);
	}

}
