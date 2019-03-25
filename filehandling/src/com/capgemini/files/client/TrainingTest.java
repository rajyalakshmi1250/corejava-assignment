package com.capgemini.files.client;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.files.model.CorporateTraining;
import com.capgemini.files.model.PublicTraining;
import com.capgemini.files.model.Training;

class TrainingTest {
	@Test
	public void testPublicTrainingOrderValue() {
		Training details=new PublicTraining(101, "Java", 5000, 50);
		assertEquals(250000, details.getOrderValue());
	}
	@Test
	public void testCorporateTrainingOrderValue() {
		Training details=new CorporateTraining(1001, "Big Data", 35000, 4);
		assertEquals(140000, details.getOrderValue());
	}
	

	@Test
	public void testPublicTrainingFalseOrderValue() {
		Training details=new PublicTraining(101, "Java", 5000, 50);
		assertNotEquals(25000, details.getOrderValue());
	}
	@Test
	public void testCorporateTrainingFalseOrderValue() {
		Training details=new CorporateTraining(1001, "Big Data", 35000, 4);
		assertNotEquals(14000, details.getOrderValue());
	}

}
