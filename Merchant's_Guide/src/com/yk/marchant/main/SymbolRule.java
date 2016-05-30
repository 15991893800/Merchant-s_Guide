package com.yk.marchant.main;

import java.util.List;

public class SymbolRule {

	// Check symbol rule
	public static boolean checkSymbolRule(List<String> symbolList) {
		// TODO Auto-generated method stub
		if (repeateRule(symbolList) && subtractRule(symbolList)) {
			return true;
		} else {
			return false;
		}
	}

	// Check subtract rule
	private static boolean subtractRule(List<String> symbolList) {
		// TODO Auto-generated method stub
		if (symbolList.size() == 1) {
			return true;
		} else {
			return false;
		}

	}

	// Check repeat rule
	private static boolean repeateRule(List<String> symbolList) {
		// TODO Auto-generated method stub
		if (symbolList.size() == 1) {
			return true;
		}else {
			return false;
		}
	}

}
