import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import normalSeleniumPractice.TakescreenshotDynamically;

public class BaseClassTest {
	public static WebDriver driver; 
	public static void takescreenshot(String methodname) throws IOException {
		
		TakesScreenshot shot = (TakesScreenshot) driver;
		
		File src = shot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Admin\\eclipse-workspace\\MavenProjectMain\\ScreenShots\\"+methodname+".png"));
	}

}
