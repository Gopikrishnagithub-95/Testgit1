package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		Thread t1=new Thread();
		//Thread test=new Test();
		
		
		
		Emp e1=new Emp();
		e1.setId(6);
		e1.setName("A");
		Emp e2=new Emp();
		e2.setId(4);
		e2.setName("A");
		Emp e3=new Emp();
		e3.setId(3);
		e3.setName("C");
		
		List<Emp> l1=new ArrayList<Emp>();
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		
		for(Emp emp:l1) {
		//	System.out.println(emp.getId() +" "+emp.getName());
		}
		
		List<Emp> l2=l1.stream().sorted((o1,o2)->{
			
			if(o1.getId() == o2.getId())
                return o1.getName().compareTo(o2.getName());
            else if(o1.getId() > o2.getId())
                return 1;
            else return -1;
			
		}).collect(Collectors.toList());
		for(Emp emp:l2) {
			//System.out.println(emp.getId() +" "+emp.getName());
		}
		Collections.sort(l1);
		for(Emp emp:l1) {
			System.out.println(emp.getId() +" "+emp.getName());
		}
		Collections.sort(l1,new Comp());
		for(Emp emp:l1) {
				System.out.println(emp.getId() +" "+emp.getName());
			}
	}

}
