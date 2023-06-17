package com.onesoft.employees;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.onesoft.employees.Controler.EmployeesControler;

@SpringBootTest
class EmployeesApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	EmployeesControler ec;
	@Before
	public void display() {
		System.out.println("Hello");
	}
	@Test
	public void testgetAll() {
		System.out.println(ec.getMax());
	}

}
