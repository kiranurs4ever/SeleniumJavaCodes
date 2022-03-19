package Day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/admin/Downloads/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		//Absolute path
//		driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/input[4]")).sendKeys("T-shirt");
//		driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/button")).click();
//		
		//Relative xpath
//		driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys("T-shirts");
//		driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button")).click();
		
		// or in xpath
//		driver.findElement(By.xpath("//input[@id='search_query_top' or @name='search_query']")).sendKeys("T-shirt");
//		driver.findElement(By.xpath("//button[@type='submit' or  @name='submit_search']")).click();
		
		// And operator

//		driver.findElement(By.xpath("//input[@id='search_query_top' and @name='search_query']")).sendKeys("T-shirt");
//		driver.findElement(By.xpath("//button[@type='submit' and  @class='btn btn-default button-search']")).click();
		
		
		// contains
//		driver.findElement(By.xpath("//input[contains(@id,'query_top')]")).sendKeys("T-shirt");
//		//driver.findElement(By.xpath("//button[contians(@class,'btn')]")).click();
//		driver.findElement(By.xpath("//button[contains(@name,'search')]")).click();
//		
		//Srats- with
//		
//		driver.findElement(By.xpath("//input[starts-with(@id,'search_query')]")).sendKeys("T-shirt");
//		driver.findElement(By.xpath("//button[starts-with(@type,'submit')]")).click();
		
		// with text 
		
		//driver.findElement(By.xpath("//a[text() ='Women']")).click();
		
		// chained xpath
		driver.findElement(By.xpath("//form[@id='searchbox']//input[@name='search_query']")).sendKeys("T-shirt");
		//driver.findElement(By.xpath("//form[@id='searchbox']//input[@id='search_query_top']")).sendKeys("T-shirts");
		driver.findElement(By.xpath("//form[@id='searchbox']//button[@class='btn btn-default button-search']")).click();
	}

}
