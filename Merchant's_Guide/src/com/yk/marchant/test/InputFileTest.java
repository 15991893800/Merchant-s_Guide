package com.yk.marchant.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.IOException;

import org.junit.Test;

import com.yk.marchant.main.InputFile;

public class InputFileTest {

    //Test new Single InputParse class
	@Test
	public void testNewInputParse() {
		InputFile inputFile = InputFile.getInstance();
		assertEquals(inputFile.getClass(),InputFile.class);
	}
	
	//Test get input from file
	@Test
	public void testGetInput() throws IOException{
		InputFile inputFile = InputFile.getInstance();
		BufferedReader br = inputFile.getInput();
		assertTrue(br.readLine()!=null);
	}

}
