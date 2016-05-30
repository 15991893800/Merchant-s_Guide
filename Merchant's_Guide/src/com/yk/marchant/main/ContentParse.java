package com.yk.marchant.main;

import com.yk.marchant.util.ContentUtil;

public class ContentParse {

	public String getCurrentOutput(String currentLine) {
		if (currentLine.contains(ContentUtil.IS_UTIL)
				&& currentLine.split(ContentUtil.IS_UTIL).length == 2) {
            if(currentLine.endsWith(ContentUtil.QUESTION_MARK_UTIL)){
            	return parseQuestion(currentLine);
            }else{
            	parseStatement(currentLine);
            	return null;
            }
		} else {
			return ContentUtil.Wrong_Util;
		}
	}

	private String parseQuestion(String currentLine) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	private void parseStatement(String currentLine) {
		// TODO Auto-generated method stub
		
	}

}
