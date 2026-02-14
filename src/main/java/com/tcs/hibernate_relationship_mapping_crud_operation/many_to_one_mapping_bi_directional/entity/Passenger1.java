package com.tcs.hibernate_relationship_mapping_crud_operation.many_to_one_mapping_bi_directional.entity;

import com.tcs.hibernate_relationship_mapping_crud_operation.many_to_one_mapping.entity.Bus;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Passenger1 {

	@Id
	private int id;
	private String name;
	private String email;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Bus bus;
}
