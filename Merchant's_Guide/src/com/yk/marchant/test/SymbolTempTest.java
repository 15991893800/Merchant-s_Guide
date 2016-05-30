package com.yk.marchant.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.yk.marchant.main.SymbolTemp;

public class SymbolTempTest {

	private static SymbolTemp symbolTemp;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		symbolTemp = SymbolTemp.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testGetSymbolTemp() {
		symbolTemp.setSymbolTemp("glob", "I");
		String valueTemp = symbolTemp.getSymbolTemp("glob");
		assertEquals("I", valueTemp);
	}

}
