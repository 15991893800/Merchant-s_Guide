package com.yk.marchant.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yk.marchant.main.InputParse;

public class InputParseTest {

    //Test new Single InputParse class
	@Test
	public void testNewInputParse() {
		InputParse inputParse = InputParse.getInstance();
		assertEquals(inputParse.getClass(),InputParse.class);
	}

}
