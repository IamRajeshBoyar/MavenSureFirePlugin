package testNGpractice;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class IretryAnalyserExample {
	@Test (retryAnalyzer = IretryAnalyseClassExample.class)
	public void exampleRetry() {
		System.out.println("retrying....");
		assertEquals(false, true);
		
	}
	
	

}
