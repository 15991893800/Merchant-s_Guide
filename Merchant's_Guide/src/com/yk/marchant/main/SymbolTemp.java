package com.yk.marchant.main;

import java.util.HashMap;
import java.util.Map;

public class SymbolTemp {
	// Save the temp symbol and value from glob is I and so on

	public static Map<String, String> symbolTemp;

	public SymbolTemp() {
		symbolTemp = new HashMap<String, String>();
	}

	public void setSymbolTemp(String symbol, String value) {
		symbolTemp.put(symbol, value);
	}

	public String getSymbolTemp(String symbol) {
		return symbolTemp.get(symbol);
	}
}
