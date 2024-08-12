package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

//@Component("student1")
public class Student {
	private Samosa samosa;
	
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public void study() {
		this.samosa.getSamosa();
		System.out.println("Inside Student method.");
	}
}
