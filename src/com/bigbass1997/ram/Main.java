/**
 * <p>This program is used to quickly calculate the Left, Middle, and Right Rectangular Approximation Methods (RAM).</p>
 * <p>I would like to note that this program was created entirely from scratch in order to further conceptualize
 * what I learned in my AP Calculus class in terms of the RAM.</p>
 * 
 * @author bigbass1997
 */
package com.bigbass1997.ram;

public class Main {
	
	public static void main(String [] args){
		for(int i = 1; i <= 5; i++){
			int n = (int) Math.pow(10, i);
			
			System.out.println("----Eval of n=" + n + "----");
			(new RAMEval(0, 0, 4, n)).evaluate();
			System.out.println();
		}
	}
}
