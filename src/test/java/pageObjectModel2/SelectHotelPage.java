package pageObjectModel2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage {
	
	WebDriver driver;

	@FindBy(id="radiobutton_0")
	private WebElement radioButton;
	
	@FindBy(id="continue")
	private WebElement continueButton;

	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}
	
	public SelectHotelPage(WebDriver d) {
		
		driver = d;
		PageFactory.initElements(driver, this);
	}
	
	
}
