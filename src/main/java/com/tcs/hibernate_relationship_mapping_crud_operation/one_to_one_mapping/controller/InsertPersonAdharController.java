package com.tcs.hibernate_relationship_mapping_crud_operation.one_to_one_mapping.controller;

import java.time.LocalDate;

import com.tcs.hibernate_relationship_mapping_crud_operation.one_to_one_mapping.dao.PersonAdharDao;
import com.tcs.hibernate_relationship_mapping_crud_operation.one_to_one_mapping.entity.Adhar;
import com.tcs.hibernate_relationship_mapping_crud_operation.one_to_one_mapping.entity.Person;

public class InsertPersonAdharController {
	public static void main(String[] args) {

		Adhar adhar = new Adhar();
		
		adhar.setAdharNo(586586858546l);
		adhar.setDob(LocalDate.parse("1985-10-15"));
		adhar.setAddress("noida sector 18");
		adhar.setFatherName("Raghunath pd Yadav");

		Person person = new Person();
		
		person.setId(02);
		person.setName("Ankit kumar");
		person.setEmail("ankit1422@gmail.com");
		person.setPhone(9546224317l);
		person.setAdhar(adhar);

		new PersonAdharDao().savePersonAdharDao(person, adhar);

	}
}
