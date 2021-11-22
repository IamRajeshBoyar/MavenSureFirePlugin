package testNG;

import org.testng.annotations.Test;

public class HomeLoan {

	@Test
	public void WebHomeLoan() {
		System.out.println("this is web home loan");
	}
	@Test(groups = {"smokeTest","sanityTest"})
	public void MobileHomeLoan() {
		
		System.out.println("this is mobile home loan smoke test and sanity test");
	}
	@Test	
	public void ApiHomeLoan() {
		System.out.println("this is api home loan");
	}
}
