package com.cts.automation.whileloop;

public class ForLoop {
	public static void main (String []args) {
		System.out.println("Printing Alternative Words:");
		String s = "MALAYALAM";
		int n = s.length();
		System.out.println(n);
		for(int i =1;i<=n-1;i=i+2)
		{
			System.out.println(s.charAt(i));
		}
	}

}
