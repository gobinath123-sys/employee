package com.onesoft.employees.Service;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onesoft.employees.Dao.EmployeesDao;
import com.onesoft.employees.Entity.Employees;

@Service
public class EmployeesService {
	@Autowired
	EmployeesDao empDao;

	public String addEmployees(List<Employees> e) {
		return empDao.addEmployees(e);
	}

	public List<Employees> getEmpName(String name) {
		return empDao.getEmpName(name);
	}

	public List<Employees> sortAsc() {
		return empDao.sortAsc();
	}

	public List<Employees> sortDes() {
		return empDao.sortDes();
	}

	public List<Integer> getMin() {
		return empDao.getMin();
	}

	public List<Integer> getMax() {
		return empDao.getMax();
	}

	public List<Employees> getMaximum() {
		return empDao.getMaximum();
	}

	public List<Employees> getMinimum() {
		return empDao.getMinimum();
	}

	public List<Employees> maxAge() {
		return empDao.maxAge();
	}

	public List<Employees> minAge() {
		return empDao.minAge();
	}

	public List<Employees> getmaxi() {
		return empDao.getmaxi();
	}

	public List<Employees> getmini() {
		return empDao.getmini();
	}

	public List<Employees> getrange(int salary1, int salary2) {
		return empDao.getrange(salary1, salary2);

	}

	public List<Employees> getAllsalary() {
		return empDao.getAllsalary();
	}

	public List<Employees> getsalaryrange(int a, int b) {
		List<Employees> getobj = empDao.getAllsalary();
		return getobj.stream().filter(x -> x.getSalary() >= a && x.getSalary() <= b).toList();

	}
	public List<Employees>addAllemp(){
		return empDao.addAllemp();
	}

}
