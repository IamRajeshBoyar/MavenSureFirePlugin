package pageObjectModel;

public class AdacitinTest extends SeleniumBase{

	public static void main(String[] args) {
		browserLaunch("https://adactinhotelapp.com/index.php");
		LoginPage loginpageObject = new LoginPage(driver);
		inputValues(loginpageObject.getUsername(), "QARajesh");
		inputValues(loginpageObject.getPassword(),"Speeds@123");
		click(loginpageObject.getLoginButton());
		
		SearchHotelPage searchHotelObject = new SearchHotelPage(driver);
		dropDown(searchHotelObject.getLocation(), "Melbourne");
		dropDown(searchHotelObject.getHotel(), "Hotel Sunshine");
		dropDown(searchHotelObject.getRoomType(), "Super Deluxe");
		dropDown(searchHotelObject.getNUmberOfRooms(),"8 - Eight");
		inputValues(searchHotelObject.getCheckIn(), "10/12/2021");
		inputValues(searchHotelObject.getCheckOut(), "20/12/2021");
		dropDown(searchHotelObject.getAdultRoom(), "3 - Three");
		dropDown(searchHotelObject.getChildRoom(),"4 - Four");
		click(searchHotelObject.getSubmitButton());
		
		SelectHotelPage selectPageObject = new SelectHotelPage(driver);
		
		click(selectPageObject.getRadioButton());
		click(selectPageObject.getContinueButton());
		
		BookHotelPage bookHotelObject = new BookHotelPage(driver);
		
		inputValues(bookHotelObject.getFirstname(), "demoFirstname");
		inputValues(bookHotelObject.getLastname(), "demoLastname");
		inputValues(bookHotelObject.getAddress(), "demoAddress");
		inputValues(bookHotelObject.getCreditCardNumber(), "4345678900345678");
		dropDown(bookHotelObject.getCreditCardType(), "VISA");
		dropDown(bookHotelObject.getExpiryDate(), "May");
		dropDown(bookHotelObject.getExpiryYear(), "2014");
		inputValues(bookHotelObject.getCvNumber(), "345");
		click(bookHotelObject.getBookNowButton());
	}

}
