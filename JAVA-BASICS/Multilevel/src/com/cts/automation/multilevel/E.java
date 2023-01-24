package com.cts.automation.multilevel;

public class E extends D {
int e = 115;
public void totalInfo() {
	System.out.println("Total Number is:");
	System.out.println(a+b+c+d+e);
}
public static void main(String[]arg) {
	E sum = new E();
	sum.totalInfo();
}
}
