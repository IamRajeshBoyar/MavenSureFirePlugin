package testNGpractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MessageTestClass {
	
	
	String message = "hello world"; 

	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test
	public void testMessage() {
		System.out.println("inside testMessage()");
		Assert.assertEquals(message, messageUtil.getMessage());
	}
	
	
}
