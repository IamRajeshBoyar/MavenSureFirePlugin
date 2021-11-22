package failTestCaseExample;

import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestItestListenExample extends TestFailBase implements ITestListener {
	
	 public void onTestFailure(ITestResult result) {
		 try {
			testFail(result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		    
	 }


}
