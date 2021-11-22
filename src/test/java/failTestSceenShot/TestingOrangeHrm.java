package failTestSceenShot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(FailTestCaseListener.class)
public class TestingOrangeHrm extends BassClass {
	@Test
	public void testCorrectUserCredential() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\MavenProjectMain\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		
		driver.findElement(By.id("username")).sendKeys("QARajesh2");
		driver.findElement(By.id("password")).sendKeys("Speeds@123");
		
		
		driver.findElement(By.id("login")).click();
		
		
		String currentUrl = driver.getCurrentUrl();
		
		Assert.assertEquals(currentUrl, "https://adactinhotelapp.com/SearchHotel.php","url is mismatching");
	}
	
}
