/**
 * 
 */
package com.java;

import java.util.Comparator;

/**
 * @author gopi
 *
 */
public class Comp implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
				if(o1.getName().equals(o2.getName())) {
					if(o1.getId() == o2.getId()) {
						return 0;
					}else if(o1.getId() > o2.getId()) {
						return 1;
					}else {
						return -1;
					}
				}
		return 0;
	}

}
