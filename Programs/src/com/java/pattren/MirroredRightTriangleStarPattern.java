/**
 * 
 */
package com.java.pattren;

/**
 * @author gopi
 *
 */
public class MirroredRightTriangleStarPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
int row=5;
		
		for(int i=0;i<=row;i++) {
			
			for(int j=1;j<=row-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();   
		}
		//-----------------------------------
		System.out.println("Right Down Mirror Star Pattern");   
for(int i=0;i<=row;i++) {
			
			
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=row-i;j++) {
				System.out.print("*");
			}
			System.out.println();   
		}
	}

}
