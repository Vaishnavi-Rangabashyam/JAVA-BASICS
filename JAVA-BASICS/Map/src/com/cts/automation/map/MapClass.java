package com.cts.automation.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapClass {
	public static void main (String [] args) {
		Map <Integer,String> MarkDetails = new LinkedHashMap <Integer,String>();
		MarkDetails.put(78, "Calculating");
		MarkDetails.put(65, "The");
		MarkDetails.put(85, "MarkDetail");
		MarkDetails.put(77, "of");
		MarkDetails.put(80, "Student");
		Set<Integer> allkeys = MarkDetails.keySet();
		System.out.println("*******Printing The AllKeys*********");
		System.out.println(allkeys);
		int total = 0;
		for (Integer S1 : allkeys)
		{
			total = total + S1;
		}
		System.out.println("********Printing The Total Key********");
		System.out.println(total);
		System.out.println("********Combining The Strings Into A Single String*********");
		Collection<String> value = MarkDetails.values();
		System.out.println(value);
		for (String S2 : value)
		{
			System.out.print(S2 + " ");
		}
	}

}
