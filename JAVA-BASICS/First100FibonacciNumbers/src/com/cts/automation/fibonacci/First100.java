package com.cts.automation.fibonacci;

public class First100 {
	public static void main(String[]args) {
		int n,a = 0,b = 1,c=1;
		System.out.println("First 100 Numbers of Fibonacci:");
		for (int i=1;i<=100;i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(a +" ");
		}
	}

}
