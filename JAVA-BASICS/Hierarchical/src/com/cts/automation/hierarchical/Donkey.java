package com.cts.automation.hierarchical;

public class Donkey extends Animals {
	public void donkeyInfo() {
		System.out.println("I Am Inside the Donkey Class");
	}
	public static void main(String[]arg) {
		Donkey species = new Donkey();
		species.donkeyInfo();
		species.animalInfo();
		
	}

}
