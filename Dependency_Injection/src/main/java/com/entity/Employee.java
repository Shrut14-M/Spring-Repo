package com.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Employee {
	@Value("121")
	private int Emp_id;
	@Value("Meghna")
	private String name;
	@Value("Mumbai")
	private String city;
	@Value("24")
	private int age;

	@Autowired
	private Country c;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int emp_id, String name, String city, int age, Country c) {
		super();
		Emp_id = emp_id;
		this.name = name;
		this.city = city;
		this.age = age;
		this.c = c;
	}

	public int getEmp_id() {
		return Emp_id;
	}

	public void setEmp_id(int emp_id) {
		Emp_id = emp_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Country getC() {
		return c;
	}

	public void setC(Country c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Employee [Emp_id=" + Emp_id + ", name=" + name + ", city=" + city + ", age=" + age + ", c=" + c + "]";
	}

}
