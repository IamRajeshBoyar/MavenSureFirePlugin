package failTestSceenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class BassClass {
	public static WebDriver driver;
	public static void fail(String methodname) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Admin\\eclipse-workspace\\MavenProjectMain\\ScreenShots\\"+methodname+".png"));
		
	}

}
