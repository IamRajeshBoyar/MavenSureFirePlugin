package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAndSoftAssertExample {
	@Test
	public void assertTest() {
		System.out.println("before Assertion");
		Assert.fail();
		System.out.println("after assertions");
	}
	@Test
	public void verifyTest() {
		System.out.println("this is verify or soft assert");
		SoftAssert soft = new SoftAssert();
		soft.fail();
		System.out.println("after soft assert failing");
		soft.assertAll();
	}
	
}
