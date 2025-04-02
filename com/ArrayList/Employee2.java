//sorting by ID
package com.ArrayList;

public class Employee2 implements Comparable<Employee2> {

	int id;
	String name;
	double salary;
	public Employee2(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public String toString() {
		return "\nEmployee2 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public int compareTo(Employee2 o) {
		return this.id-o.id;
	}
	
}
