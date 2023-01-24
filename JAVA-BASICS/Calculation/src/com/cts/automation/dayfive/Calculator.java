package com.cts.automation.dayfive;

import java.util.Scanner;

public class Calculator {
public void calculate(int a ,float b) {
	System.out.println("Addtion =" + (a+b));
	System.out.println("Subraction =" + (a-b));
	System.out.println("Multiplication =" + (a*b));
	System.out.println("Division =" + (a/b));
}
public static void main(String[]arg) {
	Scanner sc = new Scanner(System.in);
	int c;
	float d;
	System.out.println("Enter the value");
	c=sc.nextInt();
	d=sc.nextFloat();
	Calculator er = new Calculator();
	er.calculate(c, d);
	
}
}
