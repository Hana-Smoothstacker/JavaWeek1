/**
 * 
 */
package com.ss.jb.W1D4.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.ss.jb.AssignmentDay4.Line;


/**
 * @author Hana Luong
 *
 */
public class LineTest {
	
	public static void main(String[] args){
	
		LineTest lineTest = new LineTest();
		lineTest.getSlopeTest();
		lineTest.getDistanceTest();
		lineTest.parallelToTest();
	}
	
	@Test
	public void getSlopeTest() {
		assertEquals(new Double(1), new Double((new Line(1, 1, 2, 2)).getSlope()));
		//assertNotEquals(new Double(0), new Double((new Line(3, 3, 3, 4)).getSlope()));//EXCEPTION
		assertEquals(new Double(0), new Double((new Line(4, 3, 6, 3)).getSlope()));
		assertNotEquals(new Double(1), new Double((new Line(4, 3, 6, 3)).getSlope()));
	}

	@Test
	public void getDistanceTest() {
		assertEquals(new Double(5), new Double((new Line(1, 1, 4, 5)).getDistance()));
		assertNotEquals(new Double(2), new Double((new Line(4, 3, 7, 7)).getDistance()));
	}
	

	@Test
	public void parallelToTest() {
		assertEquals(new Boolean(true), new Line(1, 2, 2, 2).parallelTo(new Line(4, 5, 6, 5)));
	}

}