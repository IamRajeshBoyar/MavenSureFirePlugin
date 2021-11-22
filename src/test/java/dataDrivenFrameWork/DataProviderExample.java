package dataDrivenFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	WebDriver driver;
	
	Object[][] loginDetails = {
			{"Admin", "admin123"},
			{"Admin", "great@123"},
			{"palanisomy","admin123"},
			{"uma","goa@123"}
			
	}; 
	
	@DataProvider(name="mydataProvider")
	public Object[][] loginDetailsProvider() {
		return loginDetails;
	}
	
	@Test(dataProvider="mydataProvider")
	public void loginTest(String username, String password) {
		
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, "https://opensource-demo.orangehrmlive.com/index.php/dashboard","wrong username or password");
	}
	
	
	@BeforeSuite
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\MavenProjectMain\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
}
