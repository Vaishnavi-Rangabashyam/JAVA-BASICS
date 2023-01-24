package com.cts.automation.fifthpackage;

public class EmployeeDetails extends CompanyDetails{
public void EmployeeInfo() {
	System.out.println("Employee Name is Vaishnavi Rangabashyam");
}
public static void main(String[]arg) {
	EmployeeDetails re = new EmployeeDetails();
	re.CompanyInfo();
	re.CompanyAddress();
	re.EmployeeInfo();
}
}
