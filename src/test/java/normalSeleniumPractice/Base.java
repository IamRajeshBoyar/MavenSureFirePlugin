package normalSeleniumPractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Base {
	public static WebDriver driver;
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\MavenProjectMain\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public static void failed(String methodname) throws IOException {
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(source, new File("C:\\Users\\Admin\\eclipse-workspace\\MavenProjectMain\\ScreenShots\\"+methodname+".png"));
	}

}
