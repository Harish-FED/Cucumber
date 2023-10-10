package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Baseclass;

public class Adactin extends Baseclass {
	

	
	public Adactin() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@id ='username']")
	private static WebElement username;
	
	@FindBy(xpath = "//input[@id ='password']")
	private static WebElement password;
	
	@FindBy(xpath ="//input[@id ='login']")
	private static WebElement btnlogin;

	@FindBy(xpath ="//select[@id='location']")
	private static WebElement location;
	
	@FindBy(xpath ="//select[@id='hotels']")
	private static WebElement hotels;
	
	@FindBy(xpath ="//select[@id='room_type']")
	private static WebElement room_type;
	
	@FindBy(xpath ="//select[@id='room_nos']")
	private static WebElement room_nos;
	
	@FindBy(xpath ="//input[@id='datepick_in']")
	private static WebElement datepick_in;
	
	@FindBy(xpath ="//input[@id='datepick_out']")
	private static WebElement datepick_out;
	
	@FindBy(xpath ="//select[@id='adult_room']")
	private static WebElement adult_room;
	
	@FindBy(xpath ="//select[@id='child_room']")
	private static WebElement child_room;
	
	@FindBy(xpath ="//input[@id='Submit']")
	private static WebElement Search;
	
	@FindBy(xpath ="//input[@id='radiobutton_0']")
	private static WebElement radiobutton;
	
	@FindBy(xpath ="//input[@id='continue']")
	private static WebElement Submit;
	
	@FindBy(xpath ="//input[@id='first_name']")
	private static WebElement first_name;
	
	@FindBy(xpath ="//input[@id='last_name']")
	private static WebElement last_name;
	
	@FindBy(xpath ="//textarea[@id='address']")
	private static WebElement address;
	
	@FindBy(xpath ="//input[@id='cc_num']")
	private static WebElement cc_num;
	
	@FindBy(xpath ="//select[@id='cc_type']")
	private static WebElement cc_type;
	
	@FindBy(xpath ="//select[@id='cc_exp_month']")
	private static WebElement cc_exp_month;
	
	@FindBy(xpath ="//select[@id='cc_exp_year']")
	private static WebElement cc_exp_year;
	
	@FindBy(xpath ="//input[@id='cc_cvv']")
	private static WebElement cc_cvv;
	
	@FindBy(xpath ="//input[@id='book_now']")
	private static WebElement book_now;
	
	@FindBy(xpath ="//input[@id='order_no']")
	private static WebElement order_no;

	@FindBy(xpath ="//input[@id='my_itinerary']")
	private static WebElement my_itinerary;
	
	@FindBy(xpath ="//input[@id='order_id_text']")
	private static WebElement order_id_text;
	
	@FindBy(xpath ="//input[@id='search_hotel_id']")
	private static WebElement search_hotel_id;
	
	@FindBy(xpath ="(//input[@type='checkbox'])[2]")
	private static WebElement checkbox;
	
	@FindBy(xpath ="//input[@value='Cancel Selected']")
	private static WebElement Cancel_Selected;
	
	@FindBy(xpath = "//input[@id='logout']")
	private static WebElement logout;


	public static WebElement getUsername() {
		return username;
	}

	public static WebElement getPassword() {
		return password;
	}

	public static WebElement getBtnlogin() {
		return btnlogin;
	}

	public static WebElement getLocation() {
		return location;
	}

	public static WebElement getHotels() {
		return hotels;
	}

	public static WebElement getRoom_type() {
		return room_type;
	}

	public static WebElement getRoom_nos() {
		return room_nos;
	}

	public static WebElement getDatepick_in() {
		return datepick_in;
	}

	public static WebElement getDatepick_out() {
		return datepick_out;
	}

	public static WebElement getAdult_room() {
		return adult_room;
	}

	public static WebElement getChild_room() {
		return child_room;
	}

	public static WebElement getSearch() {
		return Search;
	}

	public static WebElement getRadiobutton() {
		return radiobutton;
	}

	public static WebElement getSubmit() {
		return Submit;
	}

	public static WebElement getFirst_name() {
		return first_name;
	}

	public static WebElement getLast_name() {
		return last_name;
	}

	public static WebElement getAddress() {
		return address;
	}

	public static WebElement getCc_num() {
		return cc_num;
	}

	public static WebElement getCc_type() {
		return cc_type;
	}

	public static WebElement getCc_exp_month() {
		return cc_exp_month;
	}

	public static WebElement getCc_exp_year() {
		return cc_exp_year;
	}

	public static WebElement getCc_cvv() {
		return cc_cvv;
	}

	public static WebElement getBook_now() {
		return book_now;
	}
	
	public static WebElement getOrder_no() {
		return order_no;
	}

	public static WebElement getMy_itinerary() {
		return my_itinerary;
	}

	public static WebElement getOrder_id_text() {
		return order_id_text;
	}

	public static WebElement getSearch_hotel_id() {
		return search_hotel_id;
	}
	
	public static WebElement getCheckbox() {
		return checkbox;
	}

	public static WebElement getCancel_Selected() {
		return Cancel_Selected;
	}

	public static WebElement getLogout() {
		return logout;
	}
	
}
