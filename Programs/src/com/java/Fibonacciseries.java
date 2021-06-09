/**
 * 
 */
package com.java;

/**
 * @author gopi
 *
 */
public class Fibonacciseries {

	/**
	 * @param args
	 */
int	it=10;
	public static void main(String[] args) {
		
		
		for(int x=1;x<=10;x++) {
			System.out.print(feb(x)+" ");
		}

	}
static int feb(int num) {
	int temp=0,n1=1,n2=1;
	
	if(num == 1 || num==2) {
		return 1;
	}
	
	for(int k=3;k<=num;k++) {
		temp=n1+n2;
		n1=n2;
		n2=temp;
		
	}
	
	return temp;
	
}

}
