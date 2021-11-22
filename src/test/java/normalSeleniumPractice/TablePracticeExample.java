package normalSeleniumPractice;

import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TablePracticeExample {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\MavenProjectMain\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		textBoxEnable();
	
	}
	public static void handleAuthorisationPopUp() {
		//pass the username and password in the url
		
		//original url = http://the-internet.herokuapp.com/basic_auth
		//after adding username and password (username : admin password: admin)
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	}
	public static void brokenImage() {
		driver.get("http://the-internet.herokuapp.com/broken_images");
		List<WebElement> all_images = driver.findElements(By.xpath("//img"));
		
		for(WebElement images: all_images) {
			String text = images.getAttribute("naturalWidth");
			System.out.println(text);
		}
	}
	public static void checkbox() {
		driver.get("http://the-internet.herokuapp.com/checkboxes");
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement single_checkbox:checkbox) {
			if(single_checkbox.isSelected()) {
				
			}else {
				single_checkbox.click();
			}
		}
	}
	
	public static void contextClick() {
		driver.get("http://the-internet.herokuapp.com/context_menu");
		Actions action = new Actions(driver);
		action.contextClick(driver.findElement(By.xpath("//div[@id='hot-spot']"))).build().perform();
	}
	
	public static void disappearingElement() {
		driver.get("http://the-internet.herokuapp.com/disappearing_elements");
		try {
			System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Gallery')]")));
		}
		catch(Exception e) {
			System.out.println("element not available");
		}
	}
	
	public static void dragAndDrop() {
		driver.get("http://the-internet.herokuapp.com/drag_and_drop");
		Actions action = new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath("//div[@id='column-a']"))).moveToElement(driver.findElement(By.xpath("//div[@id='column-b']"))).release().build().perform();
	
	}
	
	public static void dropdown() {
			driver.get("http://the-internet.herokuapp.com/dropdown");
			WebElement dropdown = driver.findElement(By.xpath("//select"));
			
			Select droplist = new Select(dropdown);
			
			droplist.selectByIndex(1);
		
			System.out.println("checking whether it is multiple dropdwon? "+droplist.isMultiple());
			
	}
	
	public static void textBoxEnable() {
		driver.get("http://the-internet.herokuapp.com/dynamic_controls");
		System.out.println("is textbox enabled or not "+driver.findElement(By.xpath("//input[@type='text']")).isEnabled());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].removeAttribute('disabled')", driver.findElement(By.xpath("//input[@type='text']")));
		System.out.println("is textbox enabled or not "+driver.findElement(By.xpath("//input[@type='text']")).isEnabled());
	}

}
