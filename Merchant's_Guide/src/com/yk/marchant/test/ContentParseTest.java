package com.yk.marchant.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.yk.marchant.main.ContentParse;

public class ContentParseTest {

	private static ContentParse contentParse;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		contentParse = new ContentParse();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testGetCurrentOutput() {
		String currentResultWrong = contentParse
				.getCurrentOutput("how much wood could a woodchuck chuck if a woodchuck could chuck wood ?");
		assertEquals("I have no idea what you are talking about",
				currentResultWrong);

		String currentResultTest01 = contentParse.getCurrentOutput("glob is I");
		assertNull(currentResultTest01);
		
		String currentResultTest02 = contentParse.getCurrentOutput("glob glob Silver is 34 Credits");
		assertNull(currentResultTest02);
	}

}
