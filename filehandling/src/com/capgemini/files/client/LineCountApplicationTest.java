package com.capgemini.files.client;




import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.capgemini.files.model.LineCountApplication;

public class LineCountApplicationTest {
	
	@Test
	public void testForCountingLines() throws IOException 
	{
		LineCountApplication lineCount = new LineCountApplication();
		assertEquals(18, lineCount.checkLineCount());
	}
	
}
