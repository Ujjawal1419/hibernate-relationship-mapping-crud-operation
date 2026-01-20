package com.tcs.hibernate_relationship_mapping_crud_operation.one_to_one_mapping.controller;

import java.time.LocalDate;

import com.tcs.hibernate_relationship_mapping_crud_operation.one_to_one_mapping.dao.PersonAdharDao;
import com.tcs.hibernate_relationship_mapping_crud_operation.one_to_one_mapping.entity.Adhar;
import com.tcs.hibernate_relationship_mapping_crud_operation.one_to_one_mapping.entity.Person;

public class InsertPersonAdharController {
	public static void main(String[] args) {

		Adhar adhar = new Adhar();
		
		adhar.setAdharNo(584586858546l);
		adhar.setDob(LocalDate.parse("1987-10-15"));
		adhar.setAddress("noida sector 18");
		adhar.setFatherName("Raghunath pd Yadav");

		Person person = new Person();
		
		person.setId(01);
		person.setName("Ujjawal kumar");
		person.setEmail("ujjawal1422@gmail.com");
		person.setPhone(9546224316l);
		person.setAdhar(adhar);

		new PersonAdharDao().savePersonAdharDao(person, adhar);

	}
}
