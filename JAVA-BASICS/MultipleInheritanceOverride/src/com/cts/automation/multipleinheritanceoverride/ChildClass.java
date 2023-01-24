package com.cts.automation.multipleinheritanceoverride;

public class ChildClass implements IParent1,IParent2 {
	
	
	
	@Override
	public void call1() {
		System.out.println("IParent1 is a Father of Child");
	}
	
	@Override
	public void call2() {
		System.out.println("IParent2 is a Mother of Child");
	}
	public static void main(String[]arg) {
		ChildClass re = new ChildClass();
		re.call1();
		re.call2();
	}

}
