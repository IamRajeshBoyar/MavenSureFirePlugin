package testNGpractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SalutationMessgaeTest {
	
	
	String message = "hello world";
	MessageUtil messageUtils = new MessageUtil(message);
	
	@Test (enabled = false)
	public void salutationTest() {
		message = "hi "+ message;
		
		Assert.assertEquals(message, messageUtils.salutationMessage());
		
	}

}
