package com.learning;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void Addtest() {
		MyJUnit junit = new MyJUnit();
		int result = junit.add(100, 150);
		assertEquals(250, result);
	}

}
