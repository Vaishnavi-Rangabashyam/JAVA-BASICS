package com.cts.automation.whileloop;

public class While {
	public static void main (String[] args) {
		System.out.println("Printing In Reverse Order");
		String v = "The Way To Get Started Is To Quit Talking And Begin Doing.";
		int num = v.length();
		System.out.println(num);
		int i = num-1;
		System.out.println(i);
		while (i>=0)
		{
			System.out.print(v.charAt(i));
			i--;
		}
	}

}
