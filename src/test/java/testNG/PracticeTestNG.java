package testNG;



import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class PracticeTestNG {
	
	@Test(priority = 2)
	public void priorityExample() {
		//prioity is used to decide the order in which the test case should be executed
		System.out.println("this is priority 2");
	}
	
	@Test(enabled = false)
	public void enableExample() {
		System.out.println("this is the enable test case it will not be enabled if specified as false");
	}
	@Test
	public void ingoreTextExample() {
		System.out.println("this is the exmaple of @ignortest example it will not be specified if this anotation is set false");
	}
	
	@Test (dependsOnMethods = "fuelOfCar", alwaysRun = true)
	public void travellingGoa() {
		System.out.println("this method depends on the fuel of the car");
	}
	@Test
	public void fuelOfCar() {
		int fuel = 5;
		
		if(fuel < 5) {
			Assert.assertTrue(false);
		}else {
			Assert.assertTrue(true);
		}
	}
	@Test(timeOut = 3000)
	public void timeOutExample() throws InterruptedException {
		Thread.sleep(4000);
		System.out.println("this method will not executed after 3 seconds of timeout");
	}
	@Test (expectedExceptions = java.lang.ArithmeticException.class)
	public void expectedExceptionExample() {
		System.out.println("this is the example of expected exception");
		int division = 5/0;
		System.out.println(division);
	}
	
}
