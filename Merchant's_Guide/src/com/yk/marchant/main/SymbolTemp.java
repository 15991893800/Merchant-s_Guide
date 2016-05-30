package com.yk.marchant.main;

import java.util.HashMap;
import java.util.Map;

public class SymbolTemp {
	// Save the temp symbol and value from glob is I and so on

	public static Map<String, Integer> symbolTemp;

	public SymbolTemp() {
		symbolTemp = new HashMap<String, Integer>();
	}

	public void setSymbolTemp(String symbol, Integer value) {
		symbolTemp.put(symbol, value);
	}

	public int getSymbolTemp(String symbol) {
		return symbolTemp.get(symbol);
	}
}
