package com.evolutionnext.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CalcStatsTest {
	
	@Test
	public void testMinimumValueWithNoElements(){
		List<Integer> integers = new ArrayList<Integer>();		
		CalcStats calcStats = new CalcStats(integers);
		assertNull(null,calcStats.getMinimum());		
	}
	
	@Test
	public void testMinimumValueWithOneElement(){
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(5);		
		CalcStats calcStats = new CalcStats(integers);
		assertEquals(new Integer(5),calcStats.getMinimum());		
	}	

	@Test
	public void testMinimumValueWithTwoElements(){
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(5);		
		integers.add(-10);
		CalcStats calcStats = new CalcStats(integers);
		assertEquals(new Integer(-10),calcStats.getMinimum());		
	}	

	@Test
	public void testMinimumValueWithMultipleElements(){
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(5);		
		integers.add(3);
		integers.add(1);
		integers.add(7);
		CalcStats calcStats = new CalcStats(integers);
		assertEquals(new Integer(1),calcStats.getMinimum());		
	}
	@Test
	public void testMinimumValueWithNegativeElements(){
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(-1);		
		integers.add(-2);
		integers.add(-3);
		integers.add(-15);
		CalcStats calcStats = new CalcStats(integers);
		assertEquals(new Integer(-15),calcStats.getMinimum());		
	}
	@Test
	public void testMinimumValueWithNullAtConstruction(){
		CalcStats calcStats = new CalcStats(null);
		assertNull(calcStats.getMinimum());		
	}	
}
