package com.jdbcjpa.main;

import com.jdbcjpa.entities.Employee;
import com.jdbcjpa.services.EmployeeServices;

public class MainRunner {

	public static void main(String[] args) {
		
		Employee newEmp = new Employee(11, "Hank", "Hil", "hankythetanky@gmail.com");
		
		createEmployee(newEmp);
		
	}

	private static void createEmployee(Employee e) {
		EmployeeServices emp = new EmployeeServices();
		emp.createEmployee(e);
	}

}
