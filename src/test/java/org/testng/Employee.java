package org.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Employee {
	
	@Test(dataProvider="data")
	private void test(String s1,String s2, String s3, String s4) {
		System.out.println(s1 + s2 + s3 + s4);
		

	}
	
	
	
	@DataProvider(name="data",indices= {2})
	public static Object[][] getData() {
		return new Object[][] {
			{"Mano","234567","Manoj","Sekar"},
			{"Raj","098765","Raj","Sekar"},
			{"Ram","45678","Ram","Sekar"},
			{"Kumar","12345","Kumar","Sekar"}		
			
		};
		
		
		

	}
	
}
