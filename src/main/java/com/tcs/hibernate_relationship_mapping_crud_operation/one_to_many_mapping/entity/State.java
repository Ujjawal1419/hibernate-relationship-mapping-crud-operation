package com.tcs.hibernate_relationship_mapping_crud_operation.one_to_many_mapping.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class State {
	@Id
	private int id;
	//@Column(name="statename",nullable=false,length=25,unique=true,updatable=false)
	private String name;
	private String capitalName;

}
