package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Employee;

public class MainClass {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
	Employee e= context.getBean(Employee.class);
//	e.setEmp_id(101);
//	e.setName("rida");
//	e.setSalary("12LPA");
	System.out.println(e);
}
}
