package normalSeleniumPractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\MavenProjectMain\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//scroll bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	}

}
