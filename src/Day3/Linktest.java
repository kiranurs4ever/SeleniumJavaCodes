package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Setup & Launching Chrome Driver
		System.setProperty("webdriver.chrome.driver", "/Users/admin/Downloads/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		// launching the page
		driver.get("http://automationpractice.com/index.php");
		
		//Sending text to the site
		driver.findElement(By.id("search_query_top")).sendKeys("T-Shirt");// By id
		driver.findElement(By.name("submit_search")).click();//By name
		
		
		// Finding Element by link text
		//driver.findElement(By.linkText("Printed Chiffon Dress")).click();
		
		// Finding Element by Partial link text
		driver.findElement(By.partialLinkText("Printed")).click();
	}

}
