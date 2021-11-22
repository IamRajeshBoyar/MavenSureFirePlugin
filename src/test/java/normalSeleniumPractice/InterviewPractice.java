package normalSeleniumPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.AWTException;

public class InterviewPractice {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\MavenProjectMain\\Drivers\\chromedriver.exe");
		
		HashMap preferences = new HashMap();
		preferences.put("download.default_directory", "C:\\Users\\Admin\\Desktop\\downloads\\");
		
		
		ChromeOptions option = new ChromeOptions();
		option.setExperimentalOption("prefs", preferences);
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//a[contains(text(),'Download sample DOC file')])[1]")).click();
		
		
		//example of downloading file to a specific directory
		
		/*
		//firefox
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/msword");
		profile.setPreference("browser.download.folderList", 2);
		profile.setPreference("browser.download.dir", "C:\\Users\\Admin\\Desktop\\downloads\\");
		
		FirefoxOptions firefoxOption = new FirefoxOptions();
		firefoxOption.setProfile(profile);
		WebDriver driverFirefox = new FirefoxDriver(firefoxOption);
		
		*/
		
		
	}
}
