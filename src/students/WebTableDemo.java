package students;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\yash\\eclipse-workspace\\SeleniumConcepts\\Drive\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	
	System.out.println("--------all data-------");
List<WebElement> alldata = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
	for (WebElement data : alldata) {
		System.out.println(data.getText());
		
	}
	System.out.println("-------row----");
List<WebElement> Findrow = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[7]/td"));
	for (WebElement data : Findrow) {
		System.out.println(data.getText());
		
	System.out.println("----findheader----------");
List<WebElement> header = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
	for (WebElement findheader : header) {
		System.out.println(findheader.getText());
	
	}
	System.out.println("=======headersize======");
	System.out.println(header.size());
	}
	System.out.println("----single data----");
	WebElement singledata = driver.findElement(By.xpath("//td[text()='Italy']"));
	System.out.println(singledata.getText());
}
}
