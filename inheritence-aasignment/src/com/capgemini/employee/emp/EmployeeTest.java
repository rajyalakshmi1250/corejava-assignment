package com.capgemini.employee.emp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;


import com.capgemini.employee.model.Employee;

public class EmployeeTest {
	Employee employee;
	@Before
    public void setUp() {
    	 employee = new Employee(101,"mouni",35000,5000);
    	
    }
	@Test
	public void testEmployeeObjectIsCreatedwithDefaultConstructor() {
		Employee employee = new Employee();
		assertNotNull(employee);
	}
	@Test
	public void testEmployeeObjectIsCreatedwithParameterizedConstructor() {
		Employee employee = new Employee(101,"mouni",35000,5000);
		assertNotNull(employee);
		assertEquals(101,employee.getEmployeeid());
		assertEquals("mouni",employee.getEmployeename());
		assertEquals(35000,employee.getBasicsalary(),0.01);
		assertEquals(5000,employee.getMedical(),0.01);
		
	}
	@Test
	public void testCalculateForGrossSalary() {
		assertEquals(57500,employee.grossSalary(),0.01);
	}
	@Test
	public void testCalculateForNetSalarty() {
		assertEquals(53100,employee.netsalary(),0.01);
		
	}
	 
}
