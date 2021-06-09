/**
 * 
 */
package com.java;

/**
 * @author gopi
 *
 */
public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] arr= {1,2,4,5,6,7};
		int len=arr.length;
		int val=7;
		int init=0;
		
		int index=biranysearch(arr,init,len-1,val);
		System.out.println(index);
		
		
		
		
		
	}

	private static int biranysearch(int[] arr, int init, int len, int val) {
		
		if(len >= init) {
			
			int mid=init+(len-init)/2;
			
			if(arr[mid]== val) {
				return mid;
			}else if(arr[mid] > val) {
				
				return biranysearch(arr,init,mid-1,val);
			}else {
				return biranysearch(arr,mid+1,len,val);
			}
			
			
			
			
		}
		
		
		
		return -1;
	}

}
