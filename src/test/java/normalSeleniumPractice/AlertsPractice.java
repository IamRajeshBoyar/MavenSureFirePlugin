package normalSeleniumPractice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class AlertsPractice {

	public static void main(String[] args) throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\MavenProjectMain\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		List<WebElement> button = driver.findElements(By.xpath("//button"));
		
		System.out.println(button.size());
		
		button.get(4).click();
		driver.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']")).click();	
		
		
	}

}
