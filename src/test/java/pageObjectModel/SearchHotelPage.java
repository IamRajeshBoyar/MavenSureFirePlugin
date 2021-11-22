package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage {
	
	WebDriver driver;
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement room_type;
	
	@FindBy(id="room_nos")
	private WebElement numberOfRooms;
	
	@FindBy(id="datepick_in")
	private WebElement checkIn;
	
	@FindBy(id="datepick_out")
	private WebElement checkOut;

	@FindBy(id="adult_room")
	private WebElement adultRoom;
	
	@FindBy(id="child_room")
	private WebElement childRoom;
	
	@FindBy(id="Submit")
	private WebElement submitButton;
	
	
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotel() {
		return hotel;
	}
	
	public WebElement getRoomType() {
		return room_type;
	}
	
	public WebElement getNUmberOfRooms() {
		return numberOfRooms;
	}
	public WebElement getCheckIn() {
		return checkIn;
	}
	
	public WebElement getCheckOut() {
		return checkOut;
	}
	
	public WebElement getAdultRoom() {
		return adultRoom;
	}
	public WebElement getChildRoom() {
		return childRoom;
	}
	public WebElement getSubmitButton() {
		return submitButton;
	}
	
	public SearchHotelPage(WebDriver d) {
		driver = d;
		PageFactory.initElements(driver, this);
	}
	
}
