package com.ArrayList;

import java.util.Comparator;

//sorting all Object in descending using Comparator i.e compare() 
public class Employee4 implements Comparator<Employee4> {
	int id;
	String name;
	double sal;
	public Employee4(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	public Employee4() {
		
	}
	public String toString() {
		return "\nEmployee4 [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	public int compare(Employee4 o1,Employee4 o2) {
	    // First sort by salary
		if(o1.sal>o2.sal)
			return 1;
		if(o1.sal<o2.sal)
			return -1;
		
       // If salary is equal, sort by name
		int n=o1.name.compareTo(o2.name);
		
		if(n==0)   // If name is also equal, sort by id
			return o1.id-o2.id;
		
		return n;
	}
}
