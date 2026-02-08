package com.tcs.hibernate_relationship_mapping_crud_operation.many_to_many_mapping_bi_directional.dao;

import java.util.List;

import com.tcs.hibernate_relationship_mapping_crud_operation.many_to_many_mapping_bi_directional.entity.Student1;
import com.tcs.hibernate_relationship_mapping_crud_operation.many_to_many_mapping_bi_directional.entity.Trainer1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Trainer1Student1Dao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-mapping");
	EntityManager em = null;
	EntityTransaction et = null;

	public List<Trainer1> saveTrainers1Students1Dao(List<Trainer1> trainers, List<Student1> students) {
		em = emf.createEntityManager();
		et = em.getTransaction();

		if (em == null || et == null || trainers.isEmpty() || students.isEmpty()) {
			return null;
		}

		try {
			et.begin();

			students.forEach(em::persist);

			trainers.forEach(em::persist);

			et.commit();

			return trainers;

		} catch (Exception e) {
			if (et.isActive()) {
				et.rollback();
			}
			e.printStackTrace();
			return null;
		} finally {
			if (em.isOpen()) {
				em.close();
			}
		}
	}

}
