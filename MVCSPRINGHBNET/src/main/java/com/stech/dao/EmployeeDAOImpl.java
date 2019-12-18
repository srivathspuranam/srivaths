package com.stech.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.stech.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addEmployee(Employee employee) {
		sessionFactory.getCurrentSession().saveOrUpdate(employee);

	}

	@SuppressWarnings("unchecked")
	public List<Employee> getAllEmployees() {

		List<Employee> list = new ArrayList<Employee>();

		list = sessionFactory.getCurrentSession().createQuery("from Employee").list();

		return list;
	}

	public void deleteEmployee(Integer employeeId) {
		Employee employee = (Employee) sessionFactory.getCurrentSession().load(Employee.class, employeeId);
		if (null != employee) {
			this.sessionFactory.getCurrentSession().delete(employee);
		}

	}

	public Employee getEmployee(int empid) {
		return (Employee) sessionFactory.getCurrentSession().get(Employee.class, empid);
	}

	public Employee updateEmployee(Employee employee) {
		sessionFactory.getCurrentSession().update(employee);
		return employee;
	}
}
