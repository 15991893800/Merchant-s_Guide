package com.yk.marchant.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.yk.marchant.main.SymbolRule;

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
	}

}
