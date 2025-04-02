package com.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//sorting all object using compare() i.e comparator
public class SortAllObjectEmp4 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the List Size:");
		ArrayList<Employee4> emp=new ArrayList<Employee4>();
		int n=sc.nextInt();
		System.out.println("Enter the list Elements(id,name,sal):");
		for(int i=0;i<n;i++) {
			int id=sc.nextInt();
			sc.nextLine();
			String name=sc.nextLine();
			double sal=sc.nextDouble();
			Employee4 e1=new Employee4(id,name,sal);
			emp.add(e1);
			
		}
		System.out.println("\nOriginal List Of Employees"+emp);
		Collections.sort(emp,new Employee4());
		System.out.println("\n Sorted List By id,name,sal"+emp);
	}

}
