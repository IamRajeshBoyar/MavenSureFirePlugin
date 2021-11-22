package testNGpractice;

public class BusinessLogic {
	
	public double calculateYearlySalary(EmployeeDetails employeedetails) {
		
		double yearlysalary = 0;
		yearlysalary = employeedetails.getMonthlySalary() * 12;
		return yearlysalary;
		
	}
	
	public double calculateAppraisal(EmployeeDetails employeedetails) {
		
		double appraisal = 0;
		
		if(employeedetails.getMonthlySalary() < 10000) {
			appraisal = 500;
		}else {
			appraisal = 1000;
		}
		
		return appraisal;
		
	}

}
