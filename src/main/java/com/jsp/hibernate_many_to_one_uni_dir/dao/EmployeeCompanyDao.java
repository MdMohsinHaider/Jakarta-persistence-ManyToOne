package com.jsp.hibernate_many_to_one_uni_dir.dao;

import java.util.ArrayList;
import java.util.List;

import com.jsp.hibernate_many_to_one_uni_dir.entity.Company;
import com.jsp.hibernate_many_to_one_uni_dir.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class EmployeeCompanyDao {
	
	EntityManager em = Persistence.createEntityManagerFactory("hibernate-a5").createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public List<Employee> saveEmployeeCompanyDao(List<Employee> employees ,Company company) {		
		try {
			et.begin();
			em.persist(company);
			for (Employee employee : employees) {
				em.persist(employee);
			}
			et.commit();
			return employees;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	
	public Employee saveEmployeeWithAssociateWithCompanyDao(Employee employee, Company companyId) {
		try {
			Company company2 = em.find(Company.class,companyId);
			if (company2!= null) {
				try {
										
				} catch (Exception e) {
					System.out.println(e.getMessage());
					return null;
				}				
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

}
