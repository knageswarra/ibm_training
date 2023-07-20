package com.example.demo.model;

public class Student {
	private String firstName;
	private String lastName;
	private int rollno;
	private String country;
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Student(String firstName, String lastName, int rollno,String country) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.rollno = rollno;
		this.country=country;
	}
	
	public Student() {
		
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	

}
