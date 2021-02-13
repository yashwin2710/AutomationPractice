package students;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\yash\\eclipse-workspace\\SeleniumConcepts\\Drive\\chromedriver.exe ");
WebDriver driver = new ChromeDriver();
driver.get("https://www.hotstar.com/in/");
driver.manage().window().maximize();

Thread.sleep(2000);
driver.navigate().to("https://www.amazon.in/");

Thread.sleep(2000);
driver.navigate().back();

Thread.sleep(2000);
driver.navigate().forward();

Thread.sleep(2000);
driver.navigate().refresh();

String currentUrl = driver.getCurrentUrl();
System.out.println(currentUrl);

String title = driver.getTitle();
System.out.println(title);




}
}
