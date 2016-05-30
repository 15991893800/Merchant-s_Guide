package com.yk.marchant.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.yk.marchant.main.SymbolRule;

public class SymbolRuleTest {

	@Test
	public void testCheckSymbolRule() {
		List<String> symbolList = new ArrayList<String>();
		symbolList.add("I");
		assertTrue(SymbolRule.checkSymbolRule(symbolList));
	}

}
