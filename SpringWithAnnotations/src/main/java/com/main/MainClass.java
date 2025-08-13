package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.configure.ConfigureClass;
import com.entity.Student;


public class MainClass {
public static void main(String[] args) {
  ApplicationContext context = new AnnotationConfigApplicationContext(ConfigureClass.class);
  Student s = context.getBean(Student.class);
  System.out.println(s);
  
 
  
}
}
