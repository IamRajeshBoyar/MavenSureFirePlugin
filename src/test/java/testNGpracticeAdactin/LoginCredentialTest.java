package testNGpracticeAdactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginCredentialTest extends TestNgBaseClass {
	
	
	@Test
	public void toVerifyValidLogin() {
		driver.get("http://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys("QARajesh");
		driver.findElement(By.id("password")).sendKeys("Speeds@123");
		driver.findElement(By.id("login")).click();
		
		String expectedUrl = "http://adactinhotelapp.com/SearchHotel.php";
		String actualUrl = driver.getCurrentUrl();
		
		Assert.assertEquals(actualUrl, expectedUrl);
	}
}
