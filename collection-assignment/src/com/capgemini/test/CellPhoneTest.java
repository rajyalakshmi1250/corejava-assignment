package com.capgemini.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.main.CellPhone;

public class CellPhoneTest {
	private CellPhone samsung;
	private CellPhone redmi;
	private CellPhone vivo;
	@Before
	public void setUp(){
		samsung = new CellPhone("samsung","abc","blackcolor","android ",15000);
		redmi = new CellPhone("redmi","def","goldcolor","ios ",10000);
		vivo = new CellPhone("vivo","ghi","whitecolor","Windows ",12000);
	}
	@Test
	public void testCellPhoneAcceptingDuplicateValues() {
		ArrayList<CellPhone> cellphone= new ArrayList<>();
		cellphone.add(samsung);
		cellphone.add(redmi);
		cellphone.add(vivo);
		cellphone.add(redmi);
		
		Iterator<CellPhone> it=cellphone.iterator();
		
		assertEquals(samsung,it.next());
		assertEquals(redmi, it.next());
		assertEquals(vivo, it.next());

	}
	@Test
	public void testCellPhoneNotAcceptingDuplicateValues() {
		HashSet<CellPhone> cellphone= new HashSet<>();
		cellphone.add(samsung);
		cellphone.add(redmi);
		cellphone.add(vivo);
		
		
		
		
		assertEquals(3,cellphone.size());
	}

}
