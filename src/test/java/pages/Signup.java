package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Baseclass;

public class Signup extends Baseclass {
	
	static WebDriver driver;
	
	public Signup(WebDriver driver) {
		PageFactory.initElements(driver, this);
		Signup.driver = driver;
		
	}
	
	@FindBy(xpath="//input[@name='email']")
	private static WebElement username;
	@FindBy(xpath="//input[@name='pass']")
	private static WebElement password;
	@FindBy(xpath="//button[@name='login']")
	private static WebElement btnLogin;
	
	public static  WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}

//	 public void login() {
//		 driver = browserSetup("edge");
//			maximize();
//			launch("https://www.facebook.com/");
//			inputText(getUsername(),username);
//			inputText(getPassword(),password);
//	 }

	

}
