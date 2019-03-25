package com.capgemini.test;



import static org.junit.Assert.assertEquals;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.main.Car;


public class CarTest {

	private Car bmwCar;
	private Car audiCar;
	private Car desireCar;
	@Before
	public void setUp(){
		bmwCar = new Car("Bmw","abc",2009,500000);
		audiCar = new Car("Audi","def",2018,3500000);
		desireCar = new Car("Desire","ghi",2018,250000);
	}
	@Test
	public void testCarAcceptingDuplicateValues() {
		ArrayList<Car> cars= new ArrayList<>();
		cars.add(bmwCar);
		cars.add(audiCar);
		cars.add(desireCar);
		cars.add(bmwCar);
		
		
		assertEquals(4,cars.size());
		
		  
		 
	}
	@Test
	public void testCarNotAcceptingDuplicateValues() {
		HashSet<Car> cars= new HashSet<>();
		cars.add(bmwCar);
		cars.add(audiCar);
		cars.add(desireCar);
		//cars.add(audiCar);
		
		assertEquals(3,cars.size());
	}
	@Test
	public void testCarSortedBasedOnMake() {
		TreeSet<Car> cars = new TreeSet<>();
		cars.add(bmwCar);
		cars.add(audiCar);
		cars.add(desireCar);
		Iterator<Car> it = cars.iterator();
		assertEquals(audiCar, it.next());
		assertEquals(bmwCar, it.next());
		
		assertEquals(desireCar, it.next());
		
		
		
	}

}
