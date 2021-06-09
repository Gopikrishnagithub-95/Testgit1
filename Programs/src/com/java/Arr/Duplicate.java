/**
 * 
 */
package com.java.Arr;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author gopi
 *
 */
public class Duplicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] strArray = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC","Servlets"};
		
		for(int i=0;i<strArray.length;i++) {
			
			for(int j=i+1;j<strArray.length;j++) {
				if(strArray[i].equals(strArray[j])) {
					System.out.println(strArray[i]);
				}
			}
			
		}
		
		HashSet<String> set=new HashSet<String>();
		for(String s:strArray) {
			boolean b=set.add(s);
			System.out.println(b);
		}
System.out.println(set);
List<String> l1=new ArrayList<String>(set);
System.out.println(l1);

String[] strarr= l1.toArray(new String[0]);
System.out.println(strarr);

	}

}
