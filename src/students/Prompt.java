package students;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prompt {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\yash\\eclipse-workspace\\SeleniumConcepts\\Drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		WebElement click = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		click.click();
		
		Thread.sleep(2000);
		WebElement click2 = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		click2.click();
		 
		Thread.sleep(20000);
		 Alert text = driver.switchTo().alert();
		 Thread.sleep(2000);
		 text.sendKeys("hi everyone");
		 
		 Thread.sleep(2000);
		 text.accept();
		  
		 Thread.sleep(2000);
		 driver.quit();
		 
	}

}
