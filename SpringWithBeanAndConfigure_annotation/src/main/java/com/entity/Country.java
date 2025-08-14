package com.entity;

import org.springframework.beans.factory.annotation.Value;
public class Country {
	@Value("India")
	private String c_name;
	@Value("+91")
	private String c_id;

	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Country(String c_name, String c_id) {
		super();
		this.c_name = c_name;
		this.c_id = c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String getC_id() {
		return c_id;
	}

	public void setC_id(String c_id) {
		this.c_id = c_id;
	}

	@Override
	public String toString() {
		return "Country [c_name=" + c_name + ", c_id=" + c_id + "]";
	}

}
