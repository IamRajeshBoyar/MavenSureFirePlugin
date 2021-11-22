package testNG;

import org.testng.annotations.Test;

public class IncludeTestExample {
	
	
	@Test
	public void carLoan() {
	
		System.out.println("this is car loan method");
	}
	@Test
	public void bikeLoan() {
		System.out.println("this is bike loan method");
	}
	@Test
	public void homeLoan() {
		System.out.println("this is home loan  method");
	}

}
