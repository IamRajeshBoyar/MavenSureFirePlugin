package pageObjectModel2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumBase1 {
	public static WebDriver driver;
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\MavenProjectMain\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	
	public static void inputValues(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}
	public static void dropDown(WebElement element, int index) {
		Select option = new Select(element);
		option.selectByIndex(index);
	}

}
