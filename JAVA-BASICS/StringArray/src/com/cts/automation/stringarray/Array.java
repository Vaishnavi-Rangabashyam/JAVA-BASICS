package com.cts.automation.stringarray;

public class Array {
	public static void main(String[] args) {
		int arr[] = new int[] {15,25,35,47,55,68,79,83,94,108};
		System.out.println("Multiples of 5");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i] + " x 5 = " + arr[i]*5);
		}
	}

}
