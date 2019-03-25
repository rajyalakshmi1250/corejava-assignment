package com.capgemini.main;

import java.util.Objects;

public class Student implements Comparable<Student> {
	private String name;
	private int rollno;
	private String branch;
	public Student() {
		super();
		
	}
	public Student(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.branch = branch;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name,rollno);
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(!(obj instanceof Student))
			return false;
		if(this==obj)
			return true;
		Student student = (Student) obj;
		if(this.name.equals(student.name) && this.rollno==student.rollno )
			return true;
		else
			return false;
		
		}
	public int compareTo(Student student) {
		return this.name.compareTo(student.name);
	
			
	}

}
