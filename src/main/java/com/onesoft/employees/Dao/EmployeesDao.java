package com.onesoft.employees.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.onesoft.employees.Entity.Employees;
import com.onesoft.employees.Repository.EmployeesRepository;

@Repository

public class EmployeesDao {
	@Autowired
	EmployeesRepository empRepo;

	public String addEmployees(List<Employees> e) {
		empRepo.saveAll(e);
		return "Successfully save";
	}

	public List<Employees> getEmpName(String name) {
		return empRepo.getEmpName(name);
	}

	public List<Employees> sortAsc() {
		return empRepo.sortAsc();
	}

	public List<Employees> sortDes() {
		return empRepo.sortDes();
	}

	public List<Integer> getMin() {
		return empRepo.getMin();
	}

	public List<Integer> getMax() {
		return empRepo.getMax();
	}

	public List<Employees> getMaximum() {
		return empRepo.getMaximum();
	}

	public List<Employees> getMinimum() {
		return empRepo.getMinimum();
	}

	public List<Employees> maxAge() {
		return empRepo.maxAge();
	}

	public List<Employees> minAge() {
		return empRepo.minAge();
	}

	public List<Employees> getmaxi() {
		return empRepo.getMaxi();
	}

	public List<Employees> getmini() {
		return empRepo.getMini();
	}

	public List<Employees> getrange(int salary1, int salary2) {
		return empRepo.getrange(salary1, salary2);
	}

	public List<Employees> getAllsalary() {
		return empRepo.getAllsalary();
	}
	public List<Employees>addAllemp(){
		return empRepo.findAll();
	}

	public String getname(int id) {
		return empRepo.getbyname(id);
	}
}
