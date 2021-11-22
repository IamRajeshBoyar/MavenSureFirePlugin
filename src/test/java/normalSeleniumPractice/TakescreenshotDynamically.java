package normalSeleniumPractice;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomListeners.class)
public class TakescreenshotDynamically extends Base {
	
	@BeforeMethod
	public void beforeMethod() {
		browserLaunch();
	}
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
	
	@Test
	public void testCorrectLogin() {
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		String expectedUrl = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
		
	}
	@Test
	public void testIncorrectLogin() {
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin1235667");
		driver.findElement(By.id("btnLogin")).click();
		String expectedUrl = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
	}
	
	
}
