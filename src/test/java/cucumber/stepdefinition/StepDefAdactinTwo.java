package cucumber.stepdefinition;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseclass.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PageObjectManager;

public class StepDefAdactinTwo extends Baseclass {

	WebDriver driver;
	PageObjectManager page = new PageObjectManager();
	String value;
	
	
	
	@Given("User should launch the adactin hotel webpage")
	public void user_should_launch_the_adactin_hotel_webpage() {
		browserSetup("chrome");
		maximize();
		launch("http://adactinhotelapp.com/index.php");
	}
	@When("User should login with {string} and {string}")
	public void user_should_login_with_and(String string, String string2) {
		inputText(page.getAdactin().getUsername(), string);
		inputText(page.getAdactin().getPassword(), string2);
	}
	@When("User should click login and navigate to home page")
	public void user_should_click_login_and_navigate_to_home_page() {
		clickOn(page.getAdactin().getBtnlogin());  
	}

	@Given("User Should select {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string}")
	public void user_should_select_and_and_and_and_and_and_and(String location, String hotel, String room_type,
			String no_of_rooms, String check_in_date, String check_out_date, String no_of_adults,
			String no_of_children) {
		selectByValue(page.getAdactin().getLocation(), location);
		selectByValue(page.getAdactin().getHotels(), hotel);
		selectByValue(page.getAdactin().getRoom_type(), room_type);
		selectByVisibleText(page.getAdactin().getRoom_nos(), no_of_rooms);
		clearText(page.getAdactin().getDatepick_in());
		inputText(page.getAdactin().getDatepick_in(), check_in_date);
		clearText(page.getAdactin().getDatepick_out());
		inputText(page.getAdactin().getDatepick_out(), check_out_date);
		selectByVisibleText(page.getAdactin().getAdult_room(), no_of_adults);
		selectByVisibleText(page.getAdactin().getChild_room(), no_of_children);
	}

	@When("User should click search button and navigate to select hotel page")
	public void user_should_click_search_button_and_navigate_to_select_hotel_page() {
		clickOn(page.getAdactin().getSearch());
	}

	@Then("User should select the hotel and click on continue button and navigate to book a hotel page")
	public void user_should_select_the_hotel_and_click_on_continue_button_and_navigate_to_book_a_hotel_page() {
		clickOn(page.getAdactin().getRadiobutton());
		clickOn(page.getAdactin().getSubmit());
	}

	@Given("User should select the {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string}")
	public void user_should_select_the_and_and_and_and_and_and_and(String firstName, String lastName, String address,
			String creditCardNo, String creditCardType, String expiryDate_Month, String expiryDate_Year, String cvvNumber) {
			inputText(page.getAdactin().getFirst_name(), firstName);                            
			inputText(page.getAdactin().getLast_name(), lastName);
			inputText(page.getAdactin().getAddress(), address);
			inputText(page.getAdactin().getCc_num(), creditCardNo);
			selectByValue(page.getAdactin().getCc_type(), creditCardType);
			selectByVisibleText(page.getAdactin().getCc_exp_month(), expiryDate_Month);
			selectByVisibleText(page.getAdactin().getCc_exp_year(), expiryDate_Year);
			inputText(page.getAdactin().getCc_cvv(), cvvNumber);
	}

	@When("User should click on book now button and navigate to booking confirmation page")
	public void user_should_click_on_book_now_button_and_navigate_to_booking_confirmation_page() {
			clickOn(page.getAdactin().getBook_now());
	}

	@When("User should click on my itenary button and navigate to booked itenary page")
	public void user_should_click_on_my_itenary_button_and_navigate_to_booked_itenary_page() throws InterruptedException {
		Thread.sleep(7000);
		WebElement text = getTexts(page.getAdactin().getOrder_no());
		 value = text.getAttribute("value");
		clickOn(page.getAdactin().getMy_itinerary());
	}

	@Then("User should enter the order id in search order id input box and click on go button and user should able to see the selected order id with booked info")
	public void user_should_enter_the_order_id_in_search_order_id_input_box_and_click_on_go_button_and_user_should_able_to_see_the_selected_order_id_with_booked_info() throws InterruptedException {
		inputText(page.getAdactin().getOrder_id_text(), value);
		clickOn(page.getAdactin().getSearch_hotel_id());
		clickOn(page.getAdactin().getCheckbox());
		clickOn(page.getAdactin().getCancel_Selected());
		Thread.sleep(2000);
		alertok();
		clickOn(page.getAdactin().getLogout());
		implicitWait(3000);
		close();
		
	}

}
