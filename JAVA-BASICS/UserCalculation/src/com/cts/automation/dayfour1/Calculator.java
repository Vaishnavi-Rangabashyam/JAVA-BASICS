package com.cts.automation.dayfour1;

import java.util.Scanner;

public class Calculator {
	public static void main(String[]arg) {
		Scanner sc = new Scanner(System.in);
		int a;
		float b;
		System.out.println("Enter the value");
		a=sc.nextInt();
		b=sc.nextFloat();
		System.out.println("Addtion =" + (a+b));
		System.out.println("Subraction =" + (a-b));
		System.out.println("Multiplication =" + (a*b));
		System.out.println("Division =" + (a/b));
	}

}
