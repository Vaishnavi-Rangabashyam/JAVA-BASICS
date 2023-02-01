package com.cts.automation.fibonacci;

import java.util.Scanner;

public class NthFibonacci {
	public static void main(String args[]) {
		int n,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		n=sc.nextInt();
		
		
		int values[] = new int[n];
		values[0] = 0;
		values[1] = 1;
		
		for(i=2;i<n;i++) {
			values[i] = values [i-1] + values [i-2];
		}
		
		System.out.println("The nth fibonacci number is" + values [n-1]);
	}

}
