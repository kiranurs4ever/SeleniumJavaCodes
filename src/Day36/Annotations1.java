package Day36;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations1 {
	
	@BeforeMethod
	void login() {
		System.out.println("Login ....");
	}
	
	@Test(priority=1)
	void search() {
		System.out.println("search ....");
	}
	
	@Test(priority=2)
	void advsearch() {
		System.out.println("advSearch ....");
	}
	
	@AfterMethod
	void logout() {
		System.out.println("Logout ....");
	}

}
