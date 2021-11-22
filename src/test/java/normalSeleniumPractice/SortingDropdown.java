package normalSeleniumPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortingDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\MavenProjectMain\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.twoplugs.com/");
		
		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
		
		WebElement drop = driver.findElement(By.xpath("//select[@name='category_id']"));
		
		Select option = new Select(drop);
		
		List<WebElement> dropdownlist = option.getOptions();
		System.out.println(dropdownlist.size());
		
		ArrayList drop1 = new ArrayList();
		
		ArrayList drop2 = new ArrayList();
		
		for(WebElement element: dropdownlist) {
			
			drop1.add(element.getText());
			drop2.add(element.getText());
			
		}
		
		System.out.println(drop1);
		Collections.sort(drop2);
		System.out.println(drop2);
		
		if(drop1.equals(drop2)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}

}
