//Sort Custom Object using Comparable  i.e compareTo()
package com.ArrayList;

public class Employee implements Comparable<Employee>{

	int id;
	String name;
	double salary;
	
	public Employee(int id,String name,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
	

	public String toString() {
		return "\nEmployee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}


	public int compareTo(Employee o) {

		if(this.salary>o.salary)
			return -1;
		if(this.salary<o.salary)
			return 1;
		return 0;
	}
}
