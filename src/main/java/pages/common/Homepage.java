package pages.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.data.AutoData;

import static common.CommonActions.*;


public class Homepage {
	WebDriver driver;
	
	public Homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//select[@id='customSelectQuote']")
	WebElement dropdownElement;
	@FindBy(xpath = "//input[@id='detail-banner__zip-input']")
	WebElement zipcodeElement;
	@FindBy(id ="detail-banner__quote-btn")
	WebElement startYourQuoteElement;
	
	public void selectAuto(String dropDown) {
		selectDropdown(dropdownElement, dropDown);
	}
	
	public void inputZip(String zipcode) {
		input(zipcodeElement, zipcode);
		}
	
	public void clickStartElement () {
		click(startYourQuoteElement);
		
	}
	
	public void autoSteps(String dropdown, String zipcode) { 
		selectDropdown(dropdownElement, dropdown);
		input(zipcodeElement, zipcode);
		click(startYourQuoteElement);

		
		
		
	}
	
}
