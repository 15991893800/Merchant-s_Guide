package com.yk.merchant.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputFile {

	// new single InputParse class
	private static InputFile instance = null;

	public static InputFile getInstance() {
		if (instance == null) {
			synchronized (InputFile.class) {
				if (instance == null) {
					instance = new InputFile();
				}
			}
		}
		return instance;
	}

	private InputFile() {
	}

	// Start merchant's guide to the Galaxy
	public void startGuide() throws FileNotFoundException, IOException {
		parseInputFile(getInput());
	}

	// Get the input file:
	
	// glob is I
	// prok is V
	// pish is X
	// tegj is L
	// glob glob Silver is 34 Credits
	// glob prok Gold is 57800 Credits
	// pish pish Iron is 3910 Credits
	// how much is pish tegj glob glob ?
	// how many Credits is glob prok Silver ?
	// how many Credits is glob prok Gold ?
	// how many Credits is glob prok Iron ?
	// how much wood could a woodchuck chuck if a woodchuck could chuck wood ?
	
	public BufferedReader getInput() throws FileNotFoundException {
		
		return new BufferedReader(new FileReader("D:\\SampleInput.txt"));
	}

	// Parse input File
	public void parseInputFile(BufferedReader br) throws IOException {
		OutputFile outputParse = new OutputFile();
		outputParse.parseCurrentLine(br);

		// call the output method of OutputParse, output the result
		outputParse.getOutput();
	}
}
