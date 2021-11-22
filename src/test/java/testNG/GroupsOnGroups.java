package testNG;

import org.testng.annotations.Test;

public class GroupsOnGroups {
	
	//this is the testng example of groups on groups
	
	@Test(groups={"smoke test"})
	public void test1() {
		System.out.println("this is smoke test category");
	}
	@Test(groups= {"sanity test"})
	public void test2() {
		System.out.println("this is sanity test category");
	}
	@Test(groups= {"regression test"})
	public void test3() {
		System.out.println("this is regression test category");
	}
	@Test
	public void test4() {
		System.out.println("this is normal method");
	}
	
}
