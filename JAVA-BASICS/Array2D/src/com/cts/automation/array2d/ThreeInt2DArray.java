package com.cts.automation.array2d;

public class ThreeInt2DArray {
	public static void main(String[]args) {
		int a[][] = {{2 , 4 , 6 , 8 , 10} , 
				{3 , 6 , 9 , 12 , 15 } , 
				{4 , 8 , 12 , 16 , 20 } , 
				{5 , 10 , 15 , 20 , 25 } };
		int b[][] = {{6 , 12 , 18 , 24 , 30 } , 
				{7 , 14 , 21 , 28 , 35 } , 
				{8 , 16 , 24 , 32 , 40 } , 
				{9 , 18 , 27 , 36 , 45 } };
		int c[][] = new int [4][5];
		System.out.println("Product Of 2D Arrays:");
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println("\n");
			for(int j=0;j<=a[i].length-1;j++)
			{
				c[i][j] = a[i][j]*b[i][j];
				System.out.print(c[i][j] + " ");
			}
		}
	}
}
