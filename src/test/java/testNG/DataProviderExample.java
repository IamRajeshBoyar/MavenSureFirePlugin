package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

	
	Object[][] data = {
			
			{"rajesh","boyar"},
			{"rohini", "rajendran"},
			{"fabiana", "esteeves"}
			
	};
	
	
	@DataProvider(name="mydata")
	public Object[][] sendData() {
		return data;
		
	}
	
	@Test (dataProvider = "mydata")
	public void testData(String name, String username) {
		System.out.println(name+"  "+username);
		
	}
	
}
