package com.cts.automation.yearcalculation;

public class YearCalculation {
	public static void main (String[]arg)
	{
		int pastYear = 1999, preYear = 2023;
		int pastMonth = 6 , preMonth = 2;
		int pastDay = 30, preDay = 8;
		int n = 12;
		int arr[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31,30,31};

		int Year = preYear - pastYear ;
		//if(Year%4)

		System.out.println(Year);

		int Month = preMonth - pastMonth;
		System.out.println(Month);

		if(Month<0)
		{			
			Year = Year-1;
			//System.out.println("Current year:" + Year + "years");
			Month = n+Month;
			System.out.println(Month);
		}

		int Day = preDay - pastDay;
		System.out.println(Day);
		if(Day<0)
		{
			Month = Month -1;
			//System.out.println("Current Month:" + Month + "months");
			Day = arr[Month-1] +Day;
		}

		System.out.println("You are:" + Year + " Years, " + Month + " Months, " + Day + " Days Old" );






		//System.out.println(Year-1);


	}

}
