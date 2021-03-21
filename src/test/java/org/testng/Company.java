package org.testng;

import org.testng.annotations.Test;

public class Company {
	@Test(groups = "Smoke")
	private void test12() {
		System.out.println("test12");

	}

	@Test(groups = "Sanity")
	private void test22() {
		System.out.println("test22");

	}

	@Test(groups = "Smoke")
	private void test32() {
		System.out.println("test32");

	}

	@Test(groups = {"Regression","Smoke"})
	private void test52() {
		System.out.println("test52");

	}

	@Test(groups = "Regression")
	private void test62() {
		System.out.println("test62");

	}

	@Test(groups = "Sanity")
	private void test72() {
		System.out.println("test72");

	}

}
