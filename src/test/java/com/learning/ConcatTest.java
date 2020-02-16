package com.learning;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConcatTest {

	@Test
	public void Concatest() {
		MyJUnit junit = new MyJUnit();
		String result = junit.concat("Hello", "World");
		assertEquals("HelloWorld", result);
	}

}
