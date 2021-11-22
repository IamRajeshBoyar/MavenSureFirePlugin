package testNGpractice;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IretryAnalyseClassExample implements IRetryAnalyzer{

	@Override
	public boolean retry(ITestResult result) {
		int failcount = 1;
		int expectedCount = 3;
		while(failcount == expectedCount) {
			failcount++;
			return true;
		}
		return false;
	}

}
