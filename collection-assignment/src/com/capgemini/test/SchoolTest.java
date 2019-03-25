package com.capgemini.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.main.School;

public class SchoolTest {
	private School siddhartha;
	private School gowtham ;
	private School vishwabhrathi;
	@Before
	public void setUp(){
		siddhartha = new School("siddhartha","eluru","westgodavari",3);
		gowtham = new School("gowtham","vijayawada","krishna",2);
		vishwabhrathi = new School("vishwabhrathi","krishna","yes",1);
	}
	@Test
	public void testSchoolAcceptingDuplicateValues() {
		ArrayList<School> school= new ArrayList<>();
		school.add(siddhartha);
		school.add(gowtham);
		school.add(vishwabhrathi);
		school.add(siddhartha);
		
		Iterator<School> it=school.iterator();
		
		assertEquals(siddhartha,it.next());
		assertEquals(gowtham, it.next());
		assertEquals(vishwabhrathi, it.next());	
	}
	@Test
	public void testTelevisionNotAcceptingDuplicateValues() {
		HashSet<School> school= new HashSet<>();
		school.add(siddhartha);
		school.add(gowtham);
		school.add(vishwabhrathi);
		
	    assertEquals(3,school.size());
	}
}
