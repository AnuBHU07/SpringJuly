package com.spring.jdbc.entities;

public class Student {
	private int id;
	private String stdName;
	private String city;
	
	public Student() {}

	public Student(int id, String stdName, String city) {
		super();
		this.id = id;
		this.stdName = stdName;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", stdName=" + stdName + ", city=" + city + "]";
	}
	
}
