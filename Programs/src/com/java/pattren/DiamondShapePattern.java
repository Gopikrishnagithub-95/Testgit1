/**
 * 
 */
package com.java.pattren;

/**
 * @author gopi
 *
 */
public class DiamondShapePattern  {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int row=5,space;
		for(int i=0;i<row;i++) {
			for(int j=(row-i);j>=0;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();   
		}
		for(int i=row-1;i>=0;i--) {
			for(int j=0;j<=row-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();   
		}

	}

}
