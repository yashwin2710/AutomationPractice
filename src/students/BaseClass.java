package students;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;
	
	
	public static WebDriver getBrower(String browsername) {
		
	try {
		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\yash\\eclipse-workspace\\SeleniumConcepts\\Drive\\chromedriver.exe ");
		 driver = new ChromeDriver();
		}	else if (browsername.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\yash\\eclipse-workspace\\SeleniumConcepts\\Drive\\IEDriverServer.exe");
		 driver = new InternetExplorerDriver();
		}else {
			System.out.println("Invalid Browsername");
		}
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	} catch (Exception e) {
		e.printStackTrace();
	}
	return driver;
	}
	public static void geturl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
public static void clickonelement(WebElement element) {
	try {
		element.click();
	} catch (Exception e) {
	
		e.printStackTrace();
	}
}
public static void InputToElement(WebElement element, String value ) {
	try {
		element.sendKeys(value);
	} catch (Exception e) {
		
		e.printStackTrace();
	}

}
private static void selectDropDown(WebElement element, String value, String option) {
	Select s = new Select(element);
	try {
		if (option.equalsIgnoreCase("value")) {
			s.deselectByValue(value);
		}else if (option.equalsIgnoreCase("visibletext")) {
			s.selectByVisibleText(value);
		}else if (option.equalsIgnoreCase("index")) {
			s.selectByIndex(Integer.parseInt(value));
		}
	} catch (NumberFormatException e) {
		e.printStackTrace();
	}
	
}
private static void mouseHover(WebElement element) {
	try {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();
	} catch (Exception e) {
		
		e.printStackTrace();
	}

}

}

