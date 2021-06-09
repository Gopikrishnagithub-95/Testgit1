/**
 * 
 */
package com.java.pattren;

/**
 * @author gopi
 *
 */
public class RightTriangleStarPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int row=5;
		
		for(int i=0;i<row;i++) {
			
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();   
		}
System.out.println("pascal");
for(int i=0;i<row;i++) {
	
	for(int j=0;j<=i;j++) {
		System.out.print("* ");
	}
	System.out.println();   
}

for(int i=0;i<row;i++) {
	
	for(int j=row-i;j>0;j--) {
		System.out.print("* ");
	}
	System.out.println();   
}

System.out.println("with numbers");
int num=1;
for(int i=0;i<row;i++) {
	 num=1;
	for(int j=0;j<=i;j++) {
		System.out.print(num+" ");
		num++;
	}
	System.out.println();   
}

System.out.println("with numbers pattren -2");
 num=1;
for(int i=0;i<row;i++) {
	// num=1;
	for(int j=0;j<=i;j++) {
		System.out.print(num+" ");
		num++;
	}
	System.out.println();   
}

System.out.println("with numbers pattren -3");
num=1;
for(int i=1;i<=row;i++) {
	// num=1;
	for(int j=1;j<=i;j++) {
		System.out.print(i+" ");
		num++;
	}
	System.out.println();   
}
System.out.println("with numbers pattren -4");
num=1;
for(int i=row;i>=1;i--) {
	// num=1;
	for(int j=row;j>=i;j--) {
		System.out.print(j+" ");
		//num++;
	}
	System.out.println();   
}
	}
	

}
