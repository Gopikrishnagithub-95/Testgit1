/**
 * 
 */
package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author gopi
 *
 */
public class CommonElements2List {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		  
	        // Add values in ArrayList
	        list1.add("Hii");
	        list1.add("Geeks");
	        list1.add("for");
	        list1.add("Geeks");
	  
	        // print list 1
	        System.out.println("List1: "
	                           + list1);
	  
	        // Create ArrayList list2
	        ArrayList<String>
	            list2 = new ArrayList<String>();
	  
	        // Add values in ArrayList
	        list2.add("Hii");
	        list2.add("Geeks");
	        list2.add("Gaurav");
	  
	        // print list 2
	        System.out.println("List2: "
	                           + list2);
	  
	        // Find the common elements
	        list1.retainAll(list2);
	        
	        System.out.println(list1);
	        
	        
	        for(String s:list1) {
	        	if(list2.contains(s)) {
	        		System.out.println("s "+s);
	        	}
	        }
	        
	        List<String> finalarr=list1.stream().filter(list2::contains).collect(Collectors.toList());
	        List<String> finalarr2=list1.stream().filter(l1->list2.contains(l1)).collect(Collectors.toList());
	        
	        System.out.println(finalarr);
	        System.out.println(finalarr2);
	        
	        
	}

}
