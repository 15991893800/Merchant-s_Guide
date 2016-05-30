package com.yk.marchant.main;

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
						SymbolUtil
								.getSymbolValue(currentLineSplitsRightList[0]));
				System.out.println(symbolValue.getSymbolTemp(currentLineSplitsLeftList[0]));
				return null;
			} else {
				return null;
			}
		} else {
			return null;
		}

	}
}
