package com.capgemini.marketingexecutive.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.marketingexecutive.model.MarketingExecutive;

class MarketingExecutiveTest {
	MarketingExecutive employee;
	
	@BeforeEach
	public void setUp() {
		employee = new MarketingExecutive(351, "naina", 35000, 5000, 30);
		
	}
	@Test
	public void testGrossSalaryOfMarketingExecutive() {
		assertEquals(1650,employee.grossSalary(),0.01);
	}
	@Test
	public void testNetSalaryOfMarketingExecutive1() {
		assertEquals(1450,employee.netSalary(),0.01);
	}

}