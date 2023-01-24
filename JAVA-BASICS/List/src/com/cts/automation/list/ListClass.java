package com.cts.automation.list;

import java.util.LinkedList;
import java.util.List;

public class ListClass {
	public static void main(String[] args) {
		String str [][] = {{"France","Blue","Italy","Indigo"},
				{"Paris","Purple","Ireland","Green"},
				{"India","Saffron","Belgium","Chocolate"}};
		List<String> gh = new LinkedList<String>();
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=3;j++)
			{
				gh.add(str[i][j]);
			}
		}
		System.out.println(gh);
	}
}


