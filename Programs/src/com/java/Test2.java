package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {

	public static void main(String[] args) {
		
		Emp e1=new Emp(1,"A");
		Emp e2=new Emp(2,"B");
		
		List<Emp> list=new ArrayList<Emp>();
		
		list.stream().filter(e->e.getAge() > 18).collect(Collectors.toList());
		List<String> names=list.stream().map(e->e.getName()).collect(Collectors.toList());
		
		@GetMapping("/getempdetails")
		public List<Emp> getempdetails(@Requestparam("empid") String empid){
			
			
			return new ArrayList<Emp>();
			
			
		}
		
		
		
		$ajax({
			
			url:"getempdetails?empid=5",
			method:"GET",
			
			response:(data){
			JSON.stringify();
		}
			
			
		});
		
		select deptid from depttable where deptname="hyd"
		
		select * from emp where deptid in (select deptid from depttable where deptname="hyd") order by empname ase/desc
		
		
		
		
		
		

	}

}
