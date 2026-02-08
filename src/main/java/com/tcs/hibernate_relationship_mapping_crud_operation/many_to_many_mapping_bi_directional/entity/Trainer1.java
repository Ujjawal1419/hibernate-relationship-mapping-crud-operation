package com.tcs.hibernate_relationship_mapping_crud_operation.many_to_many_mapping_bi_directional.entity;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Trainer1 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private int experience;
	
	@CreationTimestamp
	private LocalDateTime registerDateTime;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	private List<Student1> students;
}
