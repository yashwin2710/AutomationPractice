package students;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\yash\\eclipse-workspace\\SeleniumConcepts\\Drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
	Actions ac = new Actions(driver);
				ac.moveToElement(women).perform();
				
				Thread.sleep(2000);
		WebElement tshirt = driver.findElement(By.xpath("//a[text()='T-shirts'][1]"));
		ac.moveToElement(tshirt).perform();
		ac.click(tshirt).perform();
	}

}
