package com.capg.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.capg.model.Employee;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {
	
	 @Autowired
	 private HibernateTemplate template;

	@Override
	public int create(Employee emp) {
		Integer result = (Integer)template.save(emp);
		System.out.println(emp.getId());
		return result;
	}

}
