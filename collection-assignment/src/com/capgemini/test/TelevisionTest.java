package com.capgemini.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.main.Television;

public class TelevisionTest {
	private Television samsung;
	private Television lg;
	private Television sony;
	@Before
	public void setUp(){
		samsung = new Television("samsung","lcd","no",20000);
		lg = new Television("lg","led","yes",35000);
		sony = new Television("sony","plasma","yes",15000);
	}
	@Test
	public void testTelevisionAcceptingDuplicateValues() {
		ArrayList<Television> television= new ArrayList<>();
		television.add(samsung);
		television.add(lg);
		television.add(sony);
		television.add(sony);
		
		Iterator<Television> it=television.iterator();
		
		assertEquals(samsung,it.next());
		assertEquals(lg, it.next());
		assertEquals(sony, it.next());
		
		
		
	}
	@Test
	public void testTelevisionNotAcceptingDuplicateValues() {
		HashSet<Television> television= new HashSet<>();
		television.add(samsung);
		television.add(lg);
		television.add(sony);
		
		
		
		
		assertEquals(3,television.size());
	}
	
}
