package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterMul {
	
	@Test @Parameters({"a","b"})
	public void multiplication(int a, int b) {
		int mul = 0;
		mul = a * b;
		System.out.println("the parameter received are "+a+" "+b+" multiplication is "+mul);
	}
}
