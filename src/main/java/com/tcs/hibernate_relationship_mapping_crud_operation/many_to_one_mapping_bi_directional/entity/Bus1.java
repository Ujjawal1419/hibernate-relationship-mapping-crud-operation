package com.tcs.hibernate_relationship_mapping_crud_operation.many_to_one_mapping_bi_directional.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Bus1 {

	@Id
	private int id;
	private String name;
	private int seat;
}
