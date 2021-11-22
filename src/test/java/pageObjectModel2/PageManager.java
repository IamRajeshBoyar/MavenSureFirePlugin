package pageObjectModel2;

import org.openqa.selenium.WebDriver;

public class PageManager {
	
	WebDriver driver;

	private BookHotelPage bookHotelPgae;
	private SelectHotelPage selectHotelPage;
	private SearchHotelPage searchHotelPage;
	private LoginPage loginPage;
	
	
	public BookHotelPage getBookHotelPgae() {
		bookHotelPgae = new BookHotelPage(driver);
		return bookHotelPgae;
	}
	public SelectHotelPage getSelectHotelPage() {
		selectHotelPage = new SelectHotelPage(driver);
		return selectHotelPage;
	}
	public SearchHotelPage getSearchHotelPage() {
		searchHotelPage = new SearchHotelPage(driver);
		return searchHotelPage;
	}
	public LoginPage getLoginPage() {
		loginPage = new LoginPage(driver);
		return loginPage;
	}
	public PageManager(WebDriver d) {
		driver = d;
	}
}
