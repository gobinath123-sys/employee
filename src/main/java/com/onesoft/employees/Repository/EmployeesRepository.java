package com.onesoft.employees.Repository;

import java.util.List;  

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.onesoft.employees.Entity.Employees;

public interface EmployeesRepository extends JpaRepository<Employees, Integer> {
	@Query(value = "select*from employees where name like ?", nativeQuery = true)
	public List<Employees> getEmpName(String name);

	@Query(value = "select*from employees order by name asc", nativeQuery = true)
	public List<Employees> sortAsc();

	@Query(value = "select*from employees order by name desc", nativeQuery = true)
	public List<Employees> sortDes();

	@Query(value = "select min(salary) as minsalary from employees", nativeQuery = true)
	public List<Integer> getMin();

	@Query(value = "select max(salary) as maxsalary from employees", nativeQuery = true)
	public List<Integer> getMax();

	@Query(value = "select * from employees where salary = (select max(salary) from employees)", nativeQuery = true)
	public List<Employees> getMaximum();

	@Query(value = "select * from employees where salary = (select min(salary) from employees)", nativeQuery = true)
	public List<Employees> getMinimum();

	@Query(value = "select * from employees where age = (select max(age) from employees)", nativeQuery = true)
	public List<Employees> maxAge();

	@Query(value = "select * from employees where age = (select min(age) from employees)", nativeQuery = true)
	public List<Employees> minAge();

	@Query(value = "select * from employees where salary = (select max(salary) from employees where salary<(select max(salary) from employees))", nativeQuery = true)
	public List<Employees> getMaxi();

	@Query(value = "select * from employees where salary = (select min(salary) from employees where salary>(select min(salary) from employees))", nativeQuery = true)
	public List<Employees> getMini();

	@Query(value = "select * from employees where salary>=? and salary< = ?", nativeQuery = true)
	public List<Employees> getrange(int salary1, int salary2);

	@Query(value = "select *from employees where salary", nativeQuery = true)
	public List<Employees> getAllsalary();
}
