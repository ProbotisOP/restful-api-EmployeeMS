package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.repository.EmployeRepo;

@Service
public class EmployeeService {

	@Autowired
	EmployeRepo erepo;

	public List<Employee> showall() {
		return erepo.findAll();
	}

	public void addEmp(Employee emp) {
		erepo.save(emp);
	}
	
	public void modifyEmp(Employee emp) {
		erepo.save(emp);
	}

	public void deleteEmp(int id) {
		erepo.deleteById(id);
	}

	public Employee showbyID(int id) {
		return erepo.findById(id).get();
	}
	public int count() {
		return (int) erepo.count();
	}

}
