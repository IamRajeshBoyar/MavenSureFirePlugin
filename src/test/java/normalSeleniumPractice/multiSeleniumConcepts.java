package normalSeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiSeleniumConcepts{
	
	public static WebDriver driver;
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\MavenProjectMain\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		brokenImage();
	}
	public static void brokenImage() {
		//image 3 is a broken link because natural width for image is 0
		driver.get("http://www.leafground.com/pages/Image.html");
		List<WebElement> images = driver.findElements(By.xpath("//img"));
		
		for(int i=0; i<images.size(); i++) {
			String width = images.get(i).getAttribute("naturalWidth");
			System.out.println("natural width for image "+i+" is "+width);
		}
	}

}
