package dataDrivenTesting;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample1 {
	public WebDriver driver;
	
	String[][] loginData = null;
	
	@DataProvider(name = "loginDetails")
	public String[][] logindata1() throws IOException {
		loginData = getExcelData();
		
		return loginData;
	}
	
	public String[][] getExcelData() throws IOException{
		FileInputStream excel = new FileInputStream("C:\\Users\\Admin\\Desktop\\demo.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(excel);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		int row = sheet.getLastRowNum();
		int cell = sheet.getRow(0).getLastCellNum();
		
		String testData[][] = new String[row][cell];
		
		for(int i=1; i<row; i++) {
			for(int j=0; j<cell; j++) {
				testData[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return testData;
		
	}
	
	@Test(dataProvider = "loginDetails")
	public void loginDetails(String username, String password) {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Admin\\eclipse-workspace\\MavenProjectMain\\Drivers\\chromedriver.exe"
		 * ); driver = new ChromeDriver();
		 * driver.get("https://opensource-demo.orangehrmlive.com/");
		 * driver.findElement(By.id("txtUsername")).sendKeys(username);
		 * driver.findElement(By.id("txtPassword")).sendKeys(password);
		 * driver.findElement(By.id("btnLogin")).click();
		 */
		
		System.out.println(username+" "+password);
	}

}
