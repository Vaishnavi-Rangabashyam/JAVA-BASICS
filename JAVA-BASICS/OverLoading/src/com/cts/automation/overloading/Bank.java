package com.cts.automation.overloading;

public class Bank {
	public void bankInfo(String s) {
		System.out.println("%%%%%%%%%%%%%%bankInfo(String s)%%%%%%%%%%%%%");
		System.out.println("This is AXIS Bank Account For " + s);
	}
	public void bankInfo(String s , char y) {
		System.out.println("%%%%%%%%%%%%%%bankInfo(String s, char y)%%%%%%%%%%%%%");
		System.out.println("This is AXIS Bank Account For " + s);
		if (y=='F')
		{
			System.out.println("She is a Women");
		}
		else if (y=='M')
		{
			System.out.println("He is a Man");
		}
	}
	public void bankInfo(String s, char y, int a) {
		System.out.println("%%%%%%%%%%%%%%bankInfo(String s,char y, int a)%%%%%%%%%%%%%");
		System.out.println("This is AXIS Bank Account For " + s);
		if (y=='F')
		{
			System.out.println("She is a Women");
			System.out.println("Her Account Name is " + a);
		}
		else if (y=='M')
		{
			System.out.println("He is a Man");
			System.out.println("His Account Name is " + a);
		}

	}
	public static void main (String[]arg) {
		Bank rv = new Bank();
		rv.bankInfo("VAISHNAVI");
		rv.bankInfo("Vaishnavi", 'F');
		rv.bankInfo("Velu", 'M', 200);
		
	}


	

}
