package com.ss.jb.AssignmentWeekend1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Asgmts234Functional {
    public static void main(String[] args) {
    	Asgmts234Functional af = new Asgmts234Functional();
    	
    	af.rightDigit(Arrays.asList(1, 22, 93)).forEach(x -> System.out.print(x + " "));
    	System.out.println();
    	af.rightDigit(Arrays.asList(16, 8, 886, 8, 1)).forEach(x -> System.out.print(x + " "));
    	System.out.println();
    	af.rightDigit(Arrays.asList(10, 0)).forEach(x -> System.out.print(x + " ")); 
    	System.out.println();
    	
    	af.doubling(Arrays.asList(1, 2, 3)).forEach(x -> System.out.print(x + " "));
    	System.out.println();
    	af.doubling(Arrays.asList(6, 8, 6, 8, -1)).forEach(x -> System.out.print(x + " "));
    	System.out.println();
    	af.doubling(Arrays.asList()).forEach(x -> System.out.print(x + " "));
    	System.out.println();
    	
    	af.noX(Arrays.asList("ax", "bb", "cx")).forEach(x -> System.out.print(x + " "));
    	System.out.println();
    	af.noX(Arrays.asList("xxax", "xbxbx", "xxcx")).forEach(x -> System.out.print(x + " "));
    	System.out.println();
    	af.noX(Arrays.asList("x")).forEach(x -> System.out.print(x + " "));
    	System.out.println();
    }
    
	/* 	THE OLD DAY
	 * public static int lastDigit(int n) { // return the last digit return
	 *  (n % 10); 
	 *  }
	 */
      
    public List<Integer> rightDigit(List<Integer> numInArray){
    	numInArray.replaceAll(n -> n % 10);
    	return numInArray;
    }
    
    public List<Integer> doubling(List<Integer> nInArr){
    	nInArr.replaceAll(n -> n * 2);
    	return nInArr;
    }

    public List<String> noX(List<String> strInArr) {
    	  return strInArr.stream()
    	          .map(x -> x.replaceAll("x", ""))
    	          .collect(Collectors.toList());
    }
}







