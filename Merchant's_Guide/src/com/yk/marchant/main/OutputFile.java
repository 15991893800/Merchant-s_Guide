package com.yk.marchant.main;

import java.util.ArrayList;
import java.util.List;

public class OutputFile {
	
	ContentParse contentParse = new ContentParse();
	
	// Define output list
	private List<String> outputList = new ArrayList<String>();

	// Parse the input line and add output content
	public void parseCurrentLine(String currentLine) {
		String currentOutput = contentParse.getCurrentOutput(currentLine);
		outputList.add(currentOutput);
	}

	// Output method
	public void getOutput() {
		for (int i = 0; i < outputList.size(); i++) {
			System.out.println(outputList.get(i));
		}

	}

}
