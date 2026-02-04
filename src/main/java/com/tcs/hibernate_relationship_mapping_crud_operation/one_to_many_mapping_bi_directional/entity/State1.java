package com.tcs.hibernate_relationship_mapping_crud_operation.one_to_many_mapping_bi_directional.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
//@Table(name = "mystate")
public class State1 {
      
	
	@Id
	private int id;
	@Column(name="statename",nullable=false,length=25,unique=true ,updatable = false)
	private String name;
	private String capitalName;
	
	@ManyToOne
	private Country1 country;
}
