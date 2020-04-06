package com.sapient.week1;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CheckEvenTest {
	private CheckEven ck;
	
	@Before
	public void setup() {
		ck = new CheckEven();
	}
	
	@Test
	public void testNumberEven() {
		// TODO Auto-generated method stub
		boolean value = ck.check(6);
		assertTrue(value == true);
	}
	
	@Test
	public void testNumberOdd() {
		// TODO Auto-generated method stub
		boolean value = ck.check(7);
		assertTrue(value == false);
	}
	
	@Test
	public void testNumberNegativeEven() {
		// TODO Auto-generated method stub
		boolean value = ck.check(-6);
		assertTrue(value == true);
	}
	
	@Test
	public void testNumberNegativeOdd() {
		// TODO Auto-generated method stub
		boolean value = ck.check(-23);
		assertTrue(value == false);
	}
}
