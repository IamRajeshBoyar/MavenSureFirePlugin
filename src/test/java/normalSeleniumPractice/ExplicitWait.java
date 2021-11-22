package normalSeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\MavenProjectMain\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/appear.html");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		WebElement appearButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='btn']")));
		
		String text = appearButton.getAttribute("innerHTML");
		System.out.println(text);
		
	
	}

}
