package com.entity;



public class Student {
private String S_name;
private int age;
private String department;
private Book book;


public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public Student(String s_name, int age, String department, Book book) {
	super();
	S_name = s_name;
	this.age = age;
	this.department = department;
	this.book = book;
}

public String getS_name() {
	return S_name;
}

public void setS_name(String s_name) {
	S_name = s_name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;
}

public Book getBook() {
	return book;
}

public void setBook(Book book) {
	this.book = book;
}

@Override
public String toString() {
	return "Student [S_name=" + S_name + ", age=" + age + ", department=" + department + ", book=" + book + "]";
}



}
