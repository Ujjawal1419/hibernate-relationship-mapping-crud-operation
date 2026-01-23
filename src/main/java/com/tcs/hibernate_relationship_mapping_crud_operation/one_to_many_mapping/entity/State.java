package com.tcs.hibernate_relationship_mapping_crud_operation.one_to_many_mapping.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class State {
	@Id
	private int id;
	private String name;
	private String capitalName;

}
