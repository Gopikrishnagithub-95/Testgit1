package com.java;

public class Palendrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="aba";
		
		char[] arr=name.toCharArray();
		StringBuffer b=new StringBuffer();
		for(int x=arr.length-1;x >= 0;x--) {
			b.append(arr[x]);
		}
		System.out.println(b.toString());
		if(name.equals(b.toString())) {
			System.out.println("p");
		}

		int n2=178;
		int r=0,r2=n2;
		while(n2 != 0) {
			r2=n2%10;
			r=r*10+r2;
			n2=n2/10;
		}
		System.out.println(r);
	}

}
