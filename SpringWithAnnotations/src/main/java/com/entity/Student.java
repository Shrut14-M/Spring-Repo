package com.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("12")
	private int Stud_id;
	@Value("shruti")
	private String name;
	@Value("21")
	private int age;
	@Value("Pune")
	private String city;
	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStud_id() {
		return Stud_id;
	}

	public void setStud_id(int stud_id) {
		Stud_id = stud_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [Stud_id=" + Stud_id + ", name=" + name + ", age=" + age + ", city=" + city + "]";
	}

	public Student(int stud_id, String name, int age, String city) {
		super();
		Stud_id = stud_id;
		this.name = name;
		this.age = age;
		this.city = city;
	}

	

}
