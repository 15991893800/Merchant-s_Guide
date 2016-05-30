package com.yk.marchant.main;

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

	// get the input file
	public BufferedReader getInput() throws FileNotFoundException {
		// TODO Auto-generated method stub
		return new BufferedReader(new FileReader("D:\\SampleInput.txt"));
	}

	// Parse input File
	public void parseInputFile(BufferedReader br) throws IOException {
		OutputFile outputParse = new OutputFile();
		outputParse.parseCurrentLine(br);

		//call the output method of OutputParse, output the result
		outputParse.getOutput();
	}
}
