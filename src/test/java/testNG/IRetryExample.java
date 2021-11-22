package testNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetryExample implements IRetryAnalyzer{
	
	int failCount = 3;
	int startCount = 0;
	
	@Override
	public boolean retry(ITestResult result) {
		
		if(startCount < failCount) {
			startCount++;
			return true;
		}
		return false;
	}

}
