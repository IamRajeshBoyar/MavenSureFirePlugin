package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RunningFailTestExample {
	@Test
	public void testCase1() {
		System.out.println("example of retrying failed testcase");
		Assert.assertEquals(true, false);
	}
	@Test
	public void testCase2() {
		System.out.println("retrying failed testcase 2");
		Assert.assertEquals(true, false);
	}
	@Test
	public void testCase3() {
		System.out.println("retrying failed testcase 3");
		Assert.assertEquals(true, false);
	}

}
