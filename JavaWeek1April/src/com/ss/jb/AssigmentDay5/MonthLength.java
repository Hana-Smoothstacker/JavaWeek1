package com.ss.jb.AssigmentDay5;

import java.util.Scanner;
import java.time.Month;
import java.time.Year;
import java.time.LocalDateTime;

public class MonthLength {

	public static void main(String[] args) {

		Scanner input = null;
		input = new Scanner(System.in);
		System.out.println("Enter year yyyy format: ");
		String year = input.next();
		int nYear = Integer.parseInt(year, 10);
		boolean isLeap = Year.isLeap(nYear);
		
	    LocalDateTime dt = LocalDateTime.of(nYear, 1, 1, 0, 0);//in years, months, days, seconds, and nanoseconds
	    for (int i = 1; i <= 12; i++) {
	    	Month m = dt.getMonth();
	    	int days = m.length(isLeap);
	    	System.out.println("Month " + i + ": " + days + " days");
	    	dt = dt.plusMonths(1);//       	
	    }		
		 input.close();
   }
}