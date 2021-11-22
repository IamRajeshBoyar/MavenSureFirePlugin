package retryAnnalizer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IretryAnalyserClass implements IRetryAnalyzer {
	
	int failcount = 1;
	int maxcount = 4;
	@Override
	public boolean retry(ITestResult result) {
		
		if(failcount < maxcount) {
			failcount++;
			
			return true;
			
			
		}
		
		return false;
	}

	
	
}
