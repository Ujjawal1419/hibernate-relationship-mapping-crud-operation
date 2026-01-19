package com.tcs.hibernate_relationship_mapping_crud_operation.one_to_one_mapping.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Adhar {
	private long adharNo;
	private LocalDate dob;
	private String fatherName;
	private String address;

}
