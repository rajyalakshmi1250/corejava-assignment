package com.capgemi.exceptionhandling.main;

import com.capgemi.exceptionhandling.name.AgeNotWithinRangeException;
import com.capgemi.exceptionhandling.name.NameNotValidException;
import com.sun.org.apache.xerces.internal.impl.xs.identity.Selector.Matcher;

public class Student {
	private int rollnum;
	private String name;
	private int age;
	private String course;
	public Student() {
		super();
		
	}
	public Student(int rollnum, String name, int age, String course) {
		super();
		this.rollnum = rollnum;
		this.name = name;
		this.age = age;
		this.course = course;
	}
	public int getRollnum() {
		return rollnum;
	}
	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public void testCheckAge() throws AgeNotWithinRangeException{
		if(this.age >=15 && this.age<=21) {
			System.out.println("valid age");
		}
		else
			throw new AgeNotWithinRangeException("age is limit");
	}
	public void testName() throws NameNotValidException {

	    if(!(name.matches("^[a-zA-Z]*$")))
	    {
	    	throw new  NameNotValidException("name in range");
	    }

	}
	
}
	


