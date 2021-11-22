package normalSeleniumPractice;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListeners extends Base implements ITestListener{
	
	  public void onTestFailure(ITestResult result) {
		  try {
			failed(result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	
}