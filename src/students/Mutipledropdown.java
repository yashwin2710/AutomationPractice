package students;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mutipledropdown {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\yash\\eclipse-workspace\\SeleniumConcepts\\Drive\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
				
				WebElement findElement = driver.findElement(By.id("multi-select"));
				Select s =new Select(findElement);
				boolean multiple = s.isMultiple();
				System.out.println(multiple);
				
				s.selectByIndex(1);
				
				Thread.sleep(2000);
				s.selectByValue("New Jersey");
				Thread.sleep(2000);
				s.selectByVisibleText("Washington");
				Thread.sleep(2000);
				s.selectByValue("Pennsylvania");
				
				Thread.sleep(2000);
				System.out.println("-------all option------");
				List<WebElement> allOptions = s.getAllSelectedOptions();
				for (WebElement option : allOptions) {
					System.out.println(option.getText());
				}
				Thread.sleep(2000);
				System.out.println("-------first option-------");
				WebElement firstOption = s.getFirstSelectedOption();
				System.out.println(firstOption.getText());
				
				s.deselectAll();
				
				TakesScreenshot ts =(TakesScreenshot) driver;
				File srcfile = ts.getScreenshotAs(OutputType.FILE);
				File desfile = new File("C:\\Users\\yash\\eclipse-workspace\\SeleniumConcepts\\screenshot\\test.png");
				FileUtils.copyFile(srcfile, desfile);
				
	}

}
