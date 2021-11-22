package testNGExample;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterisationExample {
	
	@Test @Parameters("username")
	public void username(String username) {
		System.out.println("my name is "+username);
	}

}
