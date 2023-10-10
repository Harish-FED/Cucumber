package cucumber.stepdefinition;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseclass.Baseclass;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Adactin;
import pages.PageObjectManager;

public class StepDefAdactin extends Baseclass {
	WebDriver driver;
	Adactin ad;
	PageObjectManager page = new PageObjectManager();
	
	
	
	@Given("print the current time")
	public void printTime() {
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	   LocalDateTime now = LocalDateTime.now();
		
		System.out.println("Cuurent time " + df.format(now));
	}
	
	@Given("User should able to login and navigate to search hotel page")
	public void user_should_able_to_login_and_navigate_to_search_hotel_page() throws InterruptedException, IOException {
	    browserSetup("chrome");
	    maximize();
	    launch("http://adactinhotelapp.com/index.php");
	    inputText(page.getAdactin().getUsername(), getExcelValue("Sheet2", 1, 1));
	    inputText(page.getAdactin().getPassword(), getExcelValue("Sheet2", 1, 2));
	    clickOn(page.getAdactin().getBtnlogin());   
	}

	@When("User should able to search and select hotel")
	public void user_should_able_to_search_and_select_hotel() throws IOException, InterruptedException {
		selectByValue(page.getAdactin().getLocation(), getExcelValue("Sheet2", 1, 3));
		selectByValue(page.getAdactin().getHotels(), getExcelValue("Sheet2", 1, 4));
		selectByValue(page.getAdactin().getRoom_type(), getExcelValue("Sheet2", 1, 5));
		selectByVisibleText(page.getAdactin().getRoom_nos(), getExcelValue("Sheet2", 1, 6));
//		clearText(getLocator("id", "datepick_in"));
		inputText(page.getAdactin().getDatepick_in(), "09/06/2023");
//		clearText(getLocator("id", "datepick_out"));
		inputText(page.getAdactin().getDatepick_out(), "12/06/2023");
		selectByVisibleText(page.getAdactin().getAdult_room(), getExcelValue("Sheet2", 1, 7));
		selectByVisibleText(page.getAdactin().getChild_room(), getExcelValue("Sheet2", 1, 8));
		clickOn(page.getAdactin().getSearch());
		clickOn(page.getAdactin().getRadiobutton());
		clickOn(page.getAdactin().getSubmit());
	}

	@When("User should book a hotel")
	public void user_should_book_a_hotel() throws IOException, InterruptedException {
		inputText(page.getAdactin().getFirst_name(), getExcelValue("Sheet1", 1, 1));                            
		inputText(page.getAdactin().getLast_name(), getExcelValue("Sheet1", 1, 2));
		inputText(page.getAdactin().getAddress(), getExcelValue("Sheet1", 1, 7));
		inputText(page.getAdactin().getCc_num(), "4691234573459720");
		selectByValue(page.getAdactin().getCc_type(), getExcelValue("Sheet1", 1, 9));
		selectByVisibleText(page.getAdactin().getCc_exp_month(), getExcelValue("Sheet1", 1, 10));
		selectByVisibleText(page.getAdactin().getCc_exp_year(), "2026");
		inputText(page.getAdactin().getCc_cvv(), "384");
		clickOn(page.getAdactin().getBook_now());
	}

	@Then("User should able to see the confirmation of the booked hotel")
	public void user_should_able_to_see_the_confirmation_of_the_booked_hotel() throws InterruptedException {
		Thread.sleep(5000);
		WebElement text = getTexts(page.getAdactin().getOrder_no());
		String value = text.getAttribute("value");
		clickOn(page.getAdactin().getMy_itinerary());
		inputText(page.getAdactin().getOrder_id_text(), value);
		clickOn(page.getAdactin().getSearch_hotel_id());
		clickOn(page.getAdactin().getCheckbox());
		clickOn(page.getAdactin().getCancel_Selected());
		Thread.sleep(2000);
		alertok();
	}

}
