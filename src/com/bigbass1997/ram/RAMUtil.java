/**
 * @author bigbass1997
 */
package com.bigbass1997.ram;

import java.util.LinkedList;

public class RAMUtil {
	
	public static double LRAM(double initial, LinkedList<Double> yList, double x){
		double total = initial;
		for(int i = 0; i < yList.size(); i++){
			total += (yList.get(i) * x);
		}
		return total;
	}
	
	public static double MRAM(double initial, LinkedList<Double> yList, double x){
		double total = initial;
		for(int i = 0; i < yList.size(); i++){
			double n1, n2;
			
			n1 = yList.get(i);
			
			try {
				n2 = yList.get(i + 1);
			} catch(Exception e){
				n2 = 0;
			}
			
			total += (((n1 + n2) / 2) * x);
		}
		return total;
	}
	
	public static double RRAM(double initial, LinkedList<Double> yList, double x){
		double total = initial;
		for(int i = 1; i < yList.size(); i++){
			total += (yList.get(i) * x);
		}
		return total;
	}
	
	/**
	 * <p>Gets the list of y values based on a certain width, according to the "function" that is hard coded into this method.</p>
	 * 
	 * @param min lowest x value
	 * @param max highest x value
	 * @param width value used to increase x incrementally until x reaches max
	 * @return ordered list of y values based on hard coded "function" using x
	 */
	public static LinkedList<Double> getList(double min, double max, double width){
		LinkedList<Double> list = new LinkedList<Double>();
		
		double x = min;
		while(x <= max){
			
			//At the moment, function must be hard coded into the program.
			list.add((x*x) + 1);
			
			x += width;
		}
		
		return list;
	}
}
