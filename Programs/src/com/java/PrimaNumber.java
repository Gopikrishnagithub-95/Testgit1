package com.java;

public class PrimaNumber {
	
	public static void main(String args[]) {
		
		int n=7,temp=0;
		
		for(int x=1;x<=n;x++) {
			if(n%x == 0) {
				temp++;
			}
		}
		if(temp == 2) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}
		
	}

}
