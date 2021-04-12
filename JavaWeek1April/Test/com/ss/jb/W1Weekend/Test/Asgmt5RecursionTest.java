package com.ss.jb.W1Weekend.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import com.ss.jb.AssignmentWeekend1.Asgmt5Recursion;

public class Asgmt5RecursionTest {

	public static void main(String[] args) {
		Asgmt5RecursionTest rTest  = new Asgmt5RecursionTest();		
		rTest.groupSumClump();
	}	
		
	@Test
	public void groupSumClump() {
		Asgmt5Recursion r = new Asgmt5Recursion();
		
		
		assertEquals((true), r.groupSumClump(0, new int[]{2, 4, 8}, 10, 0));
		assertEquals((false), r.groupSumClump(0, new int[]{1, 0, 4, 0, 1}, 14, 0));
		
		assertNotEquals((true), r.groupSumClump(0, new int[]{2, 4, 1, 1}, 14, 0));
		assertNotEquals((false), r.groupSumClump(0, new int[]{1, 2, 4, 8, 1}, 14, 0));	
	}	
}