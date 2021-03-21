package org.testng;

public class WithKnownTestcase implements IRetryAnalyzer{

	int minCount=0, maxCount=10;
	public boolean retry(ITestResult arg0) {
		if(minCount<maxCount) {   
			minCount++;
			return true;    //test case fail
			
		}
		
		return false;   /// count complete or if test case pass
	}

	

	
}
