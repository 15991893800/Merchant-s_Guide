package com.yk.marchant.test;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;

import org.junit.Test;

import com.yk.marchant.main.InputParse;

public class InputParseTest {

    //Test new Single InputParse class
	@Test
	public void testNewInputParse() {
		InputParse inputParse = InputParse.getInstance();
		assertEquals(inputParse.getClass(),InputParse.class);
	}
	
	//Test get input from file
	@Test
	public void testGetInput() throws IOException{
		InputParse inputParse = InputParse.getInstance();
		BufferedReader br = inputParse.getInput();
		assertTrue(br.readLine()!=null);
	}

}
