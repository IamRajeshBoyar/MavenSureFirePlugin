package testNG;

import org.testng.annotations.Test;

public class CarLoan {
	@Test	
	public void WebCarLoan() {
		System.out.println("this is webcar loan");
	}
	@Test (groups = {"smokeFire"})
	public void mobileCarLoan() {
		
		System.out.println("this is mobilecar loan hase smoke keyword");
	}
	@Test(groups={"smokeTest"})
	public void apiCarLoan() {
		System.out.println("this is api car loan smoketest has smoke keyword");
	}
}
