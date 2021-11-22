package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParameterSum {
	
	
	@Test @Parameters({"a", "b"})
	public void sum(int a, int b) {
		int sum = 0;
		sum = a + b;
		System.out.println("the parameter received are "+a+" "+b+" subtration is "+sum);
	}
	
}
