package com.service;

public class Student {

	int id;
	String name;
	double grade;
	Course c;
	
	public Student() {
		
	}
	public Student(int id, String name, double grade, Course c) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.c = c;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public Course getC() {
		return c;
	}
	public void setC(Course c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + ", c=" + c + "]";
	}
	
	
}
