package com.tcs.hibernate_relationship_mapping_crud_operation.many_to_one_mapping.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Passenger {
	@Id
	private int id;
	private String name;
	private String email;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Bus bus;

}
