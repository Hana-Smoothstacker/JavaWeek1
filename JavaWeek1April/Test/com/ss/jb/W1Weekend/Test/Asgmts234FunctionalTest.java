package com.ss.jb.W1Weekend.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;
import org.junit.Test;
import com.ss.jb.AssignmentWeekend1.Asgmts234Functional;

public class Asgmts234FunctionalTest {
	public static void main(String[] args) {
		Asgmts234FunctionalTest fTest  = new Asgmts234FunctionalTest();		
		fTest.rightDigit();
//		fTest.doubling();
//		fTest.noX();
	}
	
	@Test
	public void rightDigit() {
		Asgmts234Functional f = new Asgmts234Functional();
		assertEquals(Arrays.asList(1,2,3), f.rightDigit(Arrays.asList(1,22,93)));
		assertEquals(Arrays.asList(6,8,6,8,1), f.rightDigit(Arrays.asList(16,8,886,8,1)));
		assertNotEquals(Arrays.asList(1,1), f.rightDigit(Arrays.asList(10,0)));
		assertNotEquals(Arrays.asList(0), f.rightDigit(Arrays.asList(5)));	
	}
	
	@Test
	public void doubling() {
		Asgmts234Functional f = new Asgmts234Functional();
		assertEquals(Arrays.asList(2,4,6), f.doubling(Arrays.asList(1,2,3)));
		assertEquals(Arrays.asList(12, 16, 12, 16, -2), f.doubling(Arrays.asList(6, 8, 6, 8, -1)));
		assertNotEquals(Arrays.asList(1), f.doubling(Arrays.asList()));
		assertNotEquals(Arrays.asList(5,3,2), f.doubling(Arrays.asList(5,3,1)));
	}

	@Test
	public void noX() {
		Asgmts234Functional f = new Asgmts234Functional();
		assertEquals(Arrays.asList("a", "bb", "c"), f.noX(Arrays.asList("ax", "bb", "cx")));
		assertEquals(Arrays.asList("a", "bb", "c"), f.noX(Arrays.asList("xxax", "xbxbx", "xxcx")));
		assertNotEquals(Arrays.asList("a", "bb", "c"), f.noX(Arrays.asList("xxabx", "axbxbx", "axxcx")));
		assertNotEquals(Arrays.asList("a", "bb", "c"), f.noX(Arrays.asList("aax", "bbxbx", "cccx")));	
	}

}