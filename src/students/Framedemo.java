package students;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framedemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\yash\\eclipse-workspace\\SeleniumConcepts\\Drive\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
	
		
		WebElement single = driver.findElement(By.name("SingleFrame"));
		driver.switchTo().frame(single);
		
		
		WebElement enter = driver.findElement(By.xpath("//input[@type='text']"));
		enter.sendKeys("hi everyone");
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		WebElement click = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		click.click();
		
		
		WebElement click2 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		click2.sendKeys("yash");
		
	}

}
