package com.tcs.hibernate_relationship_mapping_crud_operation.one_to_many_mapping.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;


@Entity
@Data
public class Country {
      
	@Id
	private int id;
	private String name;
	private String capitalName;
	
	@OneToMany
	List<State> sattes;
}
