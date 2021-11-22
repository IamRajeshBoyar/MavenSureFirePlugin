package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumBase {
	
	public static WebDriver driver;
	public static void browserLaunch(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\MavenProjectMain\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
	}
	
	public static void inputValues(WebElement element, String values) {
		element.clear();
		element.sendKeys(values);
	}
	
	public static void click(WebElement element) {
		element.click();
	}
	
	public static void dropDown(WebElement element, String text) {
		Select option = new Select(element);
		option.selectByVisibleText(text);
	}

}
