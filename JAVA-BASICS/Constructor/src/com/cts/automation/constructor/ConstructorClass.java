package com.cts.automation.constructor;

import java.util.Scanner;

public class ConstructorClass {
	public ConstructorClass(char y) {
		if(y=='F') {
			System.out.println("She is a Woman");
		}
		else if (y=='M') {
			System.out.println("He is a Man");
		}
	}

		public ConstructorClass(String s) {
			System.out.println("Her Name is:" +s);
		}
		public ConstructorClass(char c , int a) {
			System.out.println("Her Initial is:" +c);
			System.out.println("Her ID No:" +a);
		}
		public ConstructorClass(long d) {
			System.out.println("Her Phone No:" +d);
		}
					
		public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			char y;
			System.out.println("Enter the Gender");
			y=sc.next().charAt(0);
			ConstructorClass rv1=new ConstructorClass("Vaishnavi");
			ConstructorClass rv2=new ConstructorClass('R', 65432);
			ConstructorClass rv3=new ConstructorClass(9876543210l);
		}


}
