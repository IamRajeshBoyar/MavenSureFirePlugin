package testNG;

import org.testng.annotations.Test;

public class GroupsExample {

	@Test (groups = {"smoke test"})
	public void smokeTest() {
		System.out.println("smoke test");
		
	}
	@Test(groups = {"sanity test"})
	public void sanityTest() {
		System.out.println("sanity test");
		
	}
	@Test (groups = {"regression test"})
	public void regressionTest() {
		System.out.println("regression test");
	}
	
}
