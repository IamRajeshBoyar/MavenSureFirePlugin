package testNG;

import org.testng.annotations.Test;

public class RegularExpressionTestNG {
	
	@Test
	public void mobileLogin() {
		System.out.println("this is teh mobile login method");
	}
	@Test
	public void webLogin() {
		System.out.println("this is the web login method");
	}
	@Test
	public void mobileRegistration() {
		System.out.println("this is teh mobile registration method");
	}
	@Test
	public void webRegistration() {
		System.out.println("this is the web registration method");
	}
	@Test
	public void mobileHomepage() {
		System.out.println("this is the mobile homepage");
	}
	@Test
	public void webHomePage() {
		System.out.println("this is the web homepage method");
	}	
}
