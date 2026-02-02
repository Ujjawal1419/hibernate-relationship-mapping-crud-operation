package com.tcs.hibernate_relationship_mapping_crud_operation.many_to_many_mapping.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.tcs.hibernate_relationship_mapping_crud_operation.many_to_many_mapping.dao.TrainerStudentDao;
import com.tcs.hibernate_relationship_mapping_crud_operation.many_to_many_mapping.entity.Student;
import com.tcs.hibernate_relationship_mapping_crud_operation.many_to_many_mapping.entity.Trainer;

public class InsertStudentController {
	public static void main(String[] args) {
		
		Student student1= new Student();
		
		student1.setName("Rahil");
		student1.setEmail("rahil@gamil.com");
		
		Student student2= new Student();
		student2.setName("Rohit");
		student2.setEmail("rohit@gmail.com");
		
		List<Student> students=new ArrayList<Student>(Arrays.asList(student1,student2));
		
		Trainer trainer1=new Trainer();
		trainer1.setName("Jugendra");
		trainer1.setEmail("jugendra@gmail.com");
		trainer1.setExperience(6);
		trainer1.setStudent(students);
		
		Trainer trainer2= new Trainer();
		trainer2.setName("Mohan");
	    trainer2.setEmail("mohan@gmail.com");
	    trainer2.setExperience(4);
	    trainer2.setStudent(students);
	    
	    List<Trainer> trainers=new ArrayList<Trainer>(Arrays.asList(trainer1,trainer2));
	    List<Trainer> trainerdb=new TrainerStudentDao().saveTrainersStudentsDao(trainers, students);
	}

}
