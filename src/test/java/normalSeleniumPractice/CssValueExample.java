package normalSeleniumPractice;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class CssValueExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\MavenProjectMain\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/appear.html");
		
		
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		
		WebElement hidden = wait.until(new Function<WebDriver, WebElement>() {

		public WebElement apply(WebDriver t) {
			return driver.findElement(By.xpath("//button[@id='btn']"));
		}	
		});
		
		String text= hidden.getAttribute("innerHTML");
		System.out.println(text+" inner html is");
	}

}
