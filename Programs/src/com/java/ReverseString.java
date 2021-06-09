/**
 * 
 */
package com.java;

/**
 * @author gopi
 *
 */
public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			String s="gopi";
			byte[] b1=s.getBytes();
			byte[] re=new byte[s.length()];
			
			for(int i=0;i<s.length();i++) {
				
				re[i]=b1[s.length()-i-1];
			}
			
			System.out.println(new String(re));  // StringBuilder,buffer,collection  reverse methods
			
	}

}
