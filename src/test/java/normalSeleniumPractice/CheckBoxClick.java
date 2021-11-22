package normalSeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckBoxClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\MavenProjectMain\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		
		WebElement checkbox=	driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		//using click
		//checkbox.click();
		
		//using sendkeys
		//checkbox.sendKeys(Keys.SPACE);
		
		/*
		 * JavascriptExecutor js = (JavascriptExecutor)
		 * driver; js.executeScript("arguments[0].click()", checkbox);
		 */
		
		Actions action = new Actions(driver);
		action.click(checkbox).build().perform();
	}

}
