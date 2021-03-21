package org.testng;

import org.testng.annotations.Test;

public class Run {

	@Test
	private void test1() {
		System.out.println("test1");

	}

	@Test
	private void test2() {
		Assert.assertTrue(false);
		System.out.println("test2");

	}

	@Test
	private void test3() {
		System.out.println("test3");

	}

}
