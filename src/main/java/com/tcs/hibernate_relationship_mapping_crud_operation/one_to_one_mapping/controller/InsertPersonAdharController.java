package com.tcs.hibernate_relationship_mapping_crud_operation.one_to_one_mapping.controller;

import java.time.LocalDate;

import com.tcs.hibernate_relationship_mapping_crud_operation.one_to_one_mapping.dao.PersonAdharDao;
import com.tcs.hibernate_relationship_mapping_crud_operation.one_to_one_mapping.entity.Adhar;
import com.tcs.hibernate_relationship_mapping_crud_operation.one_to_one_mapping.entity.Person;

public class InsertPersonAdharController {
	public static void main(String[] args) {

		Adhar adhar = new Adhar();
		
		adhar.setAdharNo(584587847872l);
		adhar.setDob(LocalDate.parse("1970-05-25"));
		adhar.setAddress("New Delhi");
		adhar.setFatherName("Raju");

		Person person = new Person();
		
		person.setId(03);
		person.setName("Pappu kumar");
		person.setEmail("pappu1422@gmail.com");
		person.setPhone(8521626228l);
		person.setAdhar(adhar);

		new PersonAdharDao().savePersonAdharDao(person, adhar);

	}
}
