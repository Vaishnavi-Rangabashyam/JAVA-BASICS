package com.cts.automation.returntype;

import java.util.Scanner;

public class ReturnType {
	public String addStrings(String FirstName, String SurName)
	{
		return (FirstName+ "" + SurName);
	}
	
	public static void main(String[]arg) {
		Scanner sc = new Scanner(System.in);
		String FirstName;
		String LastName;
		System.out.println("Enter two Strings");
		FirstName =sc.next();
		LastName = sc.next();
		System.out.println("Add Two Strings");	
		ReturnType re = new ReturnType();
		String FullName = re.addStrings(FirstName, LastName);
		System.out.println(FullName);
	}

}
