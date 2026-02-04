package com.tcs.hibernate_relationship_mapping_crud_operation.one_to_one_mapping_bi_directional.controller;

import java.time.LocalDate;

import com.tcs.hibernate_relationship_mapping_crud_operation.one_to_one_mapping_bi_directional.dao.Person1Adhar1Dao;
import com.tcs.hibernate_relationship_mapping_crud_operation.one_to_one_mapping_bi_directional.entity.Adhar1;
import com.tcs.hibernate_relationship_mapping_crud_operation.one_to_one_mapping_bi_directional.entity.Person1;

public class InsertPerson1Adhar1Controller {
	
	public static void main(String[] args) {

		Adhar1 adhar = new Adhar1();
		
		adhar.setAdharNo(584587847872l);
		adhar.setDob(LocalDate.parse("1970-05-25"));
		adhar.setAddress("New Delhi");
		adhar.setFatherName("Raghunath yadav");

		Person1 person = new Person1();
		
		person.setId(03);
		person.setName("Ujjawal Kumar");
		person.setEmail("ujjawal1422@gmail.com");
		person.setPhone(9546224316l);
		person.setAdhar(adhar);
		adhar.setPerson(person);

		new Person1Adhar1Dao().savePerson1Adhar1Dao(person, adhar);
		
		System.out.println("Record Save");

	}

}
