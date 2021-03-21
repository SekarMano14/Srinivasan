package org.testng;

import org.testng.annotations.Test;

public class C {
	@Test
	private void test31() {
		System.out.println("test13");
		System.out.println(Thread.currentThread().getId());

	}
	
	@Test(groups="Smoke")
	private void test32() {
		System.out.println("test23");
		System.out.println(Thread.currentThread().getId());

	}
	
	@Test(invocationCount=5,threadPoolSize=2)
	private void test33() {
		System.out.println("test33");
		System.out.println(Thread.currentThread().getId());

	}

}
