package com.ss.jb.W1Weekend.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.ss.jb.AssignmentWeekend1.Asgmt1Lambdas;
import com.ss.jb.AssignmentWeekend1.Asgmt1Lambdas.performOperation;

public class Asgmt1LambdasTest {
	
	public static void main(String[] args) {
		Asgmt1LambdasTest lamTest = new Asgmt1LambdasTest();
		
		lamTest.isPrimeTest();
		lamTest.isOddTest();
		lamTest.isPalindromeTest();
	}
	
	@Test
	public void isOddTest() {
		Asgmt1Lambdas l = new Asgmt1Lambdas();
		performOperation op = l.isOdd();
		// or Asgmt1Lambdas.performOperation op = l.isOdd();
		
		assertEquals(new Integer(0), new Integer(op.check(4)));
		assertEquals(new Integer(1), new Integer(op.check(5)));	
		
		assertNotEquals(new Integer(1), new Integer(op.check(4)));
		assertNotEquals(new Integer(0), new Integer(op.check(5)));	
	}
	
	@Test
	public void isPrimeTest() {
		Asgmt1Lambdas l = new Asgmt1Lambdas();
		performOperation op = l.isPrime();
		
		assertEquals(new Integer(0), new Integer(op.check(4)));
		assertEquals(new Integer(1), new Integer(op.check(5)));	
		
		assertNotEquals(new Integer(1), new Integer(op.check(4)));
		assertNotEquals(new Integer(0), new Integer(op.check(5)));	
	}

	@Test
	public void isPalindromeTest() {
		Asgmt1Lambdas l = new Asgmt1Lambdas();
		performOperation op = l.isPalindrome();
		
		assertEquals(new Integer(0), new Integer(op.check(4545)));
		assertEquals(new Integer(1), new Integer(op.check(5445)));	
		
		assertNotEquals(new Integer(1), new Integer(op.check(4545)));
		assertNotEquals(new Integer(0), new Integer(op.check(5445)));	
	}

}