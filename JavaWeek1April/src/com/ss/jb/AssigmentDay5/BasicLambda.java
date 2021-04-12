/**
 * 
 */
package com.ss.jb.AssigmentDay5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.lang.CharSequence;

/**
 * @author Hana Luong
 *
 */
public class BasicLambda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Instantiate class so I don't have to make all methods static
		BasicLambda l = new BasicLambda();
		
		// Make an array containing a few Strings. 
		List<String> arr = Arrays.asList("Canada", "APAP", "France", "UAE", "ALO", "Poland", "Ethiopia", "Egypt", "El Salvador", "USA");
		arr.forEach(x -> System.out.println(x + " "));
		
		//l.practice(arr);
		
		l.sortByLenghtAsc(arr);
		l.sortByLenghtDsc(arr);
		l.sortByFirstChar(arr);
		l.filterByOneChar(arr);
		l.oddEven();
		l.listStrings(arr);
	}
	
	//Sort it by length (i.e., shortest to longest)		
	public void sortByLenghtAsc(List<String> arr) {
	//The Collection:to store a group of objects and and manipulate those objects
	// such as searching, sorting, insertion, and deletion and more.
		Collections.sort(arr, (s1, s2) -> ( s1.length() - s2.length() ) );
		System.out.println("Sort by length (ascending): ");
		arr.forEach(x -> System.out.println(x));
	}
	
	//Sort it by length (i.e., longest to shortest)
	public void sortByLenghtDsc(List<String> arr) {
		Collections.sort(arr, (s1, s2) -> ( s2.length() - s1.length() ) );
		System.out.println("Sort by length (descending): ");
		arr.forEach(x -> System.out.println(x));
	}
	
	//sort alphabetically by the first character only
	//(Hint: charAt(0) returns the numeric code for the first character)
	public void sortByFirstChar(List<String> arr) {
		Collections.sort(arr, (s1, s2) -> ( s1.charAt(0) - s2.charAt(0) ) );
		System.out.println("Sort alphabetically by first character: ");
		arr.forEach(x -> System.out.println(x));		
	}
	
	public void filterByOneChar(List<String> arr) {
	//Strings that contain “e” first, everything else second. For now, put the code directly in the lambda.
	//(Hint: remember that the body of a lambda is allowed to have curly braces and a return statement.

		String ss = "e";
		CharSequence c = ss.subSequence(0, 1); 
		List<String> containCharE = arr.stream().filter(s -> s.contains(c)).collect(Collectors.toList());
		System.out.println("Filter by e: ");
		containCharE.forEach(x -> System.out.println(x));
		List<String> containNoCharE = arr.stream().filter(s -> !s.contains(c)).collect(Collectors.toList());
		System.out.println("Filter by no e: ");
		containNoCharE.forEach(x -> System.out.println(x));

	}
	
	//NOT ABLE TO DO THIS YET. 
	public void redo(List<String> arr) {
	//Arrays.sort(words, (s1,s2) -> Utils.yourMethod(s1,s2))
	}

	public void oddEven() {
		List<Integer> listOfIntegers = Arrays.asList(1, 5, 24, 7, 79);
		
		String str = listOfIntegers.stream().map( x -> {
			if( x%2 == 0) {
				return "e" + x + ",";
			}
			else {
				return "o" + x + ",";
			}
		}).collect(Collectors.joining());
		
		System.out.println("Even/odd: " + str);
	}
	
	//Given a list of Strings, write a method that returns a list of all strings that start with the 
	//letter 'a' (lower case) and have exactly 3 letters. TIP: Use Java 8 Lambdas and Streams API's.	
	public void listStrings(List<String> arr) {
		char c = 'a';//?
		List<String> filtered = arr.stream()
				.filter(s -> s.charAt(0) == c)
				.filter(s -> s.length() == 3)
				.collect(Collectors.toList());
		System.out.println("Filter by starting a: " );
		filtered.forEach(x -> System.out.println(x));
	}
	
	//Pratice before doing the homework	
	public void practice(List<String> arr) {
		//Practice first
		arr.forEach( x -> {
			System.out.println(x.toUpperCase());
		});
		
		// Try sort();
		List<String> ls = arr.stream().sorted().collect(Collectors.toList());
		ls.forEach(x -> System.out.print(x + " "));
	}
}
