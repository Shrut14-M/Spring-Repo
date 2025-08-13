package com.entity;

import org.springframework.stereotype.Component;

@Component
public class Country {
	private String C_Name;
	private int C_id;

	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Country(String c_Name, int c_id) {
		super();
		C_Name = c_Name;
		C_id = c_id;
	}

	public String getC_Name() {
		return C_Name;
	}

	public void setC_Name(String c_Name) {
		C_Name = c_Name;
	}

	public int getC_id() {
		return C_id;
	}

	public void setC_id(int c_id) {
		C_id = c_id;
	}

	@Override
	public String toString() {
		return "Country [C_Name=" + C_Name + ", C_id=" + C_id + "]";
	}

}
