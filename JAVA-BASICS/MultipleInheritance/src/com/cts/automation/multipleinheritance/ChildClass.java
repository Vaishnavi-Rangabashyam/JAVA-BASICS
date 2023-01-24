package com.cts.automation.multipleinheritance;

public class ChildClass implements IParent1, IParent2 {
	public void call() {
		IParent1.super.call();
		IParent2.super.call();
	}
	public static void main(String[] arg) {
		ChildClass re = new ChildClass();
		re.call();
	}

}
