package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchWeb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Assigment
//		----------
//		1) Open Web Browser(Chrome/firefox/IE).
//		2) Open URL  https://admin-demo.nopcommerce.com/login
//		3) Provide Email  (admin@yourstore.com).
//		4) Provide password  (admin).   
//
//		5) Click on Login.
//		driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
//
//		6) Capture title of the dashboad page.(Actual title)
//		7) Verify title of the page: "Dashboard / nopCommerce administration" (Expected)
//		8) close browser
//		
		
		// Step 1 : Open Web Browser
		// To Open browser need to do the setup
		//System.setProperty("webdrive.chrome.driver", "/Users/admin/Downloads/Drivers/chromedriver");
		System.setProperty("webdriver.chrome.driver", "/Users/admin/Downloads/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();  // By this step chrome browser should launch
		// WebDriver is an Interface
		//ChromeDriver is a Constructor 
		
		// Step 2) Open URL  https://admin-demo.nopcommerce.com/login
		// get method to open url
		driver.get("https://admin-demo.nopcommerce.com/login"); 
		
		// Step	3) Provide Email  (admin@yourstore.com).
		// Find the element and sendkeys
		// Before sending we need to clear existing text
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		
        //Step	4) Provide password  (admin). 
		driver.findElement(By.id("Password")).sendKeys("admin");
		
		//Step 5) Click on Login.
		//driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
		
		
		//Step 6) Capture title of the dashboad page.(Actual title)
		String title = driver.getTitle();
		System.out.println(title);
		
		//Step 7) Verify title of the page: "Dashboard / nopCommerce administration" (Expected)
		String expectedTitle = "Dashboard / nopCommerce administration";
		
		if(title.equals(expectedTitle)) {
			System.out.println("Test Passes");
		}
		else {
			System.out.println("Test Failed");
		}
		
		// Step 8) close browser
		driver.close();
		
		
	}

}
