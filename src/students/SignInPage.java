package students;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;
import org.seleniumhq.jetty9.server.HomeBaseWarning;

public class SignInPage extends BaseClass {
	//public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
	"C:\\Users\\yash\\eclipse-workspace\\SeleniumConcepts\\Drive\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	 //driver = getBrower("chrome"); 
	// geturl("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	WebElement sign = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
	sign.click();

	
  Thread.sleep(2000);
  WebElement email = driver.findElement(By.id("email"));
  email.sendKeys("96000@smail.com");
  
  WebElement password = driver.findElement(By.id("passwd"));
  password.sendKeys("09876543");
   
  WebElement submit= driver.findElement(By.id("SubmitLogin"));
  submit.click();
  
  WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
	Actions ac = new Actions(driver);
				ac.moveToElement(women).perform();
				
				Thread.sleep(2000);
		WebElement tshirt = driver.findElement(By.xpath("//a[text()='T-shirts'][1]"));
		ac.moveToElement(tshirt).perform();
		ac.click(tshirt).perform();
		Thread.sleep(2000);
//		  WebElement image = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
//		    image.click();
		WebElement add = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		   add.click();
}
}
