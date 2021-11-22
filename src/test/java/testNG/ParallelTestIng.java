package testNG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTestIng {

		@Test
		public void amazon() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\MavenProjectMain\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458712209&hvpos=&hvnetw=g&hvrand=8715039165056956607&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302922&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=CjwKCAiAs92MBhAXEiwAXTi25xqVmD9S4D_Kwa0i9jOI3qH-jyY47XyDiyD4mE7XjMw2bV1NsMSBGhoCL0sQAvD_BwE");
			
		}
		@Test
		public void facebook() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\MavenProjectMain\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
		}
		

}
