package com.tcs.hibernate_relationship_mapping_crud_operation.many_to_many_mapping_bi_directional.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.tcs.hibernate_relationship_mapping_crud_operation.many_to_many_mapping_bi_directional.dao.Trainer1Student1Dao;
import com.tcs.hibernate_relationship_mapping_crud_operation.many_to_many_mapping_bi_directional.entity.Student1;
import com.tcs.hibernate_relationship_mapping_crud_operation.many_to_many_mapping_bi_directional.entity.Trainer1;

public class InsertTariner1Student1Controller {

	public static void main(String[] args) {
		Student1 student1=new Student1();
		
		student1.setName("Rahil");
		student1.setEmail("rahil@gmail.com");

		Student1 student2 = new Student1();

		student2.setName("Rohit");
		student2.setEmail("rohit@gmail.com");
		
		List<Student1> students = new ArrayList<Student1>(Arrays.asList(student1,student2));
		
		Trainer1 trainer1 = new Trainer1();
		trainer1.setName("Jugendra");
		trainer1.setEmail("jugendra@yahoo.in");
		trainer1.setExperience(6);
		trainer1.setStudents(students);
		
		Trainer1 trainer2 = new Trainer1();
		trainer2.setName("Mohan");
		trainer2.setEmail("mohanyadav@yahoo.in");
		trainer2.setExperience(4);
		trainer2.setStudents(students);
		
		List<Trainer1> trainers = new ArrayList<Trainer1>(Arrays.asList(trainer1,trainer2));
		
		List<Trainer1> trainerdb = new Trainer1Student1Dao().saveTrainers1Students1Dao(trainers, students);
		
		System.out.println("Trainer and Student Data saved");
	}
}
