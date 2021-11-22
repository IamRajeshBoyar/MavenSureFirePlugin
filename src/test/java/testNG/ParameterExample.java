package testNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParameterExample {
	
	@Test @Parameters({"username","password"})
	public void parameterExample1(String username, String password) {
		System.out.println("username :"+username+" password :"+password);
	}
	
}
