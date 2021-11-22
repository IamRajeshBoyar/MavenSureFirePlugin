package testNGExample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TestFailBaseExample {
	
	public static WebDriver driver;
	
	public static void captueScreen(String name) throws IOException {
		TakesScreenshot shot = (TakesScreenshot) driver;
		File src = shot.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Admin\\eclipse-workspace\\MavenProjectMain\\ScreenShots\\"+name+".png");
		FileUtils.copyFile(src, destination);
		System.out.println("screen shot taken");
	}

}
