package com.cts.automation.setofstring;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetOfString {
	public static void main(String[] args) {
		Set <String> set = new LinkedHashSet<String>();
		String [] strArr = { "Your" , "Time" , "is" , "limited" , "so" , "dont't" , "waste" , "it" , "living" , "someone" , "else's" , "life."};
		for(String total : strArr)
		{
			System.out.print(total + " ");
		}
		System.out.println("\n");
		System.out.println("*********Assigning alternate words in string array to LinkedHashSet");
		for(int i=0;i<=strArr.length-1;i=i+2)
		{
			set.add(strArr[i] + " ");
			System.out.println(strArr[i]);
		}
		System.out.println("*********Using ForEach to Print Set*********");
		for (String total : set)
		{
			System.out.print(total);
		}
	}

}
