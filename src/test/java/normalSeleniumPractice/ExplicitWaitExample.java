package normalSeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExplicitWaitExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\MavenProjectMain\\Drivers\\chromedriver.exe");
		
		//starting browser maximized
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--start-maximized");
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		driver.findElement(By.xpath("//button")).click();
		
		driver.findElement(By.xpath("//p[contains(text(),'WebDriver')]"));

	}

}
