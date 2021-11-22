package testNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreExample {
	
	@Test
	public void test1() {
		System.out.println("test case 1");
	}
	@Test
	public void test2() {
		System.out.println("test case 2");
	}
}
