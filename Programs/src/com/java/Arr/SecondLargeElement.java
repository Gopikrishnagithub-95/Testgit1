/**
 * 
 */
package com.java.Arr;

/**
 * @author gopi
 *
 */
public class SecondLargeElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 secondLargest(new int[] {47498, 14526, 74562, 42681, 75283, 45796});
	}

	private static void secondLargest(int[] arr) {
		int first=0,second=0;
		if(arr[0] >arr[1]) {
			first=arr[0];
			second=arr[1];
		}else {
			first=arr[1];
			second=arr[0];
		}
		
		for(int i=2;i<arr.length;i++) {
		
			if(arr[i] > first) {
				second=first;
				first=arr[i];
				
				
			}else if(arr[i] < first && arr[i] > second){
				
				second=arr[i];
				
			}
			
		}
		System.out.println(second);
		
	}

}
