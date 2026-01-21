package com.tcs.hibernate_relationship_mapping_crud_operation.one_to_one_mapping.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Person {
	@Id
	private int id;
	private String name;
	private String email;
	private long phone;
	
	@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	private Adhar adhar;

}
