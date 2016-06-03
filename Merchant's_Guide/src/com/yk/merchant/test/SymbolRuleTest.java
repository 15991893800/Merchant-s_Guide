package com.yk.merchant.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.yk.merchant.main.SymbolRule;

public class SymbolRuleTest {

	@Test
	public void testCheckSymbolRule() {
		List<String> symbolList01 = new ArrayList<String>();
		symbolList01.add("I");
		assertTrue(SymbolRule.checkSymbolRule(symbolList01));
		
		List<String> symbolList02 = new ArrayList<String>();
		symbolList02.add("D");
		symbolList02.add("I");
		assertTrue(SymbolRule.checkSymbolRule(symbolList02));
		
		List<String> symbolList03 = new ArrayList<String>();
		symbolList03.add("M");
		symbolList03.add("C");
		symbolList03.add("M");
		symbolList03.add("X");
		symbolList03.add("L");
		symbolList03.add("I");
		symbolList03.add("V");
		assertTrue(SymbolRule.checkSymbolRule(symbolList03));
		
		List<String> symbolList04 = new ArrayList<String>();
		symbolList04.add("M");
		symbolList04.add("C");
		symbolList04.add("M");
		symbolList04.add("M");
		symbolList04.add("L");
		symbolList04.add("I");
		symbolList04.add("V");
		assertFalse(SymbolRule.checkSymbolRule(symbolList04));
		
		List<String> symbolList05 = new ArrayList<String>();
		symbolList05.add("X");
		symbolList05.add("X");
		symbolList05.add("X");
		symbolList05.add("I");
		symbolList05.add("X");
		assertTrue(SymbolRule.checkSymbolRule(symbolList05));
		
	}
	
	@Test
	public void testGetProductNumber(){
		List<String> symbolList01 = new ArrayList<String>();
		symbolList01.add("M");
		symbolList01.add("C");
		symbolList01.add("M");
		symbolList01.add("X");
		symbolList01.add("L");
		symbolList01.add("I");
		symbolList01.add("V");
		
		assertEquals(1944, SymbolRule.getProductNumber(symbolList01));
	}

}
