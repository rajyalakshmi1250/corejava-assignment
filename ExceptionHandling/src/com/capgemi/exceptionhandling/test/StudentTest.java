package com.capgemi.exceptionhandling.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;

import com.capgemi.exceptionhandling.main.Student;
import com.capgemi.exceptionhandling.name.AgeNotWithinRangeException;
import com.capgemi.exceptionhandling.name.NameNotValidException;

public class StudentTest {
      Student student;
      @Before
      public void setUp() {
    	  student = new Student(50,"raji",22,"javacloud");
      	
      }
      @Test
  	public void testEmployeeObjectIsCreatedwithParameterizedConstructor() {
  		Student student = new Student(50,"raji",22,"javacloud");
  		assertNotNull(student);
  		assertEquals(50,student.getRollnum());
  		assertEquals("raji",student.getName());
  		assertEquals(22,student.getAge());
  		assertEquals("javacloud",student.getCourse());
  		
  	}
      @Test(expected = AgeNotWithinRangeException.class)
      public void testCheckAge() throws AgeNotWithinRangeException
      {
    	 student.testCheckAge(); 
      }
      @Test(expected = NameNotValidException.class)
      public void testName() throws NameNotValidException{
      Student student = new Student(50,"raji55",22,"javacloud");
      
    	 student.testName(); 
      }
}
 
