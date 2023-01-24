package com.cts.automation.interface1;

public class ImplementationClass implements IFirstInterface {
	public void sample(String s) {
		System.out.println("Her Name is:" + s);
	}
	public void sample(char c) {
		System.out.println("Her Initial is :" + c);
	}
	public void sample (int x) {
		System.out.println("Her Age is:" + x);
	}
	public static void main(String[]arg) {
		IFirstInterface re = new ImplementationClass();
		re.sample("VAISHNAVI");
		re.sample('R');
		re.sample(23);
	}

}
