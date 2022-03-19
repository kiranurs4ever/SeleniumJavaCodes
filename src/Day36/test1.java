package Day36;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test1 {
	
	@Test(priority=1)
	void t1() {
		Assert.assertEquals(1, 2);
	}
	@Test(priority=2)
	void t2() {
		Assert.assertEquals(2, 2);
	}
	@Test(priority=3)
	void t3() {
		Assert.assertEquals(1, 1);
	}

}
