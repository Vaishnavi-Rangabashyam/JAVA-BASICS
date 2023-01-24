package com.cts.automation.stringarray;

public class IntegerArray {
	public static void main(String[]args) {
		int arr[] = new int[] {17,52,33,4,5,6,7,8,9,10};
		System.out.println(arr.length);
		for(int i =0;i<=arr.length-2;i++)
		{
			System.out.println(arr[i] + " x arr[i+1] = " + arr[i]*arr[i+1]);
			System.out.println(arr[i+1]);
		}
	}

}
