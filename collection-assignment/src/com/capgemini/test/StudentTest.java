package com.capgemini.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.main.Student;

public class StudentTest {
	private Student mouli ;
	private Student divya;
	private Student bindu;
	
	@Before
	public void setUp(){
		mouli = new Student("mouli",1);
		divya = new Student("divya",2);
		bindu = new Student("vishwabhrathi",1);
	}
	@Test
	public void testStudentDetailsAddedAsGivenFormat() {
		ArrayList<Student> student =new ArrayList<Student>();
		student.add(mouli);
		student.add(divya);
		student.add(bindu);
		student.add(mouli);
		
		Iterator<Student> it=student.iterator();
		
		assertEquals(mouli, it.next());
		assertEquals(divya, it.next());
		assertEquals(bindu, it.next());
		assertEquals(mouli, it.next());
	}
	@Test
	public void testStudentDetailsStoredInNaturalOrder() {
		TreeSet<Student> student=new TreeSet<Student>();
		student.add(divya);
		student.add(mouli);
		student.add(bindu);
		
		Iterator<Student> it=student.iterator();
		
		assertEquals(divya, it.next());
		assertEquals(mouli, it.next());
		assertEquals(bindu, it.next());
		
		}
	@Test
	public void testDisplayStudentBranchByGivingStudentName() {
		Map<String ,String> map=new HashMap<String, String>();
		map.put("mouli","mango");
		map.put("divya","banana");
		map.put("bindu","apple");
	
		Collection<String > keys=map.keySet();
		assertEquals(3, keys.size());
		
		Collection<String> values=map.values();
		assertEquals(3, values.size());
		
		assertEquals("mango",map.get("mouli"));
		assertEquals("banana",map.get("divya"));
		assertEquals("apple",map.get("bindu"));
		
 		
		
	}
	@Test
	public void toTestDetailsOfStudentInInsertion()
	{
		HashSet<Student> student=new HashSet<>();
		student.add(mouli);
		student.add(divya);
		student.add(bindu);
		
		assertEquals(3,student.size());
	}
	

	
}
