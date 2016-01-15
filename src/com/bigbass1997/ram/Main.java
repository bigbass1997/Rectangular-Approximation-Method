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
		//Currently setup to evaluate the RAM's for the function based on: n=10^i where 1 <= i <= 5, min=0, max=4.
		for(int i = 1; i <= 5; i++){
			int n = (int) Math.pow(10, i);
			
			(new RAMEval(0, 0, 4, n)).evaluate(); //Creates new object and immediately begins evaluation process of that object.
		}
	}
}
