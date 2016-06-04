package com.yk.merchant.main;

import java.io.FileNotFoundException;
import java.io.IOException;

public class StartMerchantGuide {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	
	// Start the program
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		InputFile inputFile = InputFile.getInstance();
		inputFile.startGuide();
	}

}
