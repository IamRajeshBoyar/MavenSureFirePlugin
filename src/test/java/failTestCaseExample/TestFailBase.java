package failTestCaseExample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TestFailBase {

	
	public static WebDriver driver;
	
	public static void testFail(String methodname) throws IOException {
	File souce = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(souce, new File("C:\\Users\\Admin\\eclipse-workspace\\MavenProjectMain\\ScreenShots\\"+methodname+".png"));
		
	}
	
}
