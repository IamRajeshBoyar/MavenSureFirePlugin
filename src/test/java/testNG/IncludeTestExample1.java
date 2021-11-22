package testNG;

import org.testng.annotations.Test;

public class IncludeTestExample1 {
	@Test
	public void savingsAccount() {
		System.out.println("this is savings account method");
	}
	@Test(enabled = false)
	public void currentAccount() {
		System.out.println("this is currant account method");
	}
	@Test
	public void salaryAccount() {
		System.out.println("this is salary account");
	}
	
}
