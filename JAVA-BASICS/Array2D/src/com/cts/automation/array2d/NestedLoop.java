package com.cts.automation.array2d;

public class NestedLoop {
	public static void main (String[] args) {
		int a[][] = {{2 , 4 , 6 , 8 } , 
				{3 , 6 , 9 , 12 } , 
				{4 , 8 , 12 , 16 } , 
				{5 , 10 , 15 , 20 } , 
				{6 , 12 , 18 , 24 } };
		int b[][] = new int [5][4];
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				b[i][j] = a[i][j];
			}
		}
		System.out.println("Print the array value of a[][] in b[][]:");
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println("\n");

			for(int j=0;j<=a[i].length-1;j++)
			{
				System.out.print(b[i][j] +" ");
			}
		}
	}

}
