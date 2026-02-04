package com.tcs.hibernate_relationship_mapping_crud_operation.one_to_one_mapping_bi_directional.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;


@Data
@Entity
public class Person1 {
	
	
	@Id
	private int id;
	private String name;
	private String email;
	private long phone;
	
	@OneToOne(cascade = {CascadeType.PERSIST})
	private Adhar1 adhar;

}
