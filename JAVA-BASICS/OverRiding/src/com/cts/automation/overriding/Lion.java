package com.cts.automation.overriding;

public class Lion extends Animals{
	int Eyes = 2;
	public void animalInfo(int x) {
		System.out.println("No of Brain:" + Brain);
		System.out.println("NO of Eyes:" + Eyes );
	}
	public static void main(String[]arg) {
		Lion king = new Lion();
		king.animalInfo(0);
	}

}
