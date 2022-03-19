package Day37;

import org.testng.annotations.Test;

/*
loginByEmail  - sanity & regression
loginByfacebook - sanity
loginBytwitter  - sanity

signupbyemail - sanity & regression
signupbyfacebook  - regression
signupbytwitter  - regression

paymentinrupees - sanity & regression
paymentindollar - sanity  
paymentReturnbyBank  - regression
*/

public class GroupingDemo {
	
	@Test(priority=1, groups= {"sanity","regression"}, enabled=false)
	void loginByEmail() {
		System.out.println(" loginByEmail ....");
	}
	
	@Test(priority=2, groups= {"sanity"})
	void loginByfacebook() {
		System.out.println(" loginByfacebook ....");
	}
	
	@Test(priority=3, groups= {"sanity"})
	void loginBytwitter() {
		System.out.println(" loginBytwitter ....");
	}
	
	
	@Test(priority=4, groups= {"sanity","regression"})
	void signupByEmail() {
		System.out.println(" signupByEmail ....");
	}
	
	@Test(priority=5, groups= {"regression"})
	void signupByfacebook() {
		System.out.println(" signupByfacebook ....");
	}
	
	@Test(priority=6, groups= {"regression"})
	void signupBytwitter() {
		System.out.println(" signupByEmail ....");
	}
	
	@Test(priority=7, groups= {"sanity","regression"})
	void paymentInRupees() {
		System.out.println(" Payment in rupees ...");
	}
	
	@Test(priority=8, groups= {"sanity"})
	void paymentInDolars() {
		System.out.println(" Payment in Dolars ...");
	}
	
	@Test(priority=9, groups= {"regression"})
	void pamentReturnBank() {
		System.out.println(" Payment return Bank...");
	}
	
	

}
