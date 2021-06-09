/**
 * 
 */
package com.java;

/**
 * @author gopi
 *
 */
public class Emp implements Comparable<Emp>{
	
	public int getId() {
		return id;
	}
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Emp() {
		// TODO Auto-generated constructor stub
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private int id;
	private String name;
	@Override
	public int compareTo(Emp o) {
		return this.name.compareTo(o.name);
	}

	
}
