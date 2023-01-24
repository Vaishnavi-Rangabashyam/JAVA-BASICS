package com.cts.automation.multipleinheritance;

public interface IParent2 {
	default void call() {
		System.out.println("Hello Parent2");
	}

}
