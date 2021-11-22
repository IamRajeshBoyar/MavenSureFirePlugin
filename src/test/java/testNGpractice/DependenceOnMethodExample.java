package testNGpractice;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependenceOnMethodExample {

	@Test (groups = "example")
	public void testDependency1() {
		System.out.println("testDependency1");
	}
	@Test (dependsOnGroups = "example")
	public void testDependency2() {
		System.out.println("testDependency2");
		
	}
	@Test
	public void testDependency3() {
		System.out.println("testDependency3");	
	}
	@Test
	public void testDependency4() {
		System.out.println("testDependency4");
	}
	@Test(groups="example")
	public void testDependency5() {
		System.out.println("testDependency5");
		assertEquals(false, true);
	}

}
