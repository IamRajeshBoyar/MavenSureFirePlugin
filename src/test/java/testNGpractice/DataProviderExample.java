package testNGpractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	
	Object[][] name = {
			
			{"rajesh", "boyar"},
			{"rohini", "rajendren"},
			{"fabiana","esteeves"}
	};
	
	@DataProvider(name="data")
	public Object[][] returnData(){
		return name;
	}
	
	@Test (dataProvider = "data")
	public void passData(String name, String surname) {
		
		System.out.println(name+"  "+surname);
		
	}
	

}
