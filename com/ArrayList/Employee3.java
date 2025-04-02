package com.ArrayList;
//sorting by Employees name (Ascending Order)by using compareTo() i.e comparable
public class Employee3 implements Comparable<Employee3> {

	int id;
	String name;
	double salary;
	public Employee3(int id,String name,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
	public String toString() {
		return "\nEmployee3 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public int compareTo(Employee3 o) {
		return this.name.compareTo(o.name);
		
	}
	
	
}
