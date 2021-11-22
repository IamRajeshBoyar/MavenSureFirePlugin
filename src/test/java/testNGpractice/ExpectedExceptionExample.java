package testNGpractice;

import org.testng.annotations.Test;

public class ExpectedExceptionExample {
	
	@Test(expectedExceptions = java.lang.ArithmeticException.class)
	public void TestExpectedException() {
		
		int a =0;
		int b = 4;
		
		int divison = b /a;
		
	}

}
