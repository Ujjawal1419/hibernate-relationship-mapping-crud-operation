package com.tcs.hibernate_relationship_mapping_crud_operation.one_to_one_mapping.controller;

import com.tcs.hibernate_relationship_mapping_crud_operation.one_to_one_mapping.dao.PersonAdharDao;
import com.tcs.hibernate_relationship_mapping_crud_operation.one_to_one_mapping.entity.Adhar;
import com.tcs.hibernate_relationship_mapping_crud_operation.one_to_one_mapping.entity.Person;

public class InsertPersonAdharController {
	public static void main(String[] args) {

		Adhar adhar = new Adhar();

		Person person = new Person();

		new PersonAdharDao().savePersonAdharDao(null, null);

	}
}
