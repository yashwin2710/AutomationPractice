package students;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotDemo {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\yash\\eclipse-workspace\\SeleniumConcepts\\Drive\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
	WebElement bestseller = driver.findElement(By.xpath("(//a[@tabindex='0'])[7]"));
	boolean displayed = bestseller.isDisplayed();
	System.out.println(displayed);
    Actions ac =new Actions(driver);
    ac.contextClick(bestseller).perform();
	 Thread.sleep(2000);
    Robot r = new Robot();
    r.keyPress(KeyEvent.VK_DOWN);
    r.keyRelease(KeyEvent.VK_DOWN);
    Thread.sleep(2000);
     r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
    Thread.sleep(2000);
    WebElement TodayDeal = driver.findElement(By.xpath("(//a[@tabindex='0'])[8]"));
    boolean displayed2 = TodayDeal.isDisplayed();
    System.out.println(displayed2);
    Actions ab = new Actions(driver);
    ab.contextClick(TodayDeal).perform();
    Thread.sleep(2000);
    Robot b = new Robot();
    b.keyPress(KeyEvent.VK_DOWN);
    b.keyRelease(KeyEvent.VK_DOWN);
    Thread.sleep(2000);
     b.keyPress(KeyEvent.VK_ENTER);
    b.keyRelease(KeyEvent.VK_ENTER);
    WebElement mobile = driver.findElement(By.xpath("(//a[@tabindex='0'])[9]"));
    boolean displayed3 = mobile.isDisplayed();
    System.out.println(displayed3);
    Actions aa = new Actions(driver);
    aa.contextClick(mobile).perform();
    Thread.sleep(2000);
    Robot a = new Robot();
    a.keyPress(KeyEvent.VK_DOWN);
    a.keyRelease(KeyEvent.VK_DOWN);
    Thread.sleep(2000);
    a.keyPress(KeyEvent.VK_ENTER);
    a.keyRelease(KeyEvent.VK_ENTER);
    WebElement signin = driver.findElement(By.xpath("//div[@class='nav-line-1-container']"));
    boolean displayed4 = signin.isDisplayed();
    System.out.println(displayed4);
    Actions bb = new Actions(driver);
    bb.contextClick(signin).perform();
    Thread.sleep(2000);
    Robot g = new Robot();
    g.keyPress(KeyEvent.VK_DOWN);
    g.keyRelease(KeyEvent.VK_DOWN);
    Thread.sleep(2000);
    g.keyPress(KeyEvent.VK_ENTER);
    g.keyRelease(KeyEvent.VK_ENTER);
    
    String pid = driver.getWindowHandle();
    System.out.println(pid);
    String parenttitle = driver.switchTo().window(pid).getTitle();
    System.out.println(parenttitle);
    
    Set<String> allId = driver.getWindowHandles();
    System.out.println(allId);
    for (String id : allId) {
		String alltitle = driver.switchTo().window(id).getTitle();
		System.out.println(alltitle);
		
	}
      Thread.sleep(2000);
      String actualTitle ="Amazon Sign In";
      for (String id : allId) {
		if (driver.switchTo().window(id).getTitle().equals(actualTitle)) {
			WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
			email.sendKeys("2710@3333");
			break;
		}
	}
		
	}
}

