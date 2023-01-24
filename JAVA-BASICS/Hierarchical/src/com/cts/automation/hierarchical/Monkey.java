package com.cts.automation.hierarchical;

public class Monkey extends Animals {
public void monkeyInfo() {
	System.out.println();
}
public static void main(String[]arg) {
	Monkey species = new Monkey();
	species.monkeyInfo();
	species.animalInfo();
}
}
