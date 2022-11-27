package steps;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import reporting.Logs;

public class AutoSteps extends BaseClass{
	
	@Given("User navigate to homepage")
	public void user_navigate_to_homepage() {
	    Logs.log("Before hook");
	}

	@When("User select Auto insurance")
	public void user_select_auto_insurance() {
	    homepage.selectAuto("personalAuto");
	}

	@When("User input zipcode")
	public void user_input_zipcode() {
		homepage.inputZip("11373");
	   
	}

	@When("User click on Start your quote")
	public void user_click_on_start_your_quote() {
		homepage.clickStartElement();
	    
	}

	@Then("User will be in AboutYou page")
	public void user_will_be_in_about_you_page() {
		Logs.log(getDriver().getCurrentUrl());
	   
	}

	@When("User input first name")
	public void user_input_first_name() {
		aboutYou.inPutfirstName("Kante");
	   
	}

	@When("User input middle initial")
	public void user_input_middle_initial() {
		aboutYou.inputMiddleInitial("S");
	
	}

	@When("User input last name")
	public void user_input_last_name() {
		aboutYou.inputLastName("Giroud");

	}

	@Then("User select suffix name")
	public void user_select_suffix_name() {
		aboutYou.suffixElement("6: c_IV");
	   
	}

	@Then("User able to complete their info")
	public void  User_able_to_complete_their_info() {
	  Logs.log("User completed their info");
	}
	

	@When("Homepage steps done")
	public void homepage_steps_done() {
		homepage.autoSteps("personalAuto", "11373");
	}
	
	@Then("Aboutyou page steps done")
	public void aboutyou_page_steps_done() {
	 aboutYou.aboutYouSteps("Kante", "S", "Giroud","6: c_IV");
	}

	
	






}
