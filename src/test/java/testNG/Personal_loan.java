package testNG;

import org.testng.annotations.Test;

public class Personal_loan {
	
	@Test(groups = {"smokeTest"})
	public void WebPersonalLoan() {
		System.out.println("this is webPersonal loan smokeTest");
	}
	@Test
	public void MobilePersonalLoan() {
		System.out.println("this is mobile personal loan");
	}
	@Test
	public void ApiPersonalLoan() {
		System.out.println("this is ApiPersonal loan");
	}

}
