package com.yk.merchant.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.yk.merchant.main.SymbolTemp;

public class SymbolTempTest {

	private static SymbolTemp symbolTemp;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		symbolTemp = new SymbolTemp();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testGetSymbolTemp() {
		symbolTemp.setSymbolTemp("glob", "1");
		String valueTemp = symbolTemp.getSymbolTemp("glob");
		assertEquals("1", valueTemp);
	}

}
