package com.tcs.hibernate_relationship_mapping_crud_operation.one_to_many_mapping_bi_directional.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

 @Data
@Entity
public class Country1 {
   
	@Id
	private int id;
	private String name;
	private String capitalName;
	
	@OneToMany (cascade = CascadeType.PERSIST, mappedBy = "country",fetch = FetchType.EAGER)
	List<State1> states;
	
	
}
