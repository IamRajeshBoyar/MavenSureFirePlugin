package normalSeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\MavenProjectMain\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='default.html']")));
		WebElement button = driver.findElement(By.id("Click"));
		button.click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='page.html']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='nested.html']")));
		driver.findElement(By.id("Click1")).click();
	}

}
