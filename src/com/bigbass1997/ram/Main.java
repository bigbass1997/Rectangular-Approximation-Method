/**
 * <p>This program is used to quickly calculate the Left, Middle, and Right Rectangular Approximation Methods (RAM).</p>
 * <p>I would like to note that this program was created entirely from scratch in order to further conceptualize
 * what I learned in my AP Calculus class in terms of the RAM.</p>
 * 
 * @author bigbass1997
 */
package com.bigbass1997.ram;

import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String [] args){
		
		String func = getInput("Input Function:");
		double initial = Double.valueOf(getInput("Input Initial:"));
		int min = Integer.valueOf(getInput("Input Min:"));
		int max = Integer.valueOf(getInput("Input Max:"));
		int n = Integer.valueOf(getInput("Input n:"));
		
		(new RAMEval(func, initial, min, max, n)).evaluate();
		
		scanner.close();
	}
	
	public static String getInput(String text){
		System.out.println(text);
		String response = scanner.nextLine();
		
		return response;
	}
}
