package com.tcs.hibernate_relationship_mapping_crud_operation.one_to_one_mapping_bi_directional.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Adhar1 {
	
	@Id
	private long adharNo;
	private LocalDate dob;
	private String fatherName;
	private String address;

	@OneToOne(mappedBy = "adhar")
	@JoinColumn(name="p-Id")
	private Person1 person;
}
