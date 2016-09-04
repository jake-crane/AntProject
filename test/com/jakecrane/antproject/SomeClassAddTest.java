package com.jakecrane.antproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SomeClassAddTest {
	@Test
	public void testName() throws Exception {
		assertEquals("1 + 1 was not 2", 2, SomeClass.add(1, 1));
	}
}
