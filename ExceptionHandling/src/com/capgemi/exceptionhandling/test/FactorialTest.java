package com.capgemi.exceptionhandling.test;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemi.exceptionhandling.main.Factorial;
import com.capgemi.exceptionhandling.name.FactorialException;
import com.capgemi.exceptionhandling.name.InvalidInputException;

public class FactorialTest {
	
	@Test(expected = InvalidInputException.class )
	public void testFactorialOfNumberLessthanTwo() throws InvalidInputException,FactorialException{
		Factorial fact = new Factorial();
		fact.getFactorial(0);
	}
	@Test(expected = InvalidInputException.class )
	public void testFactorialOfNumberExceedRange() throws InvalidInputException,FactorialException{
		Factorial fact = new Factorial();
		fact.getFactorial(15);
	}
	@Test
	public void testFactorialOfValidNumber() {
		Factorial fact = new Factorial();
		try {
			assertEquals(120, fact.getFactorial(5));
			
		}
		catch(FactorialException | InvalidInputException e) {
			e.printStackTrace();
		}
	}

	

}
