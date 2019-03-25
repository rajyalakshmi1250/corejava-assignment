package com.capgemi.exceptionhandling.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import com.capgemi.exceptionhandling.main.Date;
import com.capgemi.exceptionhandling.name.InvalidDayException;
import com.capgemi.exceptionhandling.name.InvalidMonthException;

public class Datetest {
	@Test
	public void testtoCheckObjectIsUsingDefaultConstructor() {
		Date date = new Date();
		assertNotNull(date);
	}
	
	@Test
	public void testToCheckDayIsValid() throws InvalidDayException, InvalidMonthException {
		Date date =new Date(25,12,1997);
	}
	
	@Test(expected=InvalidDayException.class)
	public void testToCheckDayIsNotValid() throws InvalidDayException, InvalidMonthException {
		Date date =new Date(32,12,1997);
	}
	
	@Test
	public void testToCheckMonthIsValid() throws InvalidDayException, InvalidMonthException {
		Date date =new Date(25,12,1997);
	}
	
	@Test(expected=InvalidMonthException.class)
	public void testToCheckMonthIsNotValid() throws InvalidDayException, InvalidMonthException {
		Date date =new Date(25,14,1997);
	}

}
