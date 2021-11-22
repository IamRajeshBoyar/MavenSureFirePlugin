import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(ItestListenerExample.class)
public class TakeScreenshotDynamically extends BaseClassTest{
	
	Object[][] data = null;
	
	public Object[][] readExcel() throws IOException {
		
		FileInputStream excel = new FileInputStream("C:\\Users\\Admin\\Desktop\\demo.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(excel);
		XSSFSheet sheet= workbook.getSheetAt(0);
		int row = sheet.getLastRowNum();
		int cell = sheet.getRow(0).getLastCellNum();
		Object[][] data1 = new Object[row][cell];
		
		for(int i=0; i<row; i++) {	
			for(int j=0; j<cell; j++) {
				data1[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			}
			
		}
		
		return data1;
		
	}
	
	@DataProvider(name="loginData")
	public Object[][] passData() throws IOException{
		data = readExcel();
		
		return data;
	}
	
	
	@Test(dataProvider = "loginData")
	public void testLogin(String username, String password) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\MavenProjectMain\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		
		String actual = driver.getCurrentUrl();
		String expected = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		
		Assert.assertEquals(actual, expected);
	}
	

}
