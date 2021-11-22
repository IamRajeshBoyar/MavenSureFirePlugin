package testNGExample;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExecuteFailCase extends TestFailBaseExample implements ITestListener{
	
	public void onTestFailure(ITestResult result) {
		try {
			captueScreen(result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }

}
