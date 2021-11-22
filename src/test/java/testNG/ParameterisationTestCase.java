package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterisationTestCase {
	
	@Test @Parameters({"username","password"})
	public void parameters(String name, String username) {
		System.out.println(name+" "+username);
		
	}
	
	
}
