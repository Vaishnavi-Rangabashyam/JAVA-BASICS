package com.cts.automation.string;

public class StringClass {
	public static void main (String[]arg ) {
		String s1= "A Quick Brown Dog Jumps Over the Lazy Fox ";
		System.out.println("String1: " + s1);
		System.out.println("Total length of String is: " + s1.length());
		System.out.println("char of Position 0 is: " + s1.charAt(0) );
		System.out.println("Index of char z is: " + s1.indexOf('z'));
		
		String s2 = "a quick brown dog jumps over the lazy fox";
		System.out.println("String2: " + s2);
		System.out.println("Is String1 equals String2? " + s1.equals(s2));
		System.out.println("Is String1 equals String2:Ignore Case? " + s1.equalsIgnoreCase(s2));
		System.out.println("Print SubString From Index 29: " + s1.substring(29));
		System.out.println("Print SubString Betweem 0 & 20: " + s1.substring(0, 20));
		System.out.println("Is String1 Empty? " + s1.isEmpty());
		System.out.println("Print the String1 in LowerCase: " +s1.toLowerCase());
		System.out.println("Print the String2 in UpperCase: " +s2.toUpperCase());
		System.out.println("Does String1 Starts with Quick? " +s1.startsWith("Quick"));
		System.out.println("Does String2 Starts with Fox? " + s2.endsWith("Fox"));
        System.out.println(s1.length());
        String s3 = s1.trim();
        System.out.println(s3.length());
	}

}
