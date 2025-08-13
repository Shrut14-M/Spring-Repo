package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.configure.ConfigureClass;
import com.entity.Employee;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigureClass.class);
		Employee e = context.getBean(Employee.class);
		System.out.println(e);
	}
}
