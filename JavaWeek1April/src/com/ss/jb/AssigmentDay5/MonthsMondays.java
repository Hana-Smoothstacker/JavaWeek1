package com.ss.jb.AssigmentDay5;

import java.time.Month;
import java.time.Year;
//import java.time.YearMonth;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjusters;

public class MonthsMondays {
    public static void main(String[] args) {
        int year = 2021;
        boolean isLeap = year % 4 == 0;
        
        LocalDateTime dt = LocalDateTime.of(year, 1, 1, 0, 0);//in years, months, days, seconds, and nanoseconds
        for (int i = 1; i <= 12; i++) {
        	Month m = dt.getMonth();
        	int days = m.length(isLeap);
        	System.out.println("Month " + i + ": " + days + " days");
        	dt = dt.plusMonths(1);//       	
        }	
        
	        Month month = Month.valueOf("March".toUpperCase());//hardcode the month here 	
	        System.out.printf("For the month of %s:%n", month);
	        LocalDate date = Year.now().atMonth(month).atDay(1).
	              with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
	        Month mi = date.getMonth();
	        while (mi == month) {
	            System.out.printf("%s%n", date);
	            date = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
	            mi = date.getMonth();
	        }	        
       
    }
 
    //JUST FOR PRACTICE
    public void testLocalDateTime() {
    	// Get the current date and time
    	LocalDateTime currentTime = LocalDateTime.now();
    	System.out.println("Current DateTime: " + currentTime);
    	
    	LocalDate date1 = currentTime.toLocalDate();
    	System.out.println("date1: " + date1);
    	
//    	Year year = currentTime.getYear();

    	Month month = currentTime.getMonth();
    	int day = currentTime.getDayOfMonth();
    	int seconds = currentTime.getSecond();

    	System.out.println("Month: " + month +"day: " + day +"seconds: " + seconds);

    	LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
    	System.out.println("date2: " + date2);

    	//12 december 2014
    	LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
    	System.out.println("date3: " + date3);
 
    	//22 hour 15 minutes
    	LocalTime date4 = LocalTime.of(22, 15);
    	System.out.println("date4: " + date4);

    	//parse a string
    	LocalTime date5 = LocalTime.parse("20:15:30");
    	System.out.println("date5: " + date5);
    }

//        Result:
//
//        Current DateTime: 2014-12-09T11:00:45.457
//        date1: 2014-12-09
//        Month: DECEMBERday: 9seconds: 45
//        date2: 2012-12-10T11:00:45.457
//        date3: 2014-12-12
//        date4: 22:15
//        date5: 20:15:30
}

