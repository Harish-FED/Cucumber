package baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public static WebDriver driver;
	
	public static WebDriver browserSetup(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			//ChromeOptions co = new ChromeOptions();
			//co.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("safari")) {
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		return driver;
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static void launch(String url) {
		driver.get(url);
	}
	
	public static void close() {
		driver.close();
	}

	public static void implicitWait(int num) {
		driver.manage().timeouts().implicitlyWait(num, TimeUnit.SECONDS);
	}
	public static WebElement getLocator(String locType, String value) {
		WebElement element = null;
		switch (locType) {
		case "id":
			element = driver.findElement(By.id(value));
			break;

		case "name":
			element = driver.findElement(By.name(value));
			break;

		case "classname":
			element = driver.findElement(By.className(value));
			break;

		case "linktext":
			element = driver.findElement(By.linkText(value));
			break;

		case "partiallinktext":
			element = driver.findElement(By.partialLinkText(value));
			break;

		case "xpath":
			element = driver.findElement(By.xpath(value));
			break;

		default:
			System.out.println("Not Matched");
			break;
		}

		return element;
	}
	

	public static void inputText(WebElement element, String data) {
		element.sendKeys(data);
	}

	public static void clickOn(WebElement element) {
		element.click();
	}

	public static void clearText(WebElement element) {
		element.clear();
	}
	public static String getText(WebElement element) {
		String text = element.getText();
		return text;
	}
	
	public static WebElement getTexts(WebElement element) {
		String text = element.getText();
		return element;
	}

	public static void compareText(String expected, String actual) {
		boolean equals = actual.equals(expected);
		if (equals) {
			System.out.println("Matched");
		} else {
			System.out.println("Not Matched");
		}
	}

	//Actions
	public static void mouseHover(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	public static void rightClick() {
		Actions a = new Actions(driver);
		a.contextClick().perform();
	}

	public void rightClickOnLocator(WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).perform();
	}

	public void doubleClick(WebElement element) {
		Actions a = new Actions(driver);
		a.doubleClick(element).perform();
	}

	public static void dragAndDrop(WebElement sourceElement, WebElement targetElement) {
		Actions a = new Actions(driver);
		a.dragAndDrop(sourceElement, targetElement).perform();
	}
	
	
	//Select
	
	public static boolean multi(WebElement element) {
		Select s = new Select(element);
		return s.isMultiple();
	}
	
	public static List<String> getOptions(WebElement element) {
		Select s = new Select(element);
		List<String> option = new ArrayList<String>();
		List<WebElement> optionElements = s.getOptions();
		for (int i = 0; i < optionElements.size(); i++) {
			WebElement elementOptions = optionElements.get(i);
			String text = elementOptions.getText();
			option.add(text);
		}
		return option;
	}       
	
	public static void selectByIndex(WebElement element, int value) {
		Select s = new Select(element);
		s.selectByIndex(value);
	}
	
	public static void selectByValue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}
	
	
	public static void selectByVisibleText(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByVisibleText(value);
	}
	
	public static void multiSelectAll(WebElement element) {
		Select s = new Select(element);
		List<WebElement> optionsElement = s.getOptions();
		for (int i = 0; i < optionsElement.size(); i++) {
			WebElement elementOption = optionsElement.get(i);
			String text = elementOption.getText();
			s.selectByVisibleText(text);
		}
	}
	
	public static void selectMultipleOption(WebElement element, String data) {
		String[] split = data.split(",");
		Select s = new Select(element);
		List<String> option = new ArrayList<String>();
		List<WebElement> optionsElement = s.getOptions();
		for (int i = 0; i < optionsElement.size(); i++) {
			WebElement elementOption = optionsElement.get(i);
			String text = elementOption.getText();
			option.add(text);
			if(data.contains(option.get(i))) {
				s.selectByIndex(i);
			}
		}
	}
	
//	public static void getSelectAllOption(WebElement element) {
//		Select s = new Select(element);
//		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
//		for(int i=0; i<allSelectedOptions.size(); i++) {
//			String text = allSelectedOptions.get(i).getText();
//			s.selectByVisibleText(text);
//		}
//	}
	
	public static void alertok() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public static void alertDismiss() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}     
	
	public static void alertSendKeys(String data) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(data);
	}
	
		public static String alertText() {
			Alert alert = driver.switchTo().alert();
			return alert.getText();
		}
		
		
		public static String getExcelValue(String sheet, int rownum, int cellnum) throws IOException {
			File f = new File("src/test/resources/Excel/excelfile.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet s = wb.getSheet(sheet);
			Row r = s.getRow(rownum);
			Cell c = r.getCell(cellnum);
			String data = c.getStringCellValue();
			//System.out.println("c.getStringCellValue()"+" "+data);
			return data;
		}
		
		
		public static Map<String, String> getDataExcel(String tcName) throws IOException {
			Map<String, String> m = new LinkedHashMap<String, String>();
			File f = new File("C:\\Harish\\Selenium\\excelfile.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet s = wb.getSheet("Sheet1");
			
			int rowNum = 0;
			for(int i=1; i<=s.getLastRowNum(); i++) {
				Row row = s.getRow(i);
				Cell cell = row.getCell(0);
				String value = cell.getStringCellValue();
				if(tcName.equals(value)) {
					rowNum = i;
				}
			}
			Row row = s.getRow(rowNum);
			Row row2 = s.getRow(0);
			for(int i=1; i<row.getLastCellNum(); i++) {
				Cell cell = row.getCell(i);
				String value = cell.getStringCellValue();
				Cell cell2 = row2.getCell(i);
//				System.out.println(cell2.getStringCellValue() + " = " + value);
				m.put(cell2.getStringCellValue(), value);

			}
			return m;
		}
		
		public static void selectFrameName(String fnamename) {
			driver.switchTo().frame(fnamename);
		}
		
		public static void selectWebelement(WebElement element) {
			driver.switchTo().frame(element);
		}
		
		public static void ParentFrame() {
			driver.switchTo().parentFrame();
		}
		
		
		public static void SwitchWindow(String expTitile) {
			Set<String> windowHandles = driver.getWindowHandles();
			for(String allWindow : windowHandles ) {
				driver.switchTo().window(allWindow);
				if (driver.getTitle().equals(expTitile)) {
					break;
				}
			}
		}
		
		public static void switchWindowHandle() {
			String parent = driver.getWindowHandle();
			driver.switchTo().window(parent);
			
		}              
		
		
	
}
