package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterSub {
	
	@Test @Parameters({"a","b"})
	public void subtratc(int a, int b) {
		int sub = 0;
		sub = a - b;
		System.out.println("the parameter received are "+a+" "+b+" subtration is "+sub);
	}

}
