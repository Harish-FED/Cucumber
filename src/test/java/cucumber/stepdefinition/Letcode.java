package cucumber.stepdefinition;

import baseclass.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PageObjectManager;

public class Letcode extends Baseclass {
	
	PageObjectManager page = new PageObjectManager();
	
	@Given("User should launch website")
	public void user_should_launch_website() {
		browserSetup("chrome");
		maximize();
	    launch("https://letcode.in/forms");
	}

	@When("User should fill the form")
	public void user_should_fill_the_form() throws InterruptedException {
		inputText(page.getLetcode().getFistname(), "Harish");
		inputText(page.getLetcode().getLastname(), "K");
		clearText(page.getLetcode().getEmail());
		inputText(page.getLetcode().getEmail(),"hk770689@gmail.com");
	    selectByValue(page.getLetcode().getCode(), "91");
	    inputText(page.getLetcode().getPhone(), "9653478231");
	    inputText(page.getLetcode().getAddress(), "B2-/45, 2nd Main road");
	    inputText(page.getLetcode().getAddress_2(), "Urapakkam");
	    inputText(page.getLetcode().getState(), "Tamil Nadu");
	    inputText(page.getLetcode().getPostalcode(), "603210");
	    selectByValue(page.getLetcode().getCountry(), "India");
	    inputText(page.getLetcode().getDate(), "07-08-2023");
	    clickOn(page.getLetcode().getMale());
	    clickOn(page.getLetcode().getTerms());
	    clickOn(page.getLetcode().getSubmit());
	    
	}

	@Then("User should submit the form")
	public void user_should_submit_the_form() {
	   close();
	}


}
