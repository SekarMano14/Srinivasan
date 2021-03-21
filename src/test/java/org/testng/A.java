package org.testng;

import org.testng.annotations.Test;

public class A {
	@Test
	private void test11() {
		System.out.println("test12");
		System.out.println(Thread.currentThread().getId());

	}
	
	@Test
	private void test12() {
		System.out.println("test22");
		System.out.println(Thread.currentThread().getId());

	}
	
	@Test
	private void test13() {
		System.out.println("test32");
		System.out.println(Thread.currentThread().getId());

	}

}
