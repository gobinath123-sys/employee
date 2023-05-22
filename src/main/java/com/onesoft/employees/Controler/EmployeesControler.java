package com.onesoft.employees.Controler;

import java.util.List;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onesoft.employees.Entity.Employees;
import com.onesoft.employees.Service.EmployeesService;

@RestController

public class EmployeesControler {
	@Autowired
	EmployeesService empSer;

	@PostMapping(value = "/addemp")
	public String addEmployees(@RequestBody List<Employees> e) {
		return empSer.addEmployees(e);
	}

	@GetMapping(value = "/getname/{name}")
	public List<Employees> getEmpName(@PathVariable String name) {
		return empSer.getEmpName(name);
	}

	@GetMapping(value = "/getsortasc")
	public List<Employees> sortAsc() {
		return empSer.sortAsc();
	}

	@GetMapping(value = "/getsortdes")
	public List<Employees> sortDes() {
		return empSer.sortDes();
	}

	@GetMapping(value = "/getmin")
	public List<Integer> getMin() {
		return empSer.getMin();
	}

	@GetMapping(value = "/getMax")
	public List<Integer> getMax() {
		return empSer.getMax();
	}

	@GetMapping(value = "/getMaximum")
	public List<Employees> getMaximum() {
		return empSer.getMaximum();
	}

	@GetMapping(value = "/getminimum")
	public List<Employees> getMinimum() {
		return empSer.getMinimum();
	}

	@GetMapping(value = "/maxage")
	public List<Employees> maxAge() {
		return empSer.maxAge();
	}

	@GetMapping(value = "/minage")
	public List<Employees> minAge() {
		return empSer.minAge();
	}

	@GetMapping(value = "/secmax")
	public List<Employees> getmaxi() {
		return empSer.getmaxi();
	}

	@GetMapping(value = "/getmini")
	public List<Employees> getmini() {
		return empSer.getmini();
	}

	@GetMapping(value = "/range/{salary1}/{salary2}")
	public List<Employees> getrange(@PathVariable int salary1, @PathVariable int salary2) {
		return empSer.getrange(salary1, salary2);
	}

	@GetMapping(value = "/salary")
	public List<Employees> getAllsalary() {
		return empSer.getAllsalary();
	}

	@GetMapping(value = "/range1/{a}/{b}")
	public List<Employees> getsalaryrange(@PathVariable int a, @PathVariable int b) {
		return empSer.getsalaryrange(a, b);
	}
	@GetMapping(value="/addAllemp")
	public List<Employees>addAllemp(){
		return empSer.addAllemp();
	}

}
