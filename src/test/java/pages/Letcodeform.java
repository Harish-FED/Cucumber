package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Baseclass;

public class Letcodeform extends Baseclass {

	
	public Letcodeform() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@id='firstname']")
	private static WebElement fistname;
	
	@FindBy(xpath="//input[@id='lasttname']")
	private static WebElement lastname;
	
	@FindBy(xpath="//input[@id='email']")
	private static WebElement email;
	
	@FindBy(xpath="(//div[@class='control'])[4]//child::select")
	private static WebElement code;
	
	@FindBy(xpath="//input[@id='Phno']")
	private static WebElement phone;
	
	@FindBy(xpath="//input[@id='Addl1']")
	private static WebElement address;
	
	@FindBy(xpath="//input[@id='Addl2']")
	private static WebElement address_2;
	
	@FindBy(xpath="//input[@id='state']")
	private static WebElement state;
	
	@FindBy(xpath="//input[@id='postalcode']")
	private static WebElement postalcode;
	
	@FindBy(xpath="(//div[@class='control'])[10]//child::select")
	private static WebElement country;
	
	@FindBy(xpath="//input[@id='Date']")
	private static WebElement date;
	
	@FindBy(xpath="//input[@id='male']")
	private static WebElement male;
	
	@FindBy(xpath="//label[@class='checkbox']//child::input")
	private static WebElement terms;
	
	@FindBy(xpath="//input[@type='submit']")
	private static WebElement submit;
	
//Getters
	
	public static WebElement getFistname() {
		return fistname;
	}

	public static WebElement getLastname() {
		return lastname;
	}

	public static WebElement getEmail() {
		return email;
	}
	
	public static WebElement getCode() {
		return code;
	}

	public static WebElement getPhone() {
		return phone;
	}

	public static WebElement getAddress() {
		return address;
	}

	public static WebElement getAddress_2() {
		return address_2;
	}

	public static WebElement getState() {
		return state;
	}

	public static WebElement getPostalcode() {
		return postalcode;
	}

	public static WebElement getCountry() {
		return country;
	}

	public static WebElement getDate() {
		return date;
	}

	public static WebElement getMale() {
		return male;
	}

	public static WebElement getTerms() {
		return terms;
	}

	public static WebElement getSubmit() {
		return submit;
	}
	
}
