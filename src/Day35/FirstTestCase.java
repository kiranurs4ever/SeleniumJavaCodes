package Day35;

import org.testng.annotations.Test;

/*
 * 1. OpenApp
 * 2. LoginApp
 * 3. LogoutApp
 * 4. CloseApp
 * 
 */


public class FirstTestCase {
	
	@Test(priority=1)
	void openApp() {
		System.out.println("Opening the app");
	}
	
	@Test(priority=3)
	void LoginApp() {
		System.out.println("Logingin the app");
	}
	
	@Test(priority=2)
	void LogoutApp() {
		System.out.println("Logout  the App");
	}
	
	@Test(priority=4)
	void CloseApp() {
		System.out.println("Close the App");
	}

}
