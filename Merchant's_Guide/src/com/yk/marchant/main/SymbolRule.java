package com.yk.marchant.main;

import java.util.List;

import com.yk.marchant.util.SymbolUtil;

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
			for (int i = 0; i < symbolList.size() - 1; i++) {
				int countNumber = 0;
				for (int j = i + 1; j < symbolList.size(); j++) {
					if (SymbolUtil.getSymbolValue(symbolList.get(i)) < SymbolUtil
							.getSymbolValue(symbolList.get(j))) {
						countNumber++;
						if (countNumber == 2) {
							return false;
						} else if ((symbolList.get(i).equals("V")
								|| symbolList.get(i).equals("L") || symbolList
								.get(i).equals("D"))) {
							return false;
						} else if (symbolList.get(i).equals("I")
								&& (!(symbolList.get(i + 1).equals("V") || symbolList
										.get(i + 1).equals("X")))) {
							return false;
						}else if (symbolList.get(i).equals("X")
								&& (!(symbolList.get(i + 1).equals("L") || symbolList
										.get(i + 1).equals("C")))) {
							return false;
						}else if (symbolList.get(i).equals("C")
								&& (!(symbolList.get(i + 1).equals("D") || symbolList
										.get(i + 1).equals("M")))) {
							return false;
						}
					}

				}
			}

			return true;
		}

	}

	// Check repeat rule
	private static boolean repeateRule(List<String> symbolList) {
		// TODO Auto-generated method stub
		if (symbolList.size() == 1) {
			return true;
		} else {
			for(int i=0; i<symbolList.size()-1; i++){
				int countNumber = 0;
				for(int j=i+1; j<symbolList.size(); j++){
					if(symbolList.get(i).equals(symbolList.get(j))){
						countNumber++;
						if((symbolList.get(i).equals("V")
								|| symbolList.get(i).equals("L") || symbolList
								.get(i).equals("D"))){
							return false;
						}else if(countNumber == 3 && (symbolList.get(j).equals(symbolList.get(j-1)))){
							return false;
						}
					}
				}
			}
				
		    return true;
		}
	}

}
