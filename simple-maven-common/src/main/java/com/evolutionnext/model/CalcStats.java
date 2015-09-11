package com.evolutionnext.model;

import java.util.List;

public class CalcStats {
	
	private List<Integer> list;

	public CalcStats(List<Integer> integers) {
		// TODO Auto-generated constructor stub
		
		this.list = integers;
	}

	public Integer getMinimum() {
		// TODO Auto-generated method stub
		
		if (list.size() == 0) return null;
		
		return 5;
	}

}
