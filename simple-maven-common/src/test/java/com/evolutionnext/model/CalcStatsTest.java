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
}
