/**
 * 
 */
package com.java;

/**
 * @author gopi
 *
 */
public class Bubblesort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
int[] arr= {1,3,6,2,9,8};


int[] arr2=bubblesort(arr);
for(int i=0;i<arr2.length;i++) {
	System.out.println(arr2[i]);
}
System.out.println(arr2);
		
		
	}

	private static int[] bubblesort(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				
				if(arr[j] > arr[j+1]) {
					
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
			
		}
		
		
		return arr;
	}

}
