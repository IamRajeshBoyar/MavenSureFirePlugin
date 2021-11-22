package normalSeleniumPractice;

import java.util.HashMap;


import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;


public class FileDownLoadSpecificFolder {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxProfile profile =new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/msword");
		profile.setPreference("browser.download.folderList", 2);
		profile.setPreference("browser.download.dir", "location");
	
		FirefoxOptions option = new FirefoxOptions();
		option.setProfile(profile);
	}
	
	
}
