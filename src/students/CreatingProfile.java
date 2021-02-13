package students;

import java.awt.Robot;
import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.SlowLoadableComponent;

public class CreatingProfile {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\yash\\eclipse-workspace\\SeleniumConcepts\\Drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement sign = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
		sign.click();
		
		Thread.sleep(2000);
		
		WebElement id = driver.findElement(By.name("email_create"));
		id.sendKeys("96004@smail.com");
		
		WebElement create = driver.findElement(By.id("SubmitCreate"));
		create.click();
		
		Thread.sleep(6000);
        WebElement mr = driver.findElement(By.id("id_gender1"));
      	mr.click();
		
		Thread.sleep(2000);
		
		WebElement fname = driver.findElement(By.id("customer_firstname"));
		fname.sendKeys("ram");
		
		Thread.sleep(2000);
		WebElement lastname = driver.findElement(By.name("customer_lastname"));
	    lastname.sendKeys("kumar");
	    
	 
	    
	    Thread.sleep(2000);
	    WebElement pass = driver.findElement(By.name("passwd"));
	    pass.sendKeys("09876543");
	    
	    Thread.sleep(2000);
	   WebElement bath = driver.findElement(By.xpath("//div[@class='form-group']"));
	   bath.click();
	    
	   Thread.sleep(2000);
	   WebElement day = driver.findElement(By.id("days"));
	   Select s =new Select(day);
	   s.selectByIndex(6);
	    
	   Thread.sleep(2000);
	   WebElement months = driver.findElement(By.name("months"));
	   Select s1 = new Select(months);
	   s1.selectByValue("10");
	   
	   Thread.sleep(2000);
	 WebElement years = driver.findElement(By.id("years"));
	   Select s2 =new Select(years);
	  s2.selectByIndex(20);
	  
	  Thread.sleep(2000);
	  WebElement company = driver.findElement(By.id("company"));
	   company.sendKeys("knk tech ");
	   
	   Thread.sleep(2000);
	   WebElement add = driver.findElement(By.id("address1"));
	   add.sendKeys("no 2  vm street knk nagar  ");
	   
	   Thread.sleep(2000);
	   WebElement add2 = driver.findElement(By.id("address2"));
	   add2.sendKeys("first floor");
	   
	   Thread.sleep(2000);
	   WebElement city = driver.findElement(By.id("city"));
	   city.sendKeys("Rome");
	   
	   Thread.sleep(2000);
	   WebElement state = driver.findElement(By.id("id_state"));
	   Select e = new Select(state);
	   e.selectByIndex(4);
	   
	   
	    Thread.sleep(2000);
	    WebElement zip = driver.findElement(By.name("postcode"));
	    zip.sendKeys("00000");
	    
	    Thread.sleep(2000);
	   WebElement country = driver.findElement(By.xpath("//select[@name='id_country']"));
	   Select c = new Select(country);
	   c.selectByVisibleText("United States");
	   
	   Thread.sleep(2000);
	   WebElement num = driver.findElement(By.xpath("//textarea[@class='form-control']"));
	   num.sendKeys("2468864211");
	    
	   Thread.sleep(2000);
	   WebElement pnum = driver.findElement(By.id("phone_mobile"));
	   pnum.sendKeys("2345678910");
	   
	   Thread.sleep(2000);
	   WebElement reg = driver.findElement(By.xpath("//span[text()='Register']"));
	   reg.click();
	   
	   
	   Thread.sleep(2000);
	   WebElement tshirt = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
	   tshirt.click();
	  
	  Thread.sleep(2000);
	   WebElement image = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
	    image.click();
       Thread.sleep(2000);
       WebElement cart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
     Actions ac =new Actions(driver);
     ac.contextClick(cart).perform();
     Thread.sleep(2000);
     Robot r = new Robot();
     r.keyPress(KeyEvent.VK_DOWN);
     r.keyRelease(KeyEvent.VK_DOWN);
     Thread.sleep(2000);
      r.keyPress(KeyEvent.VK_ENTER);
     r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	

}
