package com.capgemini.lambda.client;

import java.util.Comparator;
import java.util.TreeSet;

import com.capgemini.lambda.model.Employee;

public class EmployeeClient {
	public static void main(String args[]) {
//		Comparator<Employee> c = new Comparator<Employee>() {
//			@Override
//			public int compare(Employee e1,Employee e2) {
//				return Integer.compare(e1.getEmployeeId(), e2.getEmployeeId());
//			}
//		};
		Comparator<Employee> c =(e1,e2)->Integer.compare(e1.getEmployeeId(), e2.getEmployeeId());
		
		TreeSet<Employee>employees = new TreeSet<>(c);
		
		employees.add(new Employee (101,"alex","hr",32000));
		employees.add(new Employee (102,"ali","admin",36000));
		employees.add(new Employee (103,"bunny","admin",42000));
		employees.add(new Employee (104,"drinchy","hr",72000));
		
		for(Employee employee:employees) {
			System.out.println(employee);
		}
	}

}
