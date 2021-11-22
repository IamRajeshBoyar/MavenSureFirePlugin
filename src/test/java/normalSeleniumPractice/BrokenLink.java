package normalSeleniumPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\MavenProjectMain\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		
		for(WebElement element: list) {
			
			String url = element.getAttribute("href");
			
			URL urlConnect = new URL(url);
			HttpURLConnection httpconnect = (HttpURLConnection) urlConnect.openConnection();
			httpconnect.connect();
			
			if(httpconnect.getResponseCode() > 400) {
				System.out.println(url+ " is a broken link");
			}
			
		}
		
		
	}

}
