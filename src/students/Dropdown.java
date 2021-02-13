package students;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\yash\\eclipse-workspace\\SeleniumConcepts\\Drive\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://en-gb.facebook.com/");
			Thread.sleep(2000);
			WebElement ccAcnt = driver.findElement(By.id("u_0_2"));
			ccAcnt.click();
			 
			Thread.sleep(2000);
			WebElement day = driver.findElement(By.id("day"));
			Select s = new Select(day);
			s.selectByIndex(5);
			
			Thread.sleep(2000);
			WebElement month = driver.findElement(By.name("birthday_month"));
			Select s1 = new Select(month);
			s1.selectByValue("3");
			
			Thread.sleep(2000);
			WebElement year = driver.findElement(By.id("year"));
			Select s3 = new Select(year);
			s3.selectByVisibleText("1908");
			
			String text = year.getText();
			System.out.println(text);
}
}
