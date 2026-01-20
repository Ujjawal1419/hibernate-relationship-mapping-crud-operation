
package com.tcs.hibernate_relationship_mapping_crud_operation.one_to_one_mapping.controller;

import com.tcs.hibernate_relationship_mapping_crud_operation.one_to_one_mapping.dao.PersonAdharDao;
import com.tcs.hibernate_relationship_mapping_crud_operation.one_to_one_mapping.entity.Adhar;
import com.tcs.hibernate_relationship_mapping_crud_operation.one_to_one_mapping.entity.Person;

public class GetPersonAdharByPersonIdController {
	
	public static void main(String[] args) {
		Person person=new PersonAdharDao().getPersonAndAdharByPersonIdDao(1);
		
		if(person!=null) {
			System.out.println(person.getName());
			Adhar adhar=person.getAdhar();
			
			if(adhar!=null) {
				System.out.println(adhar.getAddress());
			}else{
				System.out.println("this person doesn't have adhar");
			}
		}else {
	
		System.out.println("person id ius not found...");
		}
	}

}
