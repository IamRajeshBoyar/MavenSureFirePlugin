package testNG;



import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReportPractice {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extentReports;
	ExtentTest testcase;
	@Test
	public void checkGoogleBrowser() {
		 htmlReporter = new ExtentHtmlReporter("C:\\Users\\Admin\\eclipse-workspace\\MavenProjectMain\\ScreenShots\\report.html");
		 extentReports = new ExtentReports();
		extentReports.attachReporter(htmlReporter);
		testcase = extentReports.createTest("verify brower launched properly");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\MavenProjectMain\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test
	public void verifyTitle() throws IOException {
		String actualTitle = driver.getTitle();
		testcase.log(Status.INFO, "actual title is"+actualTitle);
		testcase.log(Status.INFO, "expected title is OrangeHRM");
		testcase.log(Status.INFO, "verification of actual and expected title");
		if(actualTitle.equals("OrangeHR")) {
			testcase.log(Status.PASS, "actual and expected title are equals");
		}else {
			testcase.log(Status.FAIL, "actual tile and expected title are not equal");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		org.openqa.selenium.io.FileHandler.copy(src, new File("C:\\Users\\Admin\\eclipse-workspace\\MavenProjectMain\\ScreenShots\\demo.png"));
		testcase.addScreenCaptureFromPath("C:\\Users\\Admin\\eclipse-workspace\\MavenProjectMain\\ScreenShots\\demo.png");
		}
		
	}
	
	@AfterSuite
	public void tearDown() {
		extentReports.flush();
	}
	
}
