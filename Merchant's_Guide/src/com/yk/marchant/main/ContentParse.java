package com.yk.marchant.main;

import java.util.ArrayList;
import java.util.List;

import com.yk.marchant.util.ContentUtil;
import com.yk.marchant.util.SymbolUtil;

public class ContentParse {

	public SymbolTemp symbolValue = new SymbolTemp();
	public SymbolTemp productValue = new SymbolTemp();

	public String getCurrentOutput(String currentLine) {
		if (currentLine.contains(ContentUtil.IS_UTIL)
				&& currentLine.split(ContentUtil.IS_UTIL).length == 2) {
			if (currentLine.endsWith(ContentUtil.QUESTION_MARK_UTIL)) {
				return parseQuestion(currentLine);
			} else {
				return parseStatement(currentLine);
			}
		} else {
			return ContentUtil.Wrong_Util;
		}
	}

	private String parseQuestion(String currentLine) {
		// TODO Auto-generated method stub
		return null;
	}

	private String parseStatement(String currentLine) {
		// TODO Auto-generated method stub
		String[] currentLineSplits = currentLine.split(ContentUtil.IS_UTIL);
		String[] currentLineSplitsLeftList = currentLineSplits[0]
				.split(ContentUtil.SPACE_UTIL);
		String[] currentLineSplitsRightList = currentLineSplits[1]
				.split(ContentUtil.SPACE_UTIL);

		// check the input style of "glob is I", save in the Map("glob", 1)
		if (currentLineSplitsLeftList.length == 1
				&& currentLineSplitsRightList.length == 1) {
			if (SymbolUtil.getSymbolKeys().contains(
					currentLineSplitsRightList[0])) {
				symbolValue.setSymbolTemp(currentLineSplitsLeftList[0],
					currentLineSplitsRightList[0]);
				return null;
			} else {
				return ContentUtil.Wrong_Util;
			}
		} else { // Check the input style of "glob glob Silver is 34 Credits",
					// save in the Map("Silver", 17)
			if (currentLineSplitsRightList.length == 2
					&& currentLineSplitsRightList[1]
							.equals(ContentUtil.CREDITS_UTIL)
					&& new Integer(currentLineSplitsRightList[0]) instanceof Integer) {
				List<String> symbolList = new ArrayList<String>();
				for(int i=0; i<currentLineSplitsLeftList.length-1; i++){
					symbolList.add(symbolValue.getSymbolTemp(currentLineSplitsLeftList[i]));
				}
				//Check the symbol rule
				if(SymbolRule.checkSymbolRule(symbolList)){
					return null;
				}else{
				   return symbolList + ContentUtil.Rule_Util;	
				}
			} else {
				return ContentUtil.Wrong_Util;
			}
		}

	}
}
