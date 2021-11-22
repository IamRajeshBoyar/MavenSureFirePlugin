package downloadFileToSpecificFolder;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\MavenProjectMain\\Drivers\\chromedriver.exe");
		
		HashMap prference = new HashMap();
		
		prference.put("download.default_directory", "C:\\Users\\Admin\\Desktop\\downloads\\");
		
		ChromeOptions option = new ChromeOptions();
		option.setExperimentalOption("prefs", prference);
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//a[text()='Download sample DOC file'])[1]")).click();
		
		Thread.sleep(10000);
	}

}
