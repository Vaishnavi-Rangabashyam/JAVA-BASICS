package com.cts.automation.array2d;

public class TwoDArray {
	public static void main (String [] args) {
		int a[][] = {{2 , 4 , 6 , 8 , 10 , 12 } , 
				{3 , 6 , 9 , 12 , 15 , 18 } , 
				{4 , 8 , 12 , 16 , 20 , 24 } };
		int b[][] = new int [3][6];
		System.out.println("Input Array of a[][]:");
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println("\n");
			for(int j=0;j<=a[i].length-1;j++)
			{
				System.out.print(a[i][j] + " ");
				b[i][j] = i*j*a[i][j];
			}
		}
		System.out.println("\n");
		System.out.println("Print the array value of i*j*a[][] in b[][]:");
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println("\n");
			for(int j=0;j<=a[i].length-1;j++)
			{
				System.out.print(b[i][j] + " ");
			}
		}
	}

}
