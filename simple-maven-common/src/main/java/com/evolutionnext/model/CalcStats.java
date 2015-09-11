package com.evolutionnext.model;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.util.Collections;
import java.util.List;

public class CalcStats {
	
	private List<Integer> list;

	public CalcStats(List<Integer> integers) {
		// TODO Auto-generated constructor stub
		
		this.list = integers;
	}

	public Integer getMinimum() {
		// TODO Auto-generated method stub
		
		if (list == null || list.size() == 0) {
			return null;
		}	
	
//		int min = list.get(0);
//		for (Integer element: list){
//			if (min > element) {
//				min = element;
//			}
//		}
//				
//		return min;
		
		return Collections.min(list);
	}
}
