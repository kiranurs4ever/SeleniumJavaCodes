package Day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/admin/Downloads/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		
		//CssSeletor with Tag & ID --> "tag#ID"
		//driver.findElement(By.cssSelector("input#search_query_top")).sendKeys("T-shirt");
		//driver.findElement(By.cssSelector("#search_query_top")).sendKeys("T-shirt");

		//CssSeclector with Tag & Class --> "tag.class"
		//driver.findElement(By.cssSelector("input.search_query")).sendKeys("T-shirt");
		//driver.findElement(By.cssSelector(".search_query")).sendKeys("T-shirt");
		
		
		// CssSelector wit tag & Attributes --> "tag[attribute=value]"
		//driver.findElement(By.cssSelector("input[placeholder=\"Search\"]")).sendKeys("t-shirt");
		//driver.findElement(By.cssSelector("[placeholder=\"Search\"]")).sendKeys("t-shirt");
		
		// tag.class[attribute]
		driver.findElement(By.cssSelector("input.search_query[placeholder=\"Search\"]")).sendKeys("t-shi");
		
		//driver.quit();
	}

}
