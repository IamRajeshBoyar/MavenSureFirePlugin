package testNGpracticeAdactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckOutCheckInDateVerify extends TestNgBaseClass{
	
	@Test
	public void verifyCheckinOut() {
		driver.get("http://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys("QARajesh");
		driver.findElement(By.id("password")).sendKeys("Speeds@123");
		driver.findElement(By.id("login")).click();
		
		WebElement location = driver.findElement(By.id("location"));
		Select option = new Select(location);
		option.selectByValue("Sydney");
		
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select option1 = new Select(hotel);
		option1.selectByValue("Hotel Creek");
		
		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select option2 = new Select(roomtype);
		option2.selectByValue("Standard");
		
		
		WebElement numberOfRooms = driver.findElement(By.id("room_nos"));
		Select option3 = new Select(numberOfRooms);
		option3.selectByValue("1");
		
		WebElement checkIn = driver.findElement(By.id("datepick_in"));
		
		checkIn.clear();
		checkIn.sendKeys("26/11/2021");
		
		WebElement checkout = driver.findElement(By.id("datepick_out"));
		checkout.clear();
		checkout.sendKeys("24/11/2021");
		
		driver.findElement(By.id("Submit")).submit();
		
		String error = driver.findElement(By.xpath("//span[@id='checkin_span']")).getText();
		
		Assert.assertEquals(error, "Check-In Date shall be before than Check-Out Date");
		
	}

}
