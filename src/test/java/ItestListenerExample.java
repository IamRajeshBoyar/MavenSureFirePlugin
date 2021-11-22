import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ItestListenerExample extends BaseClassTest implements ITestListener {
	
	
	 public void onTestFailure(ITestResult result) {
		    
		 try {
			takescreenshot(result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	 }

}
