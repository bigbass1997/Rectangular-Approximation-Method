/**
 * <p>This program is used to quickly calculate the Left, Middle, and Right Rectangular Approximation Methods.</p>
 * 
 * @author bigbass1997
 */
package com.bigbass1997.ram;

public class Main {
	
	public static double LRAM(double initial, double[] yList, double x){
		double total = initial;
		for(int i = 0; i < yList.length; i++){
			total += (yList[i] * x);
		}
		return total;
	}
	
	public static double MRAM(double initial, double[] yList, double x){
		double total = initial;
		for(int i = 0; i < yList.length; i++){
			double n1, n2;
			
			n1 = yList[i];
			
			try {
				n2 = yList[i + 1];
			} catch(Exception e){
				n2 = 0;
			}
			
			total += (((n1 + n2) / 2) * x);
		}
		return total;
	}
	
	public static double RRAM(double initial, double[] yList, double x){
		double total = initial;
		for(int i = 1; i < yList.length; i++){
			total += (yList[i] * x);
		}
		return total;
	}
	
	public static void main(String [] args){
		double initial = 0;
		double[] yList = new double[]{4, 3, 2, 1};
		double x = 1;
		
		System.out.println("LRAM=" + LRAM(initial, yList, x)); //returns 10.0
		System.out.println("MRAM=" + MRAM(initial, yList, x)); //returns 8.0
		System.out.println("RRAM=" + RRAM(initial, yList, x)); //returns 6.0
	}
}
