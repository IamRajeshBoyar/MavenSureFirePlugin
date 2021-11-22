package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotation {

	@BeforeSuite
	public void test() {
		System.out.println("before suite level");
	}
	@BeforeTest
	public void test1() {
		System.out.println("before test level");
	}
	
	@BeforeClass
	public void test2() {
		System.out.println("before class level");
	}
	@BeforeMethod
	public void test3() {
		System.out.println("before method level");
	}
	@AfterMethod
	public void test4() {
		System.out.println("after after method level");
	}
	@AfterClass
	public void test5() {
		System.out.println("after class level");
	}
	@AfterTest
	public void test6() {
		System.out.println("after test level");
	}
	@AfterSuite
	public void test7() {
		System.out.println("after suite level");
	}
	@BeforeGroups
	public void test8() {
			System.out.println("before groups");
	}
	@AfterGroups
	public void test9() {
		System.out.println("after groups");
	}
	@Test(groups="firstGroup")
	public void test10() {
		System.out.println("actual test");
	}
	@Test(groups="secondGroup")
	public void test11() {
		System.out.println("actual test2");
	}
	@Test(description = "this is the method for logoing in internet")
	public void test12() {
		System.out.println("actual test3");
	}

}
