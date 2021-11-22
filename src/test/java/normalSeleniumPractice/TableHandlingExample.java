package normalSeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandlingExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\MavenProjectMain\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		List<WebElement> rowData = driver.findElements(By.xpath("//table/tbody/tr"));
		
		List<WebElement> columnData = driver.findElements(By.xpath("//table/thead/tr/th"));
		
		int max = 0;
		int maxcount = 0;
		for(int row = 1; row < 5; row++) {	
			//for(int column = 1; column < 7; column++) {
				String text = driver.findElement(By.xpath("//table/tbody/tr["+row+"]/td[4]")).getText();
				int value = Integer.parseInt(text);
				
				if(max < value) {
					max = value;
					maxcount = row;
				}
				
			//}
		}
		System.out.println(max);
		System.out.println(maxcount);
		
		String text = driver.findElement(By.xpath("//table/tbody/tr["+maxcount+"]/td[5]")).getText();
		System.out.println(text);
	}

}
