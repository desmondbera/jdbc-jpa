package com.jdbcjpa.services;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jdbcjpa.entities.Employee;

public class EmployeeServices {
	
	public void createEmployee(Employee newEmployee) {
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("jpdc-jpa");
		EntityManager entityManager = entitymanagerfactory.createEntityManager();
		
		// DML /DDL  uses begin()
		entityManager.getTransaction().begin();
		entityManager.persist(newEmployee);
		// if we don't commit, data will never be in database. If we don't commit then we can't persist data
		entityManager.getTransaction().commit();		
		entityManager.close();
		entitymanagerfactory.close();
	}
	
}
