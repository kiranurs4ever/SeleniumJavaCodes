package Day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase {
	WebDriver driver;
	
	@Test(priority=1)
	void initialize() {
		System.setProperty("webdriver.chrome.driver", "/Users/admin/Downloads/Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		driver.manage().window().maximize();
	}
	@Test(priority=2)
	void login() {
	WebElement emailtxt	= driver.findElement(By.xpath("//*[@id=\"Email\"]"));
	emailtxt.clear();
	emailtxt.sendKeys("admin@yourstore.com");
	
	WebElement passtxt = driver.findElement(By.xpath("//*[@id=\"Password\"]"));
	passtxt.clear();
	passtxt.sendKeys("admin");
	
	driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
	
	String expected_lable = driver.findElement(By.xpath("//h1[normalize-space()='Dashboard']")).getText();
	System.out.println("exp_lbl " + expected_lable);
	if(expected_lable.equals("Dashboards")) {
		System.out.println("test passed");
	}
	else {
		System.out.println("test failed");
	}
	
	Assert.assertEquals(expected_lable, "Dashboard", "Lables are not equal");
	
	
	}

}
