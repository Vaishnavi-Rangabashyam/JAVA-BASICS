package com.cts.automation.hierarchical;

public class Crocodile extends Animals {
	public void crocodileInfo() {
		System.out.println("I Am Inside the Crocodile Class");
	}
	public static void main (String[]arg) {
		Crocodile species = new Crocodile();
		species.crocodileInfo();
		species.animalInfo();
	}

}
