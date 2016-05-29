package com.yk.marchant.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yk.marchant.util.SymbolUtil;

public class SymbolUtilTest {

	/***
	 * Test SymBol Value(I:1; V:5; X:10; L:50; C:100; D:500; M:1,000)
	 ***/
	@Test
	public void testGetSymmolValue() {
		int symbolI = SymbolUtil.getSymmolValue("I");
		assertEquals(symbolI, 1);
		
		int symbolV = SymbolUtil.getSymmolValue("V");
		assertEquals(symbolV, 5);
		
		int symbolX = SymbolUtil.getSymmolValue("X");
		assertEquals(symbolX, 10);
		
		int symbolL = SymbolUtil.getSymmolValue("L");
		assertEquals(symbolL, 50);
		
		int symbolC = SymbolUtil.getSymmolValue("C");
		assertEquals(symbolC, 100);
		
		int symbolD = SymbolUtil.getSymmolValue("D");
		assertEquals(symbolD, 500);
		
		int symbolM = SymbolUtil.getSymmolValue("M");
		assertEquals(symbolM, 1000);
	}

}
