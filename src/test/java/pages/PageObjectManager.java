package pages;

import cucumber.stepdefinition.Letcode;

public class PageObjectManager {
	
	Adactin adactin;
	Letcodeform letcode;
	
	public Adactin getAdactin() {
		return (adactin == null) ? adactin = new Adactin() : adactin;
		
	}
	
	public Letcodeform getLetcode() {
		return (letcode == null) ? letcode = new Letcodeform(): letcode;
	}
	
	
	
	

	public static void main(String[] args) {

		
	}

}
