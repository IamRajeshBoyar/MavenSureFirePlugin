package normalSeleniumPractice;

import org.apache.commons.math3.ode.events.EventHandler;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class WebDriverListenerExample2 {
	
	
	public static void main(String args[]) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\MavenProjectMain\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);
		
		
		
		
	}

}
