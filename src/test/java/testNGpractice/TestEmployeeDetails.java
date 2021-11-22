package testNGpractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEmployeeDetails {
	EmployeeDetails emp = new EmployeeDetails();
	BusinessLogic business = new BusinessLogic();
	
	@Test
	public void calculateAppraisal() {
		emp.setName("rajesh");
		emp.setMonthlySalary(8000.00);
		emp.setAge(28);
		
		double appraisal = business.calculateAppraisal(emp);
		
		Assert.assertEquals(appraisal, 500);
		
	}
	@Test
	public void calculateYearlySalary() {
		
		emp.setName("rohini");
		emp.setAge(26);
		emp.setMonthlySalary(8000.00);
		
		double yearlySalary = business.calculateYearlySalary(emp);
		
		Assert.assertEquals(yearlySalary, 96000);
		
	}
	
	
	
}
