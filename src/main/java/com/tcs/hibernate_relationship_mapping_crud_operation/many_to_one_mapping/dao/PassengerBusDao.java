package com.tcs.hibernate_relationship_mapping_crud_operation.many_to_one_mapping.dao;

import java.util.List;

import com.tcs.hibernate_relationship_mapping_crud_operation.many_to_one_mapping.entity.Bus;
import com.tcs.hibernate_relationship_mapping_crud_operation.many_to_one_mapping.entity.Passenger;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class PassengerBusDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-mapping");

	EntityManager em = null;

	EntityTransaction et = null;

	public List<Passenger> savePassengerBusDao(List<Passenger> passengers, Bus bus) {
		em = emf.createEntityManager();

		et = em.getTransaction();

		if (!passengers.isEmpty() && bus != null) {
			et.begin();

//			em.persist(bus);

			for (Passenger passenger : passengers) {

				em.persist(passenger);
			}

			et.commit();

			return passengers;
		}
		return null;
	}

	public boolean savePassengerAndAssociateWithBusDao(int busId, List<Passenger> passenger) {

		em = emf.createEntityManager();

		et = em.getTransaction();

		try {
			Bus bus = em.find(Bus.class, busId);

			if (bus != null) {

				et.begin();

				for (Passenger passenger1 : passenger) {

					passenger1.setBus(bus);

					em.persist(passenger1);
				}

				et.commit();

				return true;

			}
			return false;
		} catch (Exception e) {
			if (et != null && et.isActive()) {
				et.rollback();
			}
			return false;
		} finally {
			if (em != null && em.isOpen()) {
				em.close();
			}
		}

	}

}
