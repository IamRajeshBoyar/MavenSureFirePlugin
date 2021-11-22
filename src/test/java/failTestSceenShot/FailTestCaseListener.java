package failTestSceenShot;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class FailTestCaseListener extends BassClass implements ITestListener{
	 public void onTestFailure(ITestResult result) {
		    
		 try {
			fail(result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
}
