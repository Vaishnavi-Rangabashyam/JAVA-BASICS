package com.cts.automation.sixthpackage;

import java.util.Scanner;

public class ConditionalStatement {
	public static void main(String[] args) {
		int x,y,z;
		Scanner sc=new Scanner(System.in);
		System.out.println("To Find Smallest Number Of Three Integer");
		System.out.println("Enter Three Integer Numbers");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		if(x<y)
		{
			if(x<z)
			{
				System.out.println("x is smaller");
			}
			else// z is smaller than x
			{
				System.out.println("z is smaller");
			}
		}
		else  // y is smaller than x
		{   
			if(y<z)
			{
				System.out.println("y is smaller");
			}
			else
			{
				System.out.println("z is smaller");
			}
		}
	}
}


