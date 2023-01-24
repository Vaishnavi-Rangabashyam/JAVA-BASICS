package com.cts.automation.multipleinheritance;

public interface IParent1 {
	default void call() {
		System.out.println("Hello Parent1");
	}

}
