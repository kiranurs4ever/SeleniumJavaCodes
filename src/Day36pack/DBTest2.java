package Day36pack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class DBTest2 {
	
	@Test(priority=3)
	void test_select()
	{
		System.out.println("Select Test completed");
	}
	
	@Test(priority=4)
	void test_delete()
	{
		System.out.println("Delete Test completed");
	}
	
	@AfterTest
	void closeDB()
	{
		System.out.println("Database closed..");
	}

}
