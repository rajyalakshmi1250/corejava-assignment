package com.capgemini.lambda.model;

import java.util.Objects;


public class Employee {
 private int employeeId;
private String employeeName;
private String employeedepartment;
private double employeesalary;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int employeeId, String employeeName, String employeedepartment, double employeesalary) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.employeedepartment = employeedepartment;
	this.employeesalary = employeesalary;
}
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public String getEmployeedepartment() {
	return employeedepartment;
}
public void setEmployeedepartment(String employeedepartment) {
	this.employeedepartment = employeedepartment;
}
public double getEmployeesalary() {
	return employeesalary;
}
public void setEmployeesalary(double employeesalary) {
	this.employeesalary = employeesalary;
}
@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeedepartment="
			+ employeedepartment + ", employeesalary=" + employeesalary + "]";
}
@Override
public boolean equals(Object obj) {
	if(obj==null)
		return false;
	if(!(obj instanceof Employee))
		return false;
	if(this==obj)
		return true;
	Employee employee = (Employee) obj;
	if(this.employeeId==employee.employeeId && this.employeeName==employee.employeeName) 
			return true;
	else
		return false;
		
}
@Override
public int hashCode() {
	return Objects.hash(employeeId,employeeName);
}
 
 
}
