package com.yk.marchant.main;

import com.yk.marchant.util.ContentUtil;

public class ContentParse {

	public String getCurrentOutput(String currentLine) {
		if(currentLine.contains(ContentUtil.IS_UTIL)){
			return null;
		}else{
			return "I have no idea what you are talking about";
		}
	}

}
