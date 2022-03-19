package Day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LIsts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/admin/Downloads/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		
		List<WebElement> slider = driver.findElements(By.className("homeslider-container"));
		System.out.println(slider.size());
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links"+ links.size());
		
		List<WebElement> totallinks=driver.findElements(By.tagName("img"));
		System.out.println("Total numeber of Links"+ totallinks.size());
		
		int totLinks = driver.findElements(By.tagName("img")).size();
		System.out.println("totla img with int " + totLinks);
		
		driver.quit();
		
		
		
	}

}
