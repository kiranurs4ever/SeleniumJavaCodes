package Day36;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class DependencyMethod {
	
	
	@Test(priority=1)
	void bt()
	{
		Assert.assertTrue(true);
		System.out.println("This is before test method.....");
	}
	
	@Test(priority=2,dependsOnMethods= {"bt"})
	void at()
	{
		Assert.assertTrue(true);
		System.out.println("This is after test method.....");
	}
	
	@Test(priority=3)
	void bc()
	{
		Assert.assertTrue(false);
		System.out.println("This is before class method.....");
	}
	
	@Test(priority=4, dependsOnMethods= {"bc"})
	void ac()
	{
		Assert.assertTrue(false);
		System.out.println("This is after class method.....");
	}
	
	@Test(priority=5, dependsOnMethods= {"ac","bc"})
	void bm()
	{
		Assert.assertTrue(true);
		System.out.println("This is before method.....");
	}
	
	@Test(priority=6)
	void am()
	{
		Assert.assertTrue(true);
		System.out.println("This is after method.....");
	}
	
	@Test(priority=7)
	void tm1()
	{
		Assert.assertTrue(true);
		System.out.println("This is Test Method1...");
	}
	
	@Test(priority=8)
	void tm2()
	{
		Assert.assertTrue(true);
		System.out.println("This is Test Method2...");
	}

}
