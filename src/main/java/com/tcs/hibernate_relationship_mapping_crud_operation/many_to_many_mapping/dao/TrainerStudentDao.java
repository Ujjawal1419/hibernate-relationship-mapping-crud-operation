package com.tcs.hibernate_relationship_mapping_crud_operation.many_to_many_mapping.dao;

import java.util.List;

import com.tcs.hibernate_relationship_mapping_crud_operation.many_to_many_mapping.entity.Student;
import com.tcs.hibernate_relationship_mapping_crud_operation.many_to_many_mapping.entity.Trainer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class TrainerStudentDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-mapping");
	EntityManager em = null;
	EntityTransaction et = null;

	public List<Trainer> saveTrainersStudentsDao(List<Trainer> trainers, List<Student> students) {

		em = emf.createEntityManager();
		et = em.getTransaction();

		if (em == null || et == null || trainers.isEmpty() || students.isEmpty()) {
			return null;
		}

		try {

			et.begin();

			students.forEach(em::persist);

			for (Student student : students) {
				em.persist(student);
			}

			for (Trainer trainer : trainers) {
				em.persist(trainer);
			}

			et.commit();

			return trainers;

		} catch (Exception e) {
			if (et.isActive()) {
				et.rollback();
			}
			e.printStackTrace();

			return null;
		}finally {
			if(em.isOpen()) {
				em.close();
			}
		}
	}

}
