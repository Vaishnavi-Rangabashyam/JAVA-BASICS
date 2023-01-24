package com.cts.automation.thisandsuperclass;

public class SuperClass extends ThisClass {
	public void munch () {
		System.out.println("Price of diaryMilk:");
		System.out.println(super.a);
		System.out.println("Price of munch:");
		System.out.println(super.b);
	}
	public static void main(String[]arg) {
		System.out.println("Printing the Price of Chocolates");
		SuperClass we = new SuperClass();
		we.munch();
	}

}
