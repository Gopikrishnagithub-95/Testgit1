/**
 * 
 */
package com.java.pattren;

/**
 * @author gopi
 *
 */
public class ReversePyramidStarPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
int row=5;
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=row-1-i;j++) {
				System.out.print("* ");
			}
			System.out.println();   
		}

	}

}
