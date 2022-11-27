package pages.Auto;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.data.AutoData;

import static common.CommonActions.*;

public class AboutYou {
	WebDriver driver;
	public AboutYou(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = "gs-first-name")
	WebElement firstNamElement;
	@FindBy(id = "gs-middle-name")
	WebElement middleNamElement;
	@FindBy(id = "gs-last-name")
	WebElement lastNamElement;
	@FindBy(id = "gs-suffix")
	WebElement suffixElement;
	@FindBy(id = "nav-continue")
	WebElement agreeElement;
	
	public void inPutfirstName (String firstName) {
		input(firstNamElement, firstName);
	}
	
	public void inputMiddleInitial (String middleInitial) {
		input(middleNamElement, middleInitial);
	}
	
	public void inputLastName(String lastName) {
		input(lastNamElement, lastName);
	}
	
	public void suffixElement(String suffix) {
		selectDropdown(suffixElement, suffix);
	}
	
	public void clickContinue() {
		((JavascriptExecutor)driver).executeScript("document.getElementById('nav-continue').click();");
		
	}
	public void aboutYouSteps(String firstName, String middleInitial, String lastName, String suffix) {
		input(firstNamElement, firstName);
		input(middleNamElement, middleInitial);
		input(lastNamElement, lastName);
		selectDropdown(suffixElement, suffix);
		//click(agreeElement);
		
	}
	
	}
