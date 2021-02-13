package students;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Browser {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
	"C:\\Users\\yash\\eclipse-workspace\\SeleniumConcepts\\Drive\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://en-gb.facebook.com/login/");
	 
	Thread.sleep(2000);
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("abc@gmail.com");
	
	WebElement password = driver.findElement(By.name("pass"));
	password.sendKeys("123456");
	
	WebElement logIn = driver.findElement(By.id("loginbutton"));
	logIn.click();
	
}
}
