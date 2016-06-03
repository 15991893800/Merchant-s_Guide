package com.yk.merchant.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yk.merchant.util.ContentUtil;

public class ContentUtilTest {

	// Test Content util
	@Test
	public void testContentUtil() {
		
		String isUtil = ContentUtil.IS_UTIL;
		assertEquals(isUtil, " is ");
		
		String spaceUtil = ContentUtil.SPACE_UTIL;
		assertEquals(spaceUtil, " ");
		
		String questionMarkUtil = ContentUtil.QUESTION_MARK_UTIL;
		assertEquals(questionMarkUtil, " ?");
		
		String howManyUtil = ContentUtil.HOW_MANY_UTIL;
		assertEquals(howManyUtil, "how many");
		
		String howMuchUtil = ContentUtil.HOW_MUCH_UTIL;
		assertEquals(howMuchUtil, "how much");
		
		String creditsUtil = ContentUtil.CREDITS_UTIL;
		assertEquals(creditsUtil, "Credits");
	}

}
