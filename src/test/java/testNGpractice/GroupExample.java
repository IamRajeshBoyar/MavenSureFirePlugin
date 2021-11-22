package testNGpractice;

import org.testng.annotations.Test;

public class GroupExample {

	@Test(groups = "login")
	public void testUsername() {
			System.out.println("login username");
	}
	@Test(groups = "login")
	public void testPassword() {
		System.out.println("login testPassword");
	}
	@Test(groups="login")
	public void testLoginButton() {
		System.out.println("login testLoginButton");
	}
	@Test(groups="registration")
	public void testRegistrationPage() {
		
		System.out.println("registration page");
	}
	@Test(groups="registration")
	public void registrationUsername() {
		System.out.println("registrationUsername");
	}
	@Test(groups="registration")
	public void registrationPassword() {
		System.out.println("registrationPassword");
	}
	@Test(groups="registration")
	public void registrationRegisterButton() {
		System.out.println("registrationRegisterButton");
	}
	@Test(groups="homepage")
	public void homepage() {
		System.out.println("homepage");
	}
	@Test(groups="homepage")
	public void homepageFunction1() {
		
		System.out.println("homepageFunction1");
	}
	@Test(groups="homepage")
	public void homepageFunction2() {
		System.out.println("homepageFunction2");
	}
	@Test(groups="homepage")
	public void homepagefunction3() {
		System.out.println("homepagefunction3");
	}
}
