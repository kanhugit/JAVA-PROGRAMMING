package com.ArrayList;
//sorting by Employees name (Ascending Order)by using compareTo() i.e comparable

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortByNameEmp3 {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter The List size:");
		ArrayList<Employee3> emp=new ArrayList<>();
		int n=sc.nextInt();
		System.out.println("Enter the List Elements(id,name,salary)");
		for(int i=0;i<n;i++) {
			int id=sc.nextInt();
			sc.nextLine();
			String name=sc.nextLine();
			double salary=sc.nextDouble();
			Employee3 e1=new Employee3(id,name,salary);
			emp.add(e1);
			
		}
		System.out.println("Original list of employee3"+emp);
		Collections.sort(emp);
		System.out.println("sorted list of employee3 by Name:"+emp);
	}
}
