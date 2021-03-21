package org.testng;

import org.testng.annotations.Test;

public class B {
	@Test
	private void test21() {
		System.out.println("test12");
		System.out.println(Thread.currentThread().getId());

	}
	
	@Test
	private void test22() {
		System.out.println("test22");
		System.out.println(Thread.currentThread().getId());

	}
	
	@Test
	private void test23() {
		System.out.println("test32");
		System.out.println(Thread.currentThread().getId());

	}

}
