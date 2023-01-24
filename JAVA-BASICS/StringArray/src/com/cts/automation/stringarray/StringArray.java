package com.cts.automation.stringarray;

import java.util.Scanner;

public class StringArray {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String arr[] = new String [8];
		System.out.println("*******Initializing array*******");
		System.out.println("Enter "+arr.length+" string values");
		for(int i =0; i<arr.length;i++)
		{
			arr[i]=sc.nextLine();
		}
		System.out.println("********display array elements******");
		System.out.println("Entered Strings are in Reverse Order:");
		for (int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]+"\t");
		}
	}

}
