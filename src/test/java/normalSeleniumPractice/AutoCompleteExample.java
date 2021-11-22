package normalSeleniumPractice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;



public class AutoCompleteExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\MavenProjectMain\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/TextChange.html");
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);

		WebElement button = wait.until(new Function<WebDriver, WebElement>(){

			@Override
			public WebElement apply(WebDriver t) {
				
				return t.findElement(By.xpath("//button[contains(text(),'Click ME!')]"));
			}
			
		});
		
		button.click();
		
		Alert verify = driver.switchTo().alert();
		String text = verify.getText();
		
		System.out.println(text);
		
		verify.accept();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("")))).click();
		
		Wait<WebDriver> wait2 = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(10)).ignoring(NoSuchElementException.class);
	
		
		WebElement textbox1 = wait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver t) {
				return t.findElement(By.xpath(""));
			}
			
			
		});
		
		textbox1.click();
	
	}
	

}
