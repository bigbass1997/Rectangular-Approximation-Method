/**
 * @author bigbass1997
 */
package com.bigbass1997.ram;

import java.util.LinkedList;

public class RAMEval {
	
	public double initial, min, max, n, x;
	
	private double getWidth(double min, double max, int n){
		return (max - min) / n;
	}
	
	public RAMEval(double initial, double min, double max, int n){
		this.initial = initial;
		this.min = min;
		this.max = max;
		this.n = n;
		this.x = getWidth(min, max, n);
	}
	
	public void evaluate(){
		LinkedList<Double> yList = RAMUtil.getList(min, max, x);
		
		System.out.println("LRAM=" + RAMUtil.LRAM(initial, yList, x));
		System.out.println("MRAM=" + RAMUtil.MRAM(initial, yList, x));
		System.out.println("RRAM=" + RAMUtil.RRAM(initial, yList, x));
	}
}
