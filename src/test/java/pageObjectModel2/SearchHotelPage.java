package pageObjectModel2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage {

	WebDriver driver;
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement roomType;
	
	@FindBy(id="room_nos")
	private WebElement numberOfrooms;
	
	@FindBy(id="datepick_in")
	private WebElement checkIN;
	
	@FindBy(id="datepick_out")
	private WebElement checkOut;
	
	@FindBy(id="adult_room")
	private WebElement adult_room;
	
	@FindBy(id="child_room")
	private WebElement child_room;
	
	@FindBy(id="Submit")
	private WebElement Submit;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNumberOfrooms() {
		return numberOfrooms;
	}

	public WebElement getCheckIN() {
		return checkIN;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getAdult_room() {
		return adult_room;
	}

	public WebElement getChild_room() {
		return child_room;
	}

	public WebElement getSubmit() {
		return Submit;
	}
	
	public SearchHotelPage(WebDriver d) {
		driver = d;
		PageFactory.initElements(driver, this);
	}
}
