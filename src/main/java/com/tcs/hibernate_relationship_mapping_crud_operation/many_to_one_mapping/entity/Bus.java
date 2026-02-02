package com.tcs.hibernate_relationship_mapping_crud_operation.many_to_one_mapping.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Bus {
	@Id
	private int id;
	private String name;
	private int seat;

}
