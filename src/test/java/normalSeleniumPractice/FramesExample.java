package normalSeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\MavenProjectMain\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/frame.html");
		
		WebElement element = driver.findElement(By.xpath("//iframe[@src='page.html']"));
		
		driver.switchTo().frame(element);
		
		WebElement element1 = driver.findElement(By.xpath("//iframe[@src='nested.html']"));
		
		driver.switchTo().frame(element1);
		
		driver.findElement(By.id("Click1")).click();
		
		driver.switchTo().parentFrame();
	
	}

}
