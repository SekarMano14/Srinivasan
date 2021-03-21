package org.testng;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.annotations.ITestAnnotation;

public class WithoutKnown implements IAnnotationTransformer{

	public void transform(ITestAnnotation a, Class arg1, Constructor arg2, Method arg3) {
		
		IRetryAnalyzer r = a.getRetryAnalyzer();
		
		if(r==null) {
		
		a.setRetryAnalyzer(WithKnownTestcase.class);
		}
		
		
	}

}
