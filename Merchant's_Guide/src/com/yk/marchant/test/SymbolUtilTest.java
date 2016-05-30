package com.yk.marchant.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yk.marchant.util.SymbolUtil;

public class SymbolUtilTest {

	/***
	 * Test SymBol Value(I:1; V:5; X:10; L:50; C:100; D:500; M:1,000)
	 ***/
	@Test
	public void testGetSymmolValue() {
		int symbolI = SymbolUtil.getSymbolValue("I");
		assertEquals(symbolI, 1);
		
		int symbolV = SymbolUtil.getSymbolValue("V");
		assertEquals(symbolV, 5);
		
		int symbolX = SymbolUtil.getSymbolValue("X");
		assertEquals(symbolX, 10);
		
		int symbolL = SymbolUtil.getSymbolValue("L");
		assertEquals(symbolL, 50);
		
		int symbolC = SymbolUtil.getSymbolValue("C");
		assertEquals(symbolC, 100);
		
		int symbolD = SymbolUtil.getSymbolValue("D");
		assertEquals(symbolD, 500);
		
		int symbolM = SymbolUtil.getSymbolValue("M");
		assertEquals(symbolM, 1000);
		
	}
	
	//Get the symbol keys
	@Test
	public void testGetSymbolKeys(){
		String symbolKeys = SymbolUtil.getSymbolKeys();
		assertEquals("DVCLMXI", symbolKeys);
	}

}
