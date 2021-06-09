/**
 * 
 */
package com.java;

/**
 * @author gopi
 *
 */
public class PreserveSpaceString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		  reverseString("I Am Not String");

	}

	private static void reverseString(String str) {
		char[] c1=str.toCharArray();
		char s='a';
		Character.isUpperCase(s);
		char[] c2=new char[c1.length];
		for(int i=0;i<c1.length;i++) {
			
			if(c1[i] == ' ') {
				
				c2[i]=c1[i];
				
			}
			
		}
int j=c1.length-1;
for(int i=0;i<c1.length;i++) {
			
			if(c1[i] != ' ') {
				
				if(c2[j] == ' ') {
					j--;
				}
				c2[j] = c1[i];
				j--;
			}
			
		}
		System.out.println(c2);
	}

}
