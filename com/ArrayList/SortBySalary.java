//sorting by salary using compareTo() i.e Comparable
package com.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortBySalary {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
	    System.out.println("Enter the list size:");
		ArrayList<Employee> al= new ArrayList<Employee>();
		int n=sc.nextInt();
        System.out.println("Enter the list elements:");
		for(int i=0;i<n;i++) {
			int id=sc.nextInt();
			sc.nextLine();
			String name=sc.nextLine();
			double salary=sc.nextDouble();
			Employee e1=new Employee(id,name,salary);
			al.add(e1);
		}
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}
}
