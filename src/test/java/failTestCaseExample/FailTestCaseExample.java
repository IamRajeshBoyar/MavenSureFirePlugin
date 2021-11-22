package failTestCaseExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(TestItestListenExample.class)
public class FailTestCaseExample extends TestFailBase{
	@BeforeSuite
	public void openGoogle() {	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\MavenProjectMain\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	
	@Test(priority = 1)
	public void navigateToLoginPage() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@Test(priority =2)
	public void enterCredential() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123 ");
		driver.findElement(By.id("btnLogin")).click();
		
		String expectedUrl = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		String actualUrl = driver.getCurrentUrl();
		
		Assert.assertEquals(actualUrl, expectedUrl);
		
	}
	@Test
	public void tearDown() {
		//driver.close();
	}

}
