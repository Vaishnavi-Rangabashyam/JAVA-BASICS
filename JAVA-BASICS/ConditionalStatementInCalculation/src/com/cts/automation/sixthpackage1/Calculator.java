package com.cts.automation.sixthpackage1;

import java.util.Scanner;

public class Calculator {
public void performCalculation(int x,int y,char c) {
	if(c=='+')
	{
		System.out.println("Addition is:");
		System.out.println(x+y);
	}
	else if (c=='-')
	{
		System.out.println("Subraction is:");
		System.out.println(x-y);
	}
	else if (c=='*')
	{
		System.out.println("Multiplication is:");
		System.out.println(x*y);
	}
	else if (c=='/')
	{
		System.out.println("Division is:");
		System.out.println(x/y);
	}
	else
	{
		System.out.println("Invalid Character");
	}
}
public static void main(String[]arg) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Three Values");
	int x=sc.nextInt();
	int y=sc.nextInt();
	char c=sc.next().charAt(0);
	Calculator math = new Calculator();
	math.performCalculation(x, y, c);
}
}
