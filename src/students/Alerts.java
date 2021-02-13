package students;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\yash\\eclipse-workspace\\SeleniumConcepts\\Drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		WebElement clickAlert = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]"));
		clickAlert.click();
		
		Thread.sleep(2000);
		WebElement cancel = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		cancel.click();
		Thread.sleep(2000);
		
		Alert dismiss = driver.switchTo().alert();
		 
		 Thread.sleep(2000);
		 
		 dismiss.dismiss();
		  
		 driver.quit();
		
		
	}

}
