package com.yk.marchant.test;

import static org.junit.Assert.*;

import java.io.IOException;

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
	public void testGetCurrentOutput() throws IOException {
		String currentResultWrongTest01 = contentParse
				.getCurrentOutput("how much wood could a woodchuck chuck if a woodchuck could chuck wood ?");
		assertEquals("I have no idea what you are talking about",
				currentResultWrongTest01);

		String currentResultWrongTest02 = contentParse.getCurrentOutput("glob glob Silver is 34 is Credits");
		assertEquals("I have no idea what you are talking about",
				currentResultWrongTest02);
		
		String currentResultWrongTest03 = contentParse.getCurrentOutput("glob glob Silver is ");
		assertEquals("I have no idea what you are talking about",
				currentResultWrongTest03);
		
		String currentResultNormalTest01 = contentParse.getCurrentOutput("glob is I");
		assertNull(currentResultNormalTest01);
		
		String currentResultNormalTest02 = contentParse.getCurrentOutput("glob glob Silver is 34 Credits");
		assertNull(currentResultNormalTest02);
		
		
	}

}
